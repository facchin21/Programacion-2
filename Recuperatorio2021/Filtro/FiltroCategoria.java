package Recuperatorio2021.Filtro;

import Recuperatorio2021.ElementoBazar;

public class FiltroCategoria implements Filtro{
    private String categoria;

    public FiltroCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return e.tieneCategoria(this.categoria);
    }

}
