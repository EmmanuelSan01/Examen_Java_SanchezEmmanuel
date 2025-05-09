package model;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Contrato {

    private int cliente, servicio;
    private Date fechainicio, fechafin;
    private double costototal;
    private String estado;

    public Contrato() {
    }

    public Contrato(int cliente, int servicio, Date fechainicio, Date fechafin, double costototal, String estado) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costototal = costototal;
        this.estado = estado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
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

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}