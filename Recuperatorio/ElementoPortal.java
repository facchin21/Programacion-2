package Recuperatorio;

import Recuperatorio.Filtros.Filtro;

import java.util.ArrayList;


public abstract class ElementoPortal implements Comparable<ElementoPortal>{
    private String categoria;

    public ElementoPortal(String categoria) {
        this.categoria = categoria;
    }

    public abstract ArrayList<String> getPalabrasClaves();
    public abstract ElementoPortal copia(Filtro ff);

    public int compareTo(ElementoPortal elemento) {
        return this.getCategoria().compareTo(elemento.getCategoria());
    }
    //GETTER CATEGORIA.
    public String getCategoria() {
        return categoria;
    }
}
