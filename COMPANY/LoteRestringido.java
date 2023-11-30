package COMPANY;

public class LoteRestringido extends Lote{
    private ICriterio criterio;
    public LoteRestringido(String nombre) {
        super(nombre);
    }
    @Override
    public void addElem(VehiculoElem v){
        if(criterio.cumple(v)){
            super.addElem(v);
        }
    }
}
