package Practico5.Comparadores;

import Practico5.Empleado;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Empleado> {

    private Comparator<Empleado> c1;
    private Comparator<Empleado> c2;

    public ComparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Comparator<Empleado> getC1() {
        return c1;
    }

    public void setC1(Comparator<Empleado> c1) {
        this.c1 = c1;
    }

    public Comparator<Empleado> getC2() {
        return c2;
    }

    public void setC2(Comparator<Empleado> c2) {
        this.c2 = c2;
    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        int resultado = c1.compare(o1, o2);
        if(resultado == 0 && c2 != null){
            return c2.compare(o1, o2);
        }
        return resultado;
    }
}
