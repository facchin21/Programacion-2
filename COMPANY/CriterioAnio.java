package COMPANY;

public class CriterioAnio implements ICriterio{
    private int anio;

    public CriterioAnio(int anio){
        this.anio = anio;
    }
    @Override
    public boolean cumple(VehiculoElem v) {
        return v.getAnio() < this.anio;
    }
}
