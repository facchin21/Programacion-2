package Recuperatorio;
import java.util.ArrayList;
public class GrupoPolicial extends Grupo{
    ArrayList<String> CategoriasAceptables;

    public GrupoPolicial(String categoria) {
        super(categoria);
        this.CategoriasAceptables = new ArrayList<>();
    }

    public void addCategoriaAceptable(String categoria){
        if(!CategoriasAceptables.contains(categoria)){
            CategoriasAceptables.add(categoria);
        }
    }

    @Override
    public void addElemento(ElementoPortal elemento) {
        if(!CategoriasAceptables.contains(elemento.getCategoria())){
            super.addElemento(elemento);
        }
    }

    @Override
    public Grupo obtenerCopia() {
        GrupoPolicial copia = new GrupoPolicial(this.getCategoria());
        for(String categoria : copia.CategoriasAceptables){
            copia.addCategoriaAceptable(categoria);
        }
        return copia;
    }
}
