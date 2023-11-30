package Recuperatorio2021.Filtro;

import Recuperatorio2021.ElementoBazar;

public class FiltroNot implements Filtro{
    private Filtro c1;

    public FiltroNot(Filtro c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return !c1.cumple(e);
    }
}
