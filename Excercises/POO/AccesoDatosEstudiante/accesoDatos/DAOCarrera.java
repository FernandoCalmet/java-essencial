package Excercises.POO.AccesoDatosEstudiante.accesoDatos;

import java.sql.*; //Importa clases e interfaces para la conexion a la BD
import java.util.*; //Para usar la Colleccion arraylist
import Excercises.POO.AccesoDatosEstudiante.entidades.Carrera;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class DAOCarrera {
    // Declara variables de referencia a interfaces
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    // Declara variable de referencia a la clase conexion
    Conexion db = null;

    // Constructor vacio
    public DAOCarrera() {
        // Crea un obj para comunicarse con la clase conexion
        db = new Conexion();
    }

    // Metodo que busca los datos de una carrera por su nombre y devuelve un obj
    public Carrera buscarCarxNom(String car) {
        Carrera oC = null;
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Se crea sentencia simple para enviar una consulta
            stmt = con.createStatement();
            // Se ejecuta la consulta y los datos son almacenados en un ResultSet
            rs = stmt.executeQuery("SELECT cod_carrera, nombre FROM carrera WHERE nombre = " + "'" + car + "'");
            if (rs.next()) {
                oC = new Carrera(); // Se crea un obj vacio
                // Se asigna al obj vacio los valores del ResultSet
                oC.setCodigo(rs.getInt("cod_carrera"));
                oC.setNombre(rs.getString("nombre"));
            }
            return oC;
        } catch (SQLException e) {
            return null;
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }

    // Metodo para extraer las Carreras de la BD. Devuelve una coleccion
    public ArrayList<Carrera> listar() {
        try {
            con = db.ConectaDb(); // Se conecta a la BD
            // Crea la coleccion para almacenar las carreras leidas de la BD
            ArrayList<Carrera> lstCar = new ArrayList<Carrera>();
            // Se crea sentencia simple para enviar una consulta
            stmt = con.createStatement();
            // Se ejecuta la consulta y los datos son almacenados en un ResultSet
            rs = stmt.executeQuery("SELECT cod_carrera, nombre FROM carrera");
            // Bucle que se ejecuta y repite mientras exista datos en un ResultSet
            while (rs.next()) {
                Carrera oC = new Carrera(); // Se crea un obj vacio
                // Se asigna al obj vacio los valores del ResultSet
                oC.setCodigo(rs.getInt("cod_carrera"));
                oC.setNombre(rs.getString("nombre"));
                // Se agrega el obj a una coleccion de carreras
                lstCar.add(oC);
            }
            // Se cierra el ResultSet y setencia simple
            rs.close();
            stmt.close();
            // Retornar la coleccion de Carreras
            return lstCar;
        } catch (SQLException e) {
            return null;
        } finally {
            db.DesconectarDb(); // Se desconecta de la BD
        }
    }
}