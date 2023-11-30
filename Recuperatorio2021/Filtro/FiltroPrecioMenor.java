package Recuperatorio2021.Filtro;

import Recuperatorio2021.ElementoBazar;

public class FiltroPrecioMenor implements Filtro{
    private double precio;

    public FiltroPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return e.getPrecio() < this.precio;
    }
}
