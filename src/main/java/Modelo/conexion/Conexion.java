package Modelo.conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Ternera, Anderson Rueda & Diego Polo
 */
public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/tarzam";
    private static final  String user = "root";
    private static final String pass = "";
    static Connection conn; 
    

    
    public static Connection getConnection(){       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
          
        }               
        catch (ClassNotFoundException | SQLException e) {          
          System.out.println("Error: Ha fallado la conexión.\n");  
         
        }   
        return conn; 
     } 

    
    public static void close (ResultSet r) throws SQLException{  
        r.close();
    }
    
    public static void close (PreparedStatement psmtm ) throws SQLException{  
        psmtm.close();
    }
    

    public static void close (Statement smtm) throws SQLException{  
        smtm.close();
    }
    
    public static void close (Connection cnn) throws SQLException{  
        cnn.close();
    }
    

    public static void main(String[] args) throws SQLException {
        Conexion.getConnection();
    }
}

  

