package Modelo.Objects;


public class Boleta {
    private int nro_boleta;
    private String fecha_alquiler;
    private int id_cliente;

    public Boleta(int nro_boleta, String fecha_alquiler, int id_cliente) {
        this.nro_boleta = nro_boleta;
        this.fecha_alquiler = fecha_alquiler;
        this.id_cliente = id_cliente;
    }

    public Boleta(int nro_boleta) {
        this.nro_boleta = nro_boleta;
    }

    public int getNro_boleta() {
        return nro_boleta;
    }

    public void setNro_boleta(int nro_boleta) {
        this.nro_boleta = nro_boleta;
    }

    public String getFecha_alquiler() {
        return fecha_alquiler;
    }

    public void setFecha_alquiler(String fecha_alquiler) {
        this.fecha_alquiler = fecha_alquiler;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
