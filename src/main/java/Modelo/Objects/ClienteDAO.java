package Modelo.Objects;

import Modelo.conexion.Conexion;
import java.sql.*;
import java.util.*;

public class ClienteDAO {
    
    private static final String SQL_SELECT = "SELECT * FROM cliente";

    public List<Cliente> selectCliente() {
        /* -------------------------------------------------------------------------- */
        /*      Metodo para seleccionar todos lss clientes registrados en la tabla    */
        /* -------------------------------------------------------------------------- */
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        // Instanciar la entidad Clientes.
        Cliente cliente = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int codigoCliente = rs.getInt("codigo_cliente");
                String nombreCliente = rs.getString("nombre_cliente");
                String apellidoCliente = rs.getString("apellido_cliente");
                String segundoApellidoCliente = rs.getString("segundoapellido_cliente");
                String nombreCompletoCliente = rs.getString("nombrecompleto_cliente");
                int numeroDocumentoCliente = rs.getInt("numdocumento_cliente");
                String direccionCliente = rs.getString("direccion_cliente");
                String telefonoCliente = rs.getString("telefono_cliente");
                String celularCliente = rs.getString("celular_cliente");

                cliente = new Cliente(codigoCliente, nombreCliente, apellidoCliente, segundoApellidoCliente, nombreCompletoCliente, numeroDocumentoCliente, direccionCliente, telefonoCliente, celularCliente);

                clientes.add(cliente);
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
        return clientes;
    }
}
