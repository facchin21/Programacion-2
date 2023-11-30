package Practico7.Futbol5.Filtro;

import Practico7.Futbol5.Socio;

public class FiltroIDCancha implements Filtro{
    private int ID;

    public FiltroIDCancha(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.contieneCancha(getID());
    }
}
