package Parcial2022;

public class CMayorAnt implements Condicion{
    private int antiguedad;

    public CMayorAnt(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean cumple(Elemento p) {
        return p.getAntiguedad() > this.antiguedad;
    }
}
