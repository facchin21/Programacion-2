package Recuperatorio2021;

import Recuperatorio2021.Filtro.Filtro;

public class ComboPromocionales extends Combo{
    public ComboPromocionales(String nombre, double descuentoPorProducto, double descuentoMaximo, Filtro filtro) {
        super(nombre, descuentoPorProducto, descuentoMaximo, filtro);
    }
    @Override
    public double getPrecio() {
        double suma = this.getPrecioSinDesucuento();
        double totalProductos  = this.getCantidadProductos();
        return suma / totalProductos;
    }
    @Override
    public ElementoBazar copiar(Filtro ff) {
        if (ff.cumple(this)) {
            ComboPromocionales combo = new ComboPromocionales(this.getNombre(), this.getDescuentoPorProducto(), this.getDescuentoMaximo(),this.getFiltro());
            return combo;
        }
        return null;
    }
}
