/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Objects;


import Modelo.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author polod
 */
public class LoginDao {
    
        private Connection conn = null;
        private PreparedStatement pstm = null;
        private ResultSet rs = null;
        int rows;
    
        public boolean checkLogin(String usuario, String password){
            
            String SQL_SELECT = "Select * from usuario Where username= '" + usuario + "' AND  password = '" +password+ "';"; 
                
            try {
            
                conn = Conexion.getConnection();        
                pstm = conn.prepareStatement(SQL_SELECT);     
                rs = pstm.executeQuery();

                while ( rs.next() ) {
                    rows++; 
                }
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
                finally {
                    try {
                        Conexion.close(rs);
                        Conexion.close(pstm);
                        Conexion.close(conn);
                } catch (SQLException e) {
                    e.printStackTrace(System.out);
                }
            }
                            
            return rows >0;
                     
        }
    
    public static void main(String[] args) {
        LoginDao login = new LoginDao();
        System.out.println(login.checkLogin("admin", "1234"));   
    }
}