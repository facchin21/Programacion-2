package Practico5.FIltros;

import Practico5.Empleado;

public class FiltroOR implements IFiltro{
    private IFiltro c1,c2;

    public FiltroOR(IFiltro c1, IFiltro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public IFiltro getC1() {
        return c1;
    }

    public void setC1(IFiltro c1) {
        this.c1 = c1;
    }

    public IFiltro getC2() {
        return c2;
    }

    public void setC2(IFiltro c2) {
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Empleado ee) {
        return c1.cumple(ee) || c2.cumple(ee);
    }

}
