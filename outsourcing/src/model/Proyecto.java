package model;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Proyecto {

    private int cliente;
    private String nombre;
    private Date fechainicio, fechafin;
    private String estado;

    public Proyecto() {
    }

    public Proyecto(int cliente, String nombre, Date fechainicio, Date fechafin, String estado) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.estado = estado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}