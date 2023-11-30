package Practico5;



import Practico5.FIltros.IFiltro;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{
    private String nombre;
    private String apellido;
    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String apellido, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getGastoSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public int getCantEmpleados() {
        return 1;
    }

    @Override
    public ArrayList<Empleado> empleadoConEspecialidad(IFiltro ff) {
        ArrayList<Empleado> salida = new ArrayList<>();
        if (ff.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
//    LA UNICA FORMA DE HACER UN OBJETO NUEVO ES UTILIZANDO EL NEW.
    @Override
    public ElementoEmpresa copia() {
        return new Empleado(this.getNombre(), this.getApellido(),
                this.getEspecialidad(), this.getGastoSueldo());
    }
    @Override
    public ElementoEmpresa copia(IFiltro ff) {
        if (ff.cumple(this)){
            return new Empleado(this.getNombre(), this.getApellido(),
                    this.getEspecialidad(), this.getGastoSueldo());
        }
        return null;
    }


    @Override
    public boolean equals(Object obj) {
        try{
            Empleado e = (Empleado) obj;
            return this.getApellido().equals(e.getApellido()) &&
                    this.getNombre().equals(e.getNombre());

        } catch(Exception e){
        } return false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", sueldo=" + sueldo +
                '}' + "\n";
    }
}
