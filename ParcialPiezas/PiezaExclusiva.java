package ParcialPiezas;

import ParcialPiezas.Condicion.Condicion;

import java.util.ArrayList;

public class PiezaExclusiva extends Pieza{
    private double costoExclusivo;

    public PiezaExclusiva(String nombre, String descripcion, int pla,
                          String color, double tiempoImpresion,
                          double costoExclusivo) {
        super(nombre, descripcion, pla, color, tiempoImpresion);
        this.costoExclusivo = costoExclusivo;
    }

    @Override
    public double getCosto() {
        return super.getCosto() + costoExclusivo;
    }
    public ArrayList<Pieza> buscar(Condicion cc){
        return new ArrayList<Pieza>();
    }
}
