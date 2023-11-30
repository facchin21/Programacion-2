package FarmaciaPractica;

public class CondicionAND extends Condicion{
    private Condicion cond1 ,cond2;

    public CondicionAND(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return cond1.cumpleCondicion(medicamento) && cond2.cumpleCondicion(medicamento);
    }
}
