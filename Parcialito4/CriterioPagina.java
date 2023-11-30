package Parcialito4;

public class CriterioPagina implements ICriterio{

    private int cantidadPaginas;

    public CriterioPagina(int cant){
        this.cantidadPaginas = cant;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getCantidadPaginas() < this.cantidadPaginas;
    }
}
