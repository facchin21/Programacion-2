package Recuperatorio;

import Practico5.ElementoEmpresa;
import Recuperatorio.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Grupo extends ElementoPortal{
    private ArrayList<ElementoPortal> elementos;
    public Grupo(String categoria) {
        super(categoria);
        this.elementos = new ArrayList<>();
    }
    @Override
    public ArrayList<String> getPalabrasClaves() {
        ArrayList<String> salida = new ArrayList<>();
        for(ElementoPortal e : elementos){
            if(!salida.contains(e.getPalabrasClaves())){
                salida.addAll(e.getPalabrasClaves());
            }
        }
        return salida;
    }

    @Override
    public ElementoPortal copia(Filtro ff) {
        ArrayList<ElementoPortal> hijosQueCumplen = new ArrayList<>();
        for(ElementoPortal e : elementos){
            ElementoPortal copiaHijo = e.copia(ff);
            if(copiaHijo != null){
                hijosQueCumplen.add(copiaHijo);
            }
            if(hijosQueCumplen.size() > 0){ //Algun Hijo fue duplicado debo retornar la seccion.
                Grupo copia = new Grupo(this.getCategoria());
                for(ElementoPortal ee: hijosQueCumplen){
                    copia.addElemento(ee);
                }
                return copia;
            }
        }
        return null; //Ningun hijo fue duplicado, entonces retorno null (No duplico seccion).
    }
    public Grupo obtenerCopia(){
        return new Grupo(this.getCategoria());
    }

    public void addElemento(ElementoPortal elemento) {
        int pos = 0;
        while(pos < this.elementos.size() && this.elementos.get(pos).compareTo(elemento) < 0){
            pos++;
            this.elementos.add(pos, elemento);
        }
    }


}
