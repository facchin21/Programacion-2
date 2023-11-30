package Parcialito4;

public class CriterioAND implements ICriterio{

    private ICriterio c1, c2;

    public CriterioAND(ICriterio c1, ICriterio c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Acta acta) {
        return c1.cumple(acta) && c2.cumple(acta);
    }
}
