package ParcialPiezas;

import ParcialPiezas.Condicion.Condicion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PiezaCompuesta extends Pieza3D{
    private int extraPla;
    private double extraTiempo;
    private ArrayList<Pieza3D> piezas;

    public PiezaCompuesta(String nombre, String descripcion, int extraPla, double extraTiempo) {
        super(nombre, descripcion);
        this.extraPla = extraPla;
        this.extraTiempo = extraTiempo;
        this.piezas = new ArrayList<>();
    }


    @Override
    public int getCantidadPla_Necesario() {
        int suma = 0;
        for (Pieza3D p : piezas){
            suma += p.getCantidadPla_Necesario();
        }
        return suma + extraPla * cantPiezaSimple();
    }

    @Override
    public int cantPiezaSimple() {
        int aux = 0;
        for (Pieza3D p : piezas){
           aux += p.cantPiezaSimple();
        }
        return aux;
    }

    @Override
    public double getTiempoEstimado() {
        double suma = 0;
        for(Pieza3D p : piezas){
            suma =  p.getTiempoEstimado();
        }
        return suma + extraTiempo;
    }

    @Override
    public ArrayList<String> buscarColor(Condicion c) {
        ArrayList<String> salida = new ArrayList<>();
        for (Pieza3D p : piezas){
            if(!salida.contains(p))
            salida.addAll(p.buscarColor(c));
        }
        return salida;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion c) {
        ArrayList<Pieza> salida = new ArrayList<>();
        for(Pieza3D p : piezas){
            salida.addAll(p.buscar(c));
        }
        return salida;
    }


    public void setExtraPla(int extraPla) {
        this.extraPla = extraPla;
    }
    public void addElemento(Pieza3D pp) {
        piezas.add(pp);
    }
}
