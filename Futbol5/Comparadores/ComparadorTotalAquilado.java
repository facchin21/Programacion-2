package Practico7.Futbol5.Comparadores;

import Practico7.Futbol5.Socio;

import java.util.Comparator;

public class ComparadorTotalAquilado implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.cantidadAlquilada() - o2.cantidadAlquilada();
    }
}
