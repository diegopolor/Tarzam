package Modelo.conexion;

<<<<<<< HEAD
import java.sql.Statement;
=======
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.sql.Statement;
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Ternera, Anderson Rueda & Diego Polo
 */
public class Conexion {
<<<<<<< HEAD
<<<<<<< HEAD
    private static final String url = "jdbc:mysql://localhost:3306/tarzam";
    private static final  String user = "root";
    private static final String pass = "";
    static Connection conn; 
    
    public static Connection getConnection() throws SQLException{       
=======
    
    private static final String url = "jdbc:mysql://localhost:3306/tarzam";
    private static final String user = "root";
    private static final String pass = "";
    static Connection conn; 
    
    public static Connection getConnection(){       
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "✔ Success: Conectado a la base de datos.");
        }               
        catch (ClassNotFoundException | SQLException e) {          
<<<<<<< HEAD
          JOptionPane.showMessageDialog(null, "✖ Error: Ha fallado la conexión.\n" + e);  
        }   
        return conn; 
     } 
=======
            JOptionPane.showMessageDialog(null, "✖ Error: Ha fallado la conexión.\n" + e);  
        }   
        return conn; 
    } 
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
    
    public static void close (ResultSet r) throws SQLException{  
        r.close();
    }
    
    public static void close (PreparedStatement psmtm ) throws SQLException{  
        psmtm.close();
    }
    
<<<<<<< HEAD
   public static void close (Statement smtm) throws SQLException{  
=======
    public static void close (Statement smtm) throws SQLException{  
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
        smtm.close();
    }
    
    public static void close (Connection cnn) throws SQLException{  
        cnn.close();
    }
    
<<<<<<< HEAD
    public static void main(String[] args) throws SQLException {
        Conexion.getConnection();
    }
}
=======
  
}  
>>>>>>> 00aef4fa6b6a352c5e399df186f604a307f3f98a
=======
    // public static void main(String[] args) {
    //     Conexion.getConnection();
    // }
}
>>>>>>> 01382bd9913578d397249896ff8cd9287ba813e7
