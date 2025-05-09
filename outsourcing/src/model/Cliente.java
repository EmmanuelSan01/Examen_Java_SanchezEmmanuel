package model;

/**
 *
 * @author camper
 */
public class Cliente {

    private String nombre, representante, correo, telefono, direccion, sector;

    public Cliente() {
    }

    public Cliente(String nombre, String representante, String sector) {
        this.nombre = nombre;
        this.representante = representante;
        this.sector = sector;
    }

    public Cliente(String nombre, String representante, String correo, String telefono, String direccion, String sector) {
        this.nombre = nombre;
        this.representante = representante;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sector = sector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", representante=" + representante + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", sector=" + sector + '}';
    }
}