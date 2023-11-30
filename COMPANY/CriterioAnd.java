package COMPANY;

public class CriterioAnd implements ICriterio{
    ICriterio c1, c2;

    public CriterioAnd(ICriterio c1, ICriterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    };

    @Override
    public boolean cumple(VehiculoElem v) {
        return c1.cumple(v) && c2.cumple(v);
    }
}
