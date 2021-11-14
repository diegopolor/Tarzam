
package Modelo.Objects;

public class Cliente {
    private int id_cliente; 
    private String nombre;
    private String apellidos;
    private String segundoApellidos;
    private String nombreCompleto;
    private int documento;
    private String direccion;
    private String telefono;
    private String celular;

    public Cliente(int id_cliente, String nombre, String apellidos, String segundoApellidos, String nombreCompleto, int documento, String direccion, String telefono, String celular) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.segundoApellidos = segundoApellidos;
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
    }

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

    public String getSegundoApellido() {
        return segundoApellidos;
    }

    public void setSegundoApellido(String segundoApellidos) {
        this.segundoApellidos = segundoApellidos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
