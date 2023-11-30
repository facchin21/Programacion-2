package FarmaciaPractica;

public class CondicionXLab extends Condicion{
    private String lab;

    public CondicionXLab(String lab){
        this.lab = lab;
    }
    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return medicamento.getLab().equals(this.lab);
    }
}
