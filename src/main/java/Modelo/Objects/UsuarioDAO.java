package Modelo.Objects;

import java.sql.*;
import java.util.*;

import Modelo.conexion.Conexion;

public class UsuarioDAO {
    
    public static final String SQL_SELECT = "SELECT id_usuario FROM usuario WHERE usuario.id_usuario = ?";

    public List<Usuario> selectUsuario() {
        /* -------------------------------------------------------------------------- */
        /*                       Metodo para seleccionar usuario                      */
        /* -------------------------------------------------------------------------- */
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Intanciar la entidad usuario
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");

                usuario = new Usuario(id_usuario);

                usuarios.add(usuario);
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
        return usuarios;
    }
}
