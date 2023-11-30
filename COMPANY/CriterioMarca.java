package COMPANY;

public class CriterioMarca implements ICriterio{
    private String marca;

    public CriterioMarca(String marca){
        this.marca = marca;
    }
    @Override
    public boolean cumple(VehiculoElem v) {
        return this.marca.equals(v.getMarca());
    }
}
