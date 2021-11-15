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
import java.util.ArrayList;
import java.util.List;


public class PeliculaDAO {
    
    private static final String SQL_SELECT = "SELECT * FROM pelicula;";
    
    public List<Pelicula> selectPelicula() {
        /* -------------------------------------------------------------------------- */
        /*      Metodo para seleccionar todos lss clientes registrados en la tabla    */
        /* -------------------------------------------------------------------------- */
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Instanciar la entidad Clientes.
        Pelicula pelicula = null;

        List<Pelicula> peliculas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while (rs.next()) {
 
                int codigo = rs.getInt("codigo_pelicula");
                String titulo = rs.getString("titulo_pelicula");
                String tipo = rs.getString("tipo_pelicula");
                String categoria = rs.getString("categoria_pelicula");
                String cast = rs.getString("actorprincipal_pelicula");
                int precio = rs.getInt("precioactual_pelicula");
                int stock = rs.getInt("stock_pelicula");
                int saldo = rs.getInt("saldo_pelicula");
                
                pelicula = new Pelicula(codigo, titulo, tipo, categoria, cast, precio, stock, saldo);

                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return peliculas;
    }
    
    public static void main(String[] args) {
        PeliculaDAO peliculas = new PeliculaDAO();
        System.out.println(peliculas.selectPelicula().size());
    }
}
