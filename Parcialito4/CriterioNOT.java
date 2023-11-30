package Parcialito4;

public class CriterioNOT implements ICriterio{
    private ICriterio c1;
    public CriterioNOT(ICriterio c1){
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Acta acta) {
        return (!(c1.cumple(acta)));
    }
}
