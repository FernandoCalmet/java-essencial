package Excercises.POO.AccesoDatosEstudiante.accesoDatos;

import Excercises.POO.AccesoDatosEstudiante.entidades.Carrera;
import Excercises.POO.AccesoDatosEstudiante.entidades.Estudiante;
import java.sql.*; //Importa clases e interfaces para la conexion a la BD
import java.util.*; //Para usar la Colleccion arraylist

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DAOEstudiante {

    // Declara variables de referencia a interfaces

    Connection con = null;
    Statement stmt = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // Declara variable de referencia a la clase conexion
    Conexion db = null;

    // Constructor vacio
    public DAOEstudiante() {
        // Crea un obj para comunicarse con la clase conexion
        db = new Conexion();
    }

    // Metodo para guardar el objeto en la BD. Devuelve un booleano
    public void guardar(Estudiante oE) {
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Se crea sentencia simple para enviar una consulta
            ps = con.prepareStatement("INSERT INTO Estudiante(id, nombres, cod_carrera) VALUES(?, ?, ?)");
            // Asigna los valores a los parametros reservados
            ps.setString(1, oE.getId());
            ps.setString(2, oE.getNombres());
            ps.setInt(3, oE.getCar().getCodigo());
            // Ejecuta la consulta de inserccion en la BD
            ps.executeUpdate(); // Usado para insertar, actualizar, eliminar o modificar sentencias SQL
            System.out.println("Se guardo a Estudiante en Base de datos..!");
        } catch (SQLException e) {
            System.out.println("Error al intentar guardar Estudiante..!");
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }

    // Metodo para extraer los estudiantes en la BD. Devuelve una coleccion
    public ArrayList<Estudiante> listar() {
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Crea la coleccion para almacenar las carreras leidas de la BD
            ArrayList<Estudiante> lstEst = new ArrayList<Estudiante>();
            // Se crea sentencia simple para enviar una consulta
            stmt = con.createStatement();
            // Se ejecuta la consulta y los datos son almacenados en un ResultSet
            rs = stmt.executeQuery(
                    "SELECT e.id, e.nombres, c.cod_carrera, c.nombre FROM estudiante e, carrera c WHERE e.cod_carrera = c.cod_carrera");
            // Bucle que se ejecuta y repite mientras exista datos en un ResultSet
            while (rs.next()) {
                Estudiante oE = new Estudiante(); // Se crea un obj vacio
                // Se asigna al obj vacio los valores del ResultSet
                oE.setId(rs.getString("id"));
                oE.setNombres(rs.getString("nombres"));
                oE.setCar(new Carrera(rs.getInt("cod_carrera"), rs.getString("nombre")));
                // Se agrega el obj a una coleccion de estudiantes
                lstEst.add(oE);
            }
            // Se cierra el ResultSet y setencia simple
            rs.close();
            stmt.close();
            // Retornar la coleccion de Carreras
            return lstEst;
        } catch (SQLException e) {
            return null;
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }

    // Metodo para eliminar el objeto en la BD. Devuelve un booleano
    public void eliminar(Estudiante oE) {
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Se crea sentencia simple para enviar una consulta
            ps = con.prepareStatement("DELETE FROM Estudiante WHERE id = ?");
            // Asigna los valores a los parametros reservados
            ps.setString(1, oE.getId());
            // Ejecuta la consulta de inserccion en la BD
            ps.executeUpdate(); // Usado para insertar, actualizar, eliminar o modificar sentencias SQL
            System.out.println("Se elimino a Estudiante en Base de datos..!");
        } catch (SQLException e) {
            System.out.println("Error al intentar eliminar Estudiante..!");
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }

    // Metodo que busca los datos de un estudiante por Id y devuelve un obj
    public Estudiante buscarEstxId(String id) {
        Estudiante oE = null;
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Se crea sentencia simple para enviar una consulta
            stmt = con.createStatement();
            // Se ejecuta la consulta y los datos son almacenados en un ResultSet
            rs = stmt.executeQuery("SELECT id FROM estudiante WHERE id = " + "'" + id + "'");
            if (rs.next()) {
                oE = new Estudiante(); // Se crea un obj vacio
                // Se asigna al obj vacio los valores del ResultSet
                oE.setId(rs.getString("id"));
            }
            return oE;
        } catch (SQLException e) {
            return null;
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }
}