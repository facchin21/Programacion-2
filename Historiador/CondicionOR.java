package Historiador;

public class CondicionOR implements ICondicion{

    private ICondicion c1, c2;

    public CondicionOR(ICondicion c1, ICondicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public boolean cumpleCondicion(Documento documento) {
        return c1.cumpleCondicion(documento) || c2.cumpleCondicion(documento);
    }
}
