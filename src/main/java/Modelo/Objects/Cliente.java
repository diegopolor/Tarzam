
package Modelo.Objects;

public class Cliente {
    private int id_cliente; 
    private String nombre;
    private String apellidos;
    private int documento;
    private String direccion;
    private String telefono;
    private String celular;

   

    
    //LISTAR 
    public Cliente(int id_cliente,String nombre, String apellidos, int documento, String direccion, String telefono, String celular) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

    //INSERTAR
    public Cliente(String nombre, String apellidos, int documento, String direccion, String telefono, String celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }
    
    
    //ELIMINAR
    public Cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
