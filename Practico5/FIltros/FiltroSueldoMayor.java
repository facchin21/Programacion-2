package Practico5.FIltros;

import Practico5.Empleado;

public class FiltroSueldoMayor implements IFiltro{
    private double valormin;

    public FiltroSueldoMayor(double valormin) {
        this.valormin = valormin;
    }

    public double getValormin() {
        return valormin;
    }

    public void setValormin(double valormin) {
        this.valormin = valormin;
    }

    @Override
    public boolean cumple(Empleado ee) {
        return ee.getGastoSueldo() > this.valormin;
    }

}
