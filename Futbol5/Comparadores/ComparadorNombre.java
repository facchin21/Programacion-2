package Practico7.Futbol5.Comparadores;

import Practico7.Futbol5.Socio;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

/*import java.util.Comparator;

public class ComparadorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

}*/