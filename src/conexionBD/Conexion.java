
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Team FrayDiego Solution 
 */
public class Conexion {
    
    public static String bd ="fds_basedatos";
    public static String user = "root";             // DE ACUERDO A SU MYSQL CAMBIEN "root" EL USUARIO (POR DEFECTO ES ROOT)
    public static String password = "uaeh";        // CAMBIEN "uaeh" POR SU CONTRASEÑA 
    public static String url = "jdbc:mysql://localhost:3306/";
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static Connection conn; 
    
    
    public static Statement sentencia; 
    public static boolean buscarISBN;
                                                        // Alejandro añadido
    public static boolean buscarActividad;              // Alejandro añadido
    public static boolean buscarlector; 
    public static boolean buscarUser; 
    public Conexion(){

    }
    
    public static Connection conectar(){
  
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url+bd, user, password);
            System.out.println("Se conectó a la base de datos "+bd);
        } catch (ClassNotFoundException |SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" NO se conectó a la base de datos "+bd);
        }
        return conn;
                                       
    }
    
    public static void desconectar(){  
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  

}
