package Practico7.Futbol5.Comparadores;

import Practico7.Futbol5.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator c1,c2;

    public ComparadorCompuesto(Comparator c1, Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public int compare(Socio o1, Socio o2) {
        int resultado = c1.compare(o1 , o2);
        if(resultado == 0 && c2!=null){
            return c2.compare(o1, o2);
        }
        return resultado;
    }
}

/*Public class CComparador implements comparator<Persona> {


Private Comparator c1, c2;

@Override
Public compare(Persona arg1, Persona arg2)
   Int out = c1.compare(arg1, arg2)

Return (out != 0)? out : c2.compare(arg1, arg2);
}

public int compare(Empleado o1, Empleado o2) {
        int resultado = c1.compare(o1, o2);
        if(resultado == 0 && c2 != null){
            return c2.compare(o1, o2);
        }
        return resultado;
    }
}*/