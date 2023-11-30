package Historiador;

public class CondicionNOT implements ICondicion{
    private ICondicion c1;
    public CondicionNOT(ICondicion c1){
        this.c1 = c1;
    }
    @Override
    public boolean cumpleCondicion(Documento documento) {
        return (!(c1.cumpleCondicion(documento)));
    }
}
