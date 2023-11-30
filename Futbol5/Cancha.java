package Practico7.Futbol5;


import Practico7.Futbol5.Filtro.Filtro;

import java.util.ArrayList;

public class Cancha extends SistemaFutbol{

    private int id;
    private int fecha;
    private double costo;
    private ArrayList<Socio> socios;
    public Cancha(int id, int fecha, double costo) {
        this.id = id;
        this.fecha = fecha;
        this.costo = costo;
        socios = new ArrayList<>();
    }

    public int cantidadAlquilada(){
        return 1;
    }
    //METODOS AL ARRAY

    public boolean isSocio(Socio s){
        if(socios.contains(s)){
            return true;
        }return false;
    }
    public void addSocio (Socio s){
        if(!socios.contains(s)){
            socios.add(s);
        }
    }

    @Override
    public ArrayList<Socio> buscar(Filtro f) {
        ArrayList<Socio> salida = new ArrayList<>();
        for(Socio ss : socios) {
            ArrayList<Socio> aux = ss.buscar(f);
            salida.addAll(aux);
        }
        return salida;
    }
    //GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
