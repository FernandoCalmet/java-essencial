package Excercises.POO.BBDD_JDBC.src.Acceso;

import java.sql.*;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class MysqlBD {

    public static void main(String[] args) throws SQLException {
        Productos listaProductos = new Productos();
        listaProductos.MostrarTodos();
        listaProductos.Agregar("Queso", "Lacteo");
        listaProductos.MostrarTodos();
        listaProductos.Modificar(3, "Papa", "Verduras");
        listaProductos.MostrarTodos();
        listaProductos.Eliminar(3);
        listaProductos.MostrarTodos();
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

    public void MostrarTodos() throws SQLException {
        ConexionBD conexion = new ConexionBD();
        Statement declaracion = conexion.Conectar().createStatement();
        ResultSet resultadoSet = declaracion.executeQuery("SELECT * FROM productos");
        while (resultadoSet.next()) {
            System.out.println(resultadoSet.getInt("codigo") + " " + resultadoSet.getString("nombre") + " "
                    + resultadoSet.getString("categoria"));
        }
        resultadoSet.close();
    }

    public void Agregar(String pNombre, String pCategoria) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        Statement declaracion = conexion.Conectar().createStatement();
        declaracion.executeUpdate(
                "INSERT INTO productos (nombre, categoria) VALUES('" + pNombre + "', '" + pCategoria + "')");
        System.out.println("El producto se agrego correctamente");
    }

    public void Modificar(int pCodigo, String pNombre, String pCategoria) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        Statement declaracion = conexion.Conectar().createStatement();
        declaracion.executeUpdate("UPDATE productos SET nombre = '" + pNombre + "', categoria = '" + pCategoria
                + "' WHERE codigo = '" + pCodigo + "'");
        System.out.println("El producto se modifico correctamente");
    }

    public void Eliminar(int pCodigo) throws SQLException {
        ConexionBD conexion = new ConexionBD();
        Statement declaracion = conexion.Conectar().createStatement();
        declaracion.executeUpdate("DELETE FROM productos WHERE codigo = '" + pCodigo + "'");
        System.out.println("El producto se elimino correctamente");
    }
}