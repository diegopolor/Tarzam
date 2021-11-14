
package Modelo.Objects;


public class DetalleBoleta {
    private int nro_boleta;
    private int id_pelicula;
    private int precio;
    private int devuelto;
    private String fecha_devolucion;
    private int dias_mora;

    public DetalleBoleta(int nro_boleta, int id_pelicula, int precio, int devuelto, String fecha_devolucion, int dias_mora) {
        this.nro_boleta = nro_boleta;
        this.id_pelicula = id_pelicula;
        this.precio = precio;
        this.devuelto = devuelto;
        this.fecha_devolucion = fecha_devolucion;
        this.dias_mora = dias_mora;
    }

    public DetalleBoleta(int nro_boleta) {
        this.nro_boleta = nro_boleta;
    }

    public int getNro_boleta() {
        return nro_boleta;
    }

    public void setNro_boleta(int nro_boleta) {
        this.nro_boleta = nro_boleta;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(int devuelto) {
        this.devuelto = devuelto;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getDias_mora() {
        return dias_mora;
    }

    public void setDias_mora(int dias_mora) {
        this.dias_mora = dias_mora;
    }
    
    
    
}
