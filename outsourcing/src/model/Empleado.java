package model;

/**
 *
 * @author camper
 */
public class Empleado {

    private int proyecto;
    private String nombre, cargo, especialidad;
    private double salario;

    public Empleado() {
    }

    public Empleado(int proyecto, String nombre, String cargo, String especialidad, double salario) {
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.cargo = cargo;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}