package Practico7.Futbol5.Filtro;

import Practico7.Futbol5.Socio;

public class FiltroOR implements Filtro{
    private Filtro c1, c2;

    public FiltroOR(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Filtro getC1() {
        return c1;
    }

    public void setC1(Filtro c1) {
        this.c1 = c1;
    }

    public Filtro getC2() {
        return c2;
    }

    public void setC2(Filtro c2) {
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Socio ss) {
        return c1.cumple(ss) || c2.cumple(ss);
    }
}
