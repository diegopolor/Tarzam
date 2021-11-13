package Modelo.Objects;


public class Pelicula {
   private int id_pelicula; 
   private String titulo;
   private String tipo;
   private String categoria;
   private String actorPrincipal;
   private int precio;
   private int stock;
   private int saldo;
   
    public Pelicula(int id_pelicula, String titulo, String tipo, String categoria, String actorPrincipal, int precio, int stock, int saldo) {
        this.id_pelicula = id_pelicula;
        this.titulo = titulo;
        this.tipo = tipo;
        this.categoria = categoria;
        this.actorPrincipal = actorPrincipal;
        this.precio = precio;
        this.stock = stock;
        this.saldo = saldo;
    }

    public Pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    } 

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
   
   
}
