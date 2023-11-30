package Recuperatorio2021.Filtro;

import Recuperatorio2021.ElementoBazar;

public class FiltroAnd implements Filtro{
    private Filtro c1, c2;

    public FiltroAnd(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoBazar e) {
        return c1.cumple(e) && c2.cumple(e);
    }

}
