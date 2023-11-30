package FarmaciaPractica;

public class CondicionOR extends Condicion{
    private Condicion cond1, cond2;

    public CondicionOR(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return this.cond1.cumpleCondicion(medicamento) || this.cond2.cumpleCondicion(medicamento);
    }
}
