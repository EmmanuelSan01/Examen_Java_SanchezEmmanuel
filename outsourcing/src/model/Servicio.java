package model;

/**
 *
 * @author camper
 */
public class Servicio {

    private String nombre, descripcion, categoria;
    private double precioxhora;

    public Servicio() {
    }

    public Servicio(String nombre, String categoria, double precioxhora) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioxhora = precioxhora;
    }

    public Servicio(String nombre, String descripcion, String categoria, double precioxhora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioxhora = precioxhora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioxhora() {
        return precioxhora;
    }

    public void setPrecioxhora(double precioxhora) {
        this.precioxhora = precioxhora;
    }
}