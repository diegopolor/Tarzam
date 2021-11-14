package Modelo.Objects;

public class Usuario {
    private int id_usuario;
    private String nombre_usuario;
    private String contrasenia_usuario;

    public Usuario(int id_usuario, String nombre_usuario, String contrasenia_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia_usuario = contrasenia_usuario;
    }

    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

}
