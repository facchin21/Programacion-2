package AdicinalLIbreria;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;

    public Libreria(){
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    //SERVICIO 1:
    /*. Conocer el precio de un libro o revista para un cliente determinado (considerando el
    descuento)*/

    public double getPrecio(Producto producto, Cliente cliente){
        return (producto.getPrecio() - producto.getPrecio()* cliente.getDescuento()/100);
    }
    //SERVICIO 2: Conocer si un cliente ya compró un libro o revista determinada

    public boolean yaCompro(Producto producto, Cliente cliente){
        return cliente.yaCompro(producto);
    } //DELEGAMOS RESPONSABILIDAD AL CLIENTE.

    //METODOS SOBRE PRODUCTOS

    //SERVICIO 4: Devolver un listado de los clientes que les gusta un libro o revista
    public ArrayList<Cliente> getClientes (Producto producto){
        ArrayList<Cliente> resultado = new ArrayList<>();
        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            if(cliente.leGusta(producto)){
                resultado.add(cliente);
            }
        }
        return resultado;
    }     //SE DELEGA LA CONSULTA AL CLIENTE

}
