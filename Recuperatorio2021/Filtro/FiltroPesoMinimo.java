package Recuperatorio2021.Filtro;

import Recuperatorio2021.ElementoBazar;

public class FiltroPesoMinimo implements Filtro{
    private double peso;

    public FiltroPesoMinimo(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return e.getPeso() < this.peso;
    }

}
