package Modelo.Objects;

import java.sql.*;
import java.util.*;

import Modelo.conexion.Conexion;

public class BoletaDAO {
    
    private static final String SQL_SELECT = "SELECT * FROM boleta ";

    public List<Boleta> selectBoleta() {
        /* -------------------------------------------------------------------------- */
        /*      Metodo para seleccionar todas las boletas registrada en la tabla      */
        /* -------------------------------------------------------------------------- */
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Instanciar la entidad Boleta.
        Boleta boleta = null;

        List<Boleta> boletas = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int codigoBoleta = rs.getInt("codigo_boleta");

                boleta = new Boleta(codigoBoleta);

                boletas.add(boleta);
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
        return boletas;
    }
}
