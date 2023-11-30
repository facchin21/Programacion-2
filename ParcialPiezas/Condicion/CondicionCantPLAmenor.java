package ParcialPiezas.Condicion;

import ParcialPiezas.Pieza;

public class CondicionCantPLAmenor implements Condicion{
    private int cantPla;

    public CondicionCantPLAmenor(int cantPla) {
        this.cantPla = cantPla;
    }

    public int getCantPla() {
        return cantPla;
    }

    public void setCantPla(int cantPla) {
        this.cantPla = cantPla;
    }

    @Override
    public boolean cumple(Pieza p) {
        return p.getCantidadPla_Necesario() < this.cantPla;
    }
}
