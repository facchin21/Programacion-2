package COMPANY;

public class CriterioMenor implements ICriterio{
    private int precioTope;
    public CriterioMenor(int precio) {
        this.precioTope = precio;
    }
    @Override
    public boolean cumple(VehiculoElem v) {
        return v.getPrecio() <= this.precioTope;
    }
}
