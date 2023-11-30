package Parcialito4;

public class CriterioAnio implements ICriterio{
    private int anio;

    public CriterioAnio(int anio){
        this.anio = anio;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getAnio() < this.anio;
    }
}
