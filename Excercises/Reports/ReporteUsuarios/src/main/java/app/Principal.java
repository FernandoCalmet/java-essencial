package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author fernandocalmet
 */
public class Principal 
{
    public static void main(String[]args)
    {
        Connection conectarBD;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try
            {
                conectarBD = DriverManager.getConnection("jdbc:mysql://localhost/reporte_inscripcion", "root", "root");
                try
                {
                    JasperPrint reporte = JasperFillManager.fillReport(
                        Principal.class.getResourceAsStream("/reportes/Usuarios.jasper"),
                        new HashMap<>(),
                        conectarBD
                    );
                    
                    JasperViewer vistaReporte = new JasperViewer(reporte);
                    vistaReporte.setVisible(true);
                }
                catch(JRException ex)
                {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            catch(SQLException ex)
            {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
