package COMPANY;

import java.util.ArrayList;
import java.util.Collections;

public class SitioDeVenta {
    private ArrayList<VehiculoElem> els;
    private ICriterio criterio;

    public SitioDeVenta(){
        els= new ArrayList<>();
    }
    public void addElemento(VehiculoElem v){
        els.add(v);
    }
    public void setCriterio(ICriterio criterio){
        this.criterio = criterio;
    }
    public ArrayList<VehiculoElem> buscar (ICriterio c){
        ArrayList<VehiculoElem> salida = new ArrayList<>();
        for(VehiculoElem v : els){
            if(c.cumple(v)){
                salida.add(v);
            }
        }
        Collections.sort(salida);
        return salida;
    }
}
