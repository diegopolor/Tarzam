package Modelo.Objects;

import Modelo.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PeliculaDAO {

    private static final String SQL_SELECT = "SELECT * FROM pelicula";
    private static final String SQL_INSERT = "INSERT INTO pelicula(titulo_pelicula, tipo_pelicula, categoria_pelicula, actorprincipal_pelicula, precioactual_pelicula, stock_pelicula, saldo_pelicula) VALUES(?, ?, ?, ?, ?, ?, ?);";

    public List<Pelicula> selectPelicula() {
        /* -------------------------------------------------------------------------- */
        /*     Metodo para seleccionar todas las peliculas registrados en la tabla    */
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

    public int intertPelicula(Pelicula p) {
        /* -------------------------------------------------------------------------- */
        /*                    Metodo para crear una nueva pelicula                    */
        /* -------------------------------------------------------------------------- */
        Connection conn = null;
        PreparedStatement ps = null;

        int registro = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getTipo());
            ps.setString(3, p.getCategoria());
            ps.setString(4, p.getActorPrincipal());
            ps.setInt(5, p.getPrecio());
            ps.setInt(6, p.getStock());
            ps.setInt(7, p.getSaldo());

            registro = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally {
            try {
                Conexion.close(ps);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
    }
    
    // public static void main(String[] args) {
    //     PeliculaDAO peliculas = new PeliculaDAO();
    //     System.out.println(peliculas.selectPelicula().size());
    // }
}
