package Practico5.Comparadores;

import Practico5.Empleado;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
