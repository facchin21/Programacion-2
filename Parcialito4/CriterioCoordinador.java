package Parcialito4;

public class CriterioCoordinador implements ICriterio{
    private String coordinador;
    public CriterioCoordinador(String coordinador){
        this.coordinador = coordinador;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getCoordinador().equals(this.coordinador);
    }
}
