package Practico7.Futbol5.Filtro;

import Practico7.Futbol5.Socio;

public class FiltroEdad implements Filtro{
    private int edad;

    public FiltroEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio ss) {
        return ss.getEdad() > edad;
    }

}
