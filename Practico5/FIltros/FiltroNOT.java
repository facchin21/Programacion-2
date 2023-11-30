package Practico5.FIltros;

import Practico5.Empleado;

public class FiltroNOT implements IFiltro{
    private IFiltro c1;

    public FiltroNOT(IFiltro c1) {
        this.c1 = c1;
    }

    public IFiltro getC1() {
        return c1;
    }

    public void setC1(IFiltro c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Empleado ee) {
        return (!(c1.cumple(ee)));
    }

}
