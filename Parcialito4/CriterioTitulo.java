package Parcialito4;

public class CriterioTitulo implements ICriterio{
    private String palabra;

    public CriterioTitulo (String titulo){
        this.palabra = titulo;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getTitulo().contains(this.palabra);
    }
}
