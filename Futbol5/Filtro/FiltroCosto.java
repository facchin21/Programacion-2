package Practico7.Futbol5.Filtro;

import Practico7.Futbol5.Socio;

public class FiltroCosto implements Filtro{
    private double costo;

    public FiltroCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.getCosto() > costo;
    }
}
