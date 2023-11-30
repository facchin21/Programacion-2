package FarmaciaPractica;

public class CondicionNOT extends Condicion{
    private Condicion condicion;

    public CondicionNOT(Condicion condicion){
        this.condicion = condicion;
    }
    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return (!(this.condicion.cumpleCondicion(medicamento)));
    }
}
