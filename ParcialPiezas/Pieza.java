package ParcialPiezas;

import ParcialPiezas.Condicion.Condicion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pieza extends Pieza3D{

    private int Pla;
    private String color;
    private double tiempoImpresion;

    public Pieza(String nombre, String descripcion, int pla, String color, double tiempoImpresion) {
        super(nombre, descripcion);
        Pla = pla;
        this.color = color;
        this.tiempoImpresion = tiempoImpresion;
    }
    //GETTERS Y SETTERS.

    public void setPla(int pla) {
        Pla = pla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTiempoImpresion(double tiempoImpresion) {
        this.tiempoImpresion = tiempoImpresion;
    }

    @Override
    public int getCantidadPla_Necesario() {
        return this.Pla;
    }

    @Override
    public int cantPiezaSimple() {
        return 1;
    }

    @Override
    public double getTiempoEstimado() {
        return tiempoImpresion;
    }

    @Override
    public ArrayList<String> buscarColor(Condicion c) {
        ArrayList<String> salida = new ArrayList<>();
        salida.add(color);
        return salida;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion c) {
        ArrayList<Pieza> salida = new ArrayList<>();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
}
