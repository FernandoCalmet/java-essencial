package Excercises.POO.BBDD_JDBC.src.ConsultasPreparadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MysqlBD {
    public static void main(String[] args) throws SQLException {
        Productos listaProductos = new Productos();
        listaProductos.MostrarPorCategoria("Fruta");
        listaProductos.MostrarPorCodigo(1);
    }
}

class ConexionBD {
    private Connection conexionBD;

    public ConexionBD() throws SQLException {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "root");
        conexionBD = conexion;
    }

    public Connection Conectar() {
        try {
            return conexionBD;
        } catch (Exception ex) {
            ex.printStackTrace();
            conexionBD = null;
            return conexionBD;
        }
    }
}

class Productos {
    public Productos() {
    }

    public void MostrarPorCategoria(String pCategoria) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        PreparedStatement declaracionPreparada = conexion.Conectar()
                .prepareStatement("SELECT codigo, nombre, categoria FROM productos WHERE categoria = ?");
        declaracionPreparada.setString(1, pCategoria);
        ResultSet resultadoSet = declaracionPreparada.executeQuery();
        while (resultadoSet.next()) {
            System.out.println(resultadoSet.getInt("codigo") + " " + resultadoSet.getString("nombre") + " "
                    + resultadoSet.getString("categoria"));
        }
        resultadoSet.close();
    }

    public void MostrarPorCodigo(int pCodigo) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        PreparedStatement declaracionPreparada = conexion.Conectar()
                .prepareStatement("SELECT codigo, nombre, categoria FROM productos WHERE codigo = ?");
        declaracionPreparada.setInt(1, pCodigo);
        ResultSet resultadoSet = declaracionPreparada.executeQuery();
        while (resultadoSet.next()) {
            System.out.println(resultadoSet.getInt("codigo") + " " + resultadoSet.getString("nombre") + " "
                    + resultadoSet.getString("categoria"));
        }
        resultadoSet.close();
    }

    public void Agregar(String pNombre, String pCategoria) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        PreparedStatement declaracionPreparada = conexion.Conectar()
                .prepareStatement("INSERT INTO productos (nombre, categoria) VALUES(?, ?)");
        declaracionPreparada.setString(1, pNombre);
        declaracionPreparada.setString(2, pCategoria);
        System.out.println("El producto se agrego correctamente");
    }

    public void Modificar(int pCodigo, String pNombre, String pCategoria) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        PreparedStatement declaracionPreparada = conexion.Conectar()
                .prepareStatement("UPDATE productos SET nombre = ?, categoria = ? WHERE codigo = ?");
        declaracionPreparada.setString(1, pNombre);
        declaracionPreparada.setString(2, pCategoria);
        declaracionPreparada.setInt(3, pCodigo);
        System.out.println("El producto se modifico correctamente");
    }

    public void Eliminar(int pCodigo) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        PreparedStatement declaracionPreparada = conexion.Conectar()
                .prepareStatement("DELETE FROM productos WHERE codigo = ?");
        declaracionPreparada.setInt(1, pCodigo);
        System.out.println("El producto se elimino correctamente");
    }
}