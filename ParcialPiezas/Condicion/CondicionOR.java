package ParcialPiezas.Condicion;

import ParcialPiezas.Pieza;

public class CondicionOR implements Condicion{
    private Condicion c1, c2;

    public CondicionOR(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public boolean cumple(Pieza p) {
        return c1.cumple(p) || c2.cumple(p);
    }
}
