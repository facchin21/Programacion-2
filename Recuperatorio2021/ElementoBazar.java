package Recuperatorio2021;
import Recuperatorio2021.Filtro.Filtro;

import java.util.ArrayList;

public abstract class ElementoBazar {
    private String nombre;

    public ElementoBazar(String nombre) {
        this.nombre = nombre;
    }
    public abstract Producto getProductoMenorPrecio();
    public abstract double getPrecio();
    public abstract double getPeso();
    public abstract ArrayList<String> getCategorias();
    public abstract int getCantidadProductos();
    public abstract ArrayList <ElementoBazar> buscar(Filtro ff);
    public abstract ElementoBazar copiar(Filtro ff);

    public boolean tieneCategoria(String categoria){
        if(this.getCategorias().contains(categoria)){
            return true;
        }
        return false;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
