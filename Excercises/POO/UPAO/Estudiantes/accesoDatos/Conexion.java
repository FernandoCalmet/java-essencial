package Excercises.POO.UPAO.Estudiantes.accesoDatos;

import java.sql.*; //Importa clases e interfaces para la conexion a BD

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Conexion {

    private final String url = "jdbc:derby://localhost:1527/bdEstudiante";
    private final String user = "upao";
    private final String passwd = "upao";
    private Connection con;

    // Conectarse a base de datos
    public Connection ConectaDb() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException | ClassNotFoundException e) {
        }
        return con;
    }

    // Desconectarse de la base de datos
    public void DesconectarDb() {
        try {
            con.close();
        } catch (SQLException e) {
        }
    }
}
