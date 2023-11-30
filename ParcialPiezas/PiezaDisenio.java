package ParcialPiezas;

import ParcialPiezas.Condicion.Condicion;

public class PiezaDisenio extends PiezaCompuesta{
    private Condicion cc;
    public PiezaDisenio(String nombre, String descripcion, int extraPla, double extraTiempo) {
        super(nombre, descripcion, extraPla, extraTiempo);
    }
    public void addElemento(Pieza3D pp) {
        if (cc.cumple(pp)) {
            super.addElemento(pp);
        }
    }
}
