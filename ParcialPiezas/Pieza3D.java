package ParcialPiezas;

import ParcialPiezas.Condicion.Condicion;

import java.util.ArrayList;

public abstract class Pieza3D {
    private String nombre;
    private String descripcion;
    private  static int precioGramo=12;
    private  static int costoSegundo=45;

    public static int getPrecioGramo() {
        return precioGramo;
    }

    public static void setPrecioGramo(int precioGramo) {
        Pieza3D.precioGramo = precioGramo;
    }

    public static int getCostoSegundo() {
        return costoSegundo;
    }

    public static void setCostoSegundo(int costoSegundo) {
        Pieza3D.costoSegundo = costoSegundo;
    }

    public Pieza3D(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract int getCantidadPla_Necesario();
    public abstract int cantPiezaSimple();
    public abstract double getTiempoEstimado();
    public abstract ArrayList<String> buscarColor(Condicion c);
    public abstract ArrayList<Pieza> buscar(Condicion c);

//    GETTERS Y SETTERS
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

    public double getCosto(){
        return getCantidadPla_Necesario() * precioGramo + getTiempoEstimado() * costoSegundo;
    }

}
