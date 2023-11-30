package Practico7.Futbol5;

import Practico5.Empleado;
import Practico7.Futbol5.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class SistemaFutbol {
    public abstract ArrayList<Socio> buscar(Filtro f);

    public  ArrayList<Socio> buscar(Filtro f, Comparator<Socio> c){
        ArrayList<Socio> temp = this.buscar(f);
        Collections.sort(temp, c);
        return temp;
    }

    public abstract double getCosto ();
    public abstract int cantidadAlquilada();
}
