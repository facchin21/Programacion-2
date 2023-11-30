package Parcial2022;

public class CriterioAntiguedad implements Condicion{

    private int antiguedad;
    public CriterioAntiguedad(int antiguedad){this.antiguedad = antiguedad;}

    @Override
    public boolean cumple(Elemento e) {
        return e.getAntiguedad() == this.antiguedad;
    }


}
