package Recuperatorio2021;
import Recuperatorio2021.Filtro.Filtro;

import java.util.ArrayList;

public class Producto extends ElementoBazar{

    private double precio;
    private double peso;
    private ArrayList<String> categorias;

    public Producto(String nombre, double precio, double peso) {
        super(nombre);
        this.precio = precio;
        this.peso = peso;
        this.categorias = new ArrayList<>();
    }

    public void addCategoria(String categoria){
        if(!categorias.contains(categoria)){
            categorias.add(categoria);
        }
    }

    @Override
    public Producto getProductoMenorPrecio() {
        return this;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
    @Override
    public double getPeso() {
        return this.peso;
    }
    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(this.categorias);
    }
    @Override
    public int getCantidadProductos() {
        return 1;
    }
    @Override
    public ArrayList<ElementoBazar> buscar(Filtro ff) {
        ArrayList<ElementoBazar> salida = new ArrayList<>();
        if(ff.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    @Override
    public ElementoBazar copiar(Filtro ff) {
        if (ff.cumple(this)) {
            Producto copia = new Producto(this.getNombre(), this.precio, this.peso);
            for(String cat : categorias){
                copia.addCategoria(cat);
                return copia;
            }
        }
        return null;
    }

    //   SETTERS
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
