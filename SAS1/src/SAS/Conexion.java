/* Archivo conexion que permite enlazar la base de datos a Java*/
package SAS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author: 
 * Flores Reyes Miguel Angel 
 * Johan Emannuel Roberto Mendoza Gasca
 */
public class Conexion {
    public static Connection getConexion()
    {
        String conexionUrl="jdbc:sqlserver://localhost:1433;"
                + "database=SAS1;"//nombre de nuestra base de datos
                + "user=SASAdmin;"
                + "password=oxxo12;"
                + "loginTimeout=30;";
        try // tratara de hacer la conexion a la base de datos 
        {
            Connection con=DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex)
                {
                    System.out.println(ex.toString());
                    return null; 
                }
    }
}
