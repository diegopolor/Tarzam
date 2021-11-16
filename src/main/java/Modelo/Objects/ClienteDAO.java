package Modelo.Objects;

import Modelo.conexion.Conexion;
import java.sql.*;
import java.util.*;

public class ClienteDAO {
    
    private static final String SQL_SELECT = "SELECT * FROM cliente ORDER BY apellidos_cliente;";
    private static final String SQL_INSERT = "INSERT INTO cliente (nombre_cliente, apellidos_cliente, numdocumento_cliente, direccion_cliente, telefono_cliente, celular_cliente) VALUES (?, ?, ?, ?, ?, ?);";

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
 
                String nombreCliente = rs.getString("nombre_cliente");
                String apellidoCliente = rs.getString("apellidos_cliente");
                int numeroDocumentoCliente = rs.getInt("numdocumento_cliente");
                String direccionCliente = rs.getString("direccion_cliente");
                String telefonoCliente = rs.getString("telefono_cliente");
                String celularCliente = rs.getString("celular_cliente");
                
                cliente = new Cliente(nombreCliente, apellidoCliente, numeroDocumentoCliente, direccionCliente, telefonoCliente, celularCliente);

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
    
    
    public int insertCliente(Cliente c){
        Connection conn = null;
        PreparedStatement pstm = null;
        int registro = 0;
        /*Estudiante(int codigo, String nombre, String apellidos, int edad, String direccion, 
        int identificacion, String genero, String correo, int telefono, String nombreAcu, 
        int telfAcu, String profesor, String curso)
        */
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);
            
            pstm.setString(1, c.getNombre()); 
            pstm.setString(2, c.getApellidos());        
            pstm.setInt(3, c.getDocumento()); 
            pstm.setString(4, c.getDireccion()); 
            pstm.setString(5, c.getTelefono()); 
            pstm.setString(6, c.getCelular());  
            
                     
          //Nos regresa el numero de registros afectados.
            registro = pstm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally {
            try {
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registro;
        
    }

}
