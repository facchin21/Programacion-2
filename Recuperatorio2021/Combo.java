package Recuperatorio2021;
import Recuperatorio2021.Filtro.Filtro;

import java.util.ArrayList;

public class Combo extends ElementoBazar{
    private double descuentoPorProducto;
    private double descuentoMaximo;
    private ArrayList<ElementoBazar> elementos;
    private Filtro filtro;
    public Combo(String nombre, double descuentoPorProducto, double descuentoMaximo, Filtro filtro) {
        super(nombre);
        this.descuentoPorProducto = descuentoPorProducto;
        this.descuentoMaximo = descuentoMaximo;
        this.filtro = filtro;
        this.elementos = new ArrayList<>();
    }
    public Producto getProductoMenorPrecio(){
        double menorPeso = 99999999;
        Producto productoMenorPeso = null;
        for(ElementoBazar e : elementos){
           Producto productoMenorPesoAux = e.getProductoMenorPrecio();
            double temp = productoMenorPesoAux.getPeso();
           if(productoMenorPeso == null || temp < menorPeso){
                menorPeso = temp;
               productoMenorPeso = productoMenorPesoAux ;
           }
        }
        return productoMenorPeso;
    }
    public void addElemento(ElementoBazar elemento){
        if(filtro.cumple(elemento)){
            elementos.add(elemento);
        }
    }
    public double getPrecioSinDesucuento(){
        double suma = 0;
        for (ElementoBazar e: elementos){
            suma += e.getPrecio();
        }
        return suma;
    }
    @Override
    public double getPrecio() {
        double suma = getPrecioSinDesucuento();
        double porcentajeDescuento = (descuentoPorProducto * getCantidadProductos());
        if(porcentajeDescuento > descuentoMaximo){
            porcentajeDescuento = descuentoMaximo;
        }
        return suma - porcentajeDescuento * suma;
    }
    @Override
    public double getPeso() {
        double suma = 0.0;
        for(ElementoBazar e: elementos){
            suma += e.getPeso();
        }
        return suma;
    }
    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> salida = new ArrayList<>();
        for(ElementoBazar e : elementos){
            for(String categoria : e.getCategorias()){
                if(!salida.contains(categoria)){
                    salida.add(categoria);
                }
            }
        }
        return salida;
    }
    @Override
    public int getCantidadProductos() {
        int suma = 0;
        for(ElementoBazar e : elementos){
            suma += e.getCantidadProductos();
        }
        return suma;
    }
    @Override
    public ArrayList<ElementoBazar> buscar(Filtro ff) {
        ArrayList <ElementoBazar> salida = new ArrayList<>();
        if(ff.cumple(this)){ //SE AGREGO POR QUE NECESITAMOS AGREGAR UN COMBO SI CUMPLE.
            salida.add(this);
        }else{
            for (ElementoBazar e : elementos){
                salida.addAll(e.buscar(ff));
            }
        }
        return salida;
    }
    @Override
    public ElementoBazar copiar(Filtro ff) {
        if(ff.cumple(this)){
            ArrayList<ElementoBazar> hijosQueCumplen = new ArrayList<>();
            for (ElementoBazar e : elementos){
                ElementoBazar copia = e.copiar(ff);
                if(copia != null){
                    hijosQueCumplen.add(copia);
                }
            }
            if(hijosQueCumplen.isEmpty()){
                return null;
            }else{
                Combo copiaCombo = new Combo(this.getNombre(), this.descuentoPorProducto,
                        this.descuentoMaximo, this.filtro);
                for (ElementoBazar ee: hijosQueCumplen){
                    copiaCombo.addElemento(ee);
                    return copiaCombo;
                }
            }
        }
        return null;
        /*
        metodo{
        if(ff.cumple(this){ SI YO CUMPLO
            ArrayList<ElementoBazar> hijosQueCumplen = new ArrayList<>(); CREO ARRAYLIST DE HIJOSQUECUMPLEN, MIS ELEMENTOS
            for(ElementoBazar e : elementos){   RECORRO MIS ELEMENTOS
                ElementoBazar copia = e.copiar(ff);  CREO UNA VARIABLE QUE LE ASIGNO LA POSICION.COPIA(Y SU FILTRO)
                if(copia != null){  SI MI VARIABLE NO ESTA VACIA
                    hijosQueCumplen.add(copia); A MIS HIJOS Q CUMPLEN LE AGREGO MI VARIABLE
                }
            } LUEGO
            Combo copiaCombo = new Combo(...); CREO MI COPIA DE COMBO
            for(ElementoBazar ee: hijosQueCumplen){ RECORRO MIS HIJOS Q CUMPLEN
                copiaCombo.addElemento(ee); A MI COPIA LE AGREGO EL ELEMENTO EN CADA POSICION QUE CUMPLE
                return copiaCombo; RETORNO LA COPIA DE MI COMBO.
            }
        }
        return null
        }
        * */
    }

    public Filtro getFiltro() {
        return filtro;
    }

    //GETTERS Y SETTERS
    public double getDescuentoPorProducto() {
        return descuentoPorProducto;
    }
    public void setDescuentoPorProducto(double descuentoPorProducto) {
        this.descuentoPorProducto = descuentoPorProducto;
    }
    public double getDescuentoMaximo() {
        return descuentoMaximo;
    }
    public void setDescuentoMaximo(double descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }
}
