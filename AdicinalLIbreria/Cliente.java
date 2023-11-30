package AdicinalLIbreria;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private double descuento;
    protected ArrayList<String>autores;
    protected ArrayList<String>generos;
    private ArrayList<Producto>compras;


    public Cliente(String nombre, String apellido, int dni, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.autores = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }
    //SERVICIO 3:
    /*Conocer si a un cliente le gusta un libro o revista determinada. A algunos clientes les gusta
    el libro solo si el autor del mismo está en su lista de autores favoritos. Pero hay clientes más
    exigentes que piden que el autor esté en su lista de favoritos y además que contenga al
    menos un género de los que le gusta*/

    public  boolean leGusta(Producto producto){
        return autores.contains(producto.getAutor());
    }

    public void addCompra(Producto producto){
        if(!compras.contains(producto)){
            compras.add(producto);
        }
    }
    public boolean yaCompro(Producto producto){
        if(compras.contains(producto)){
            return true;
        }
        return false;
    }

    //METODOS SOBRE GENEROS
    public void addGeneroFavorito(String genero){
        if(!generos.contains(genero.toUpperCase())){
            generos.add(genero.toUpperCase());
        }
    }
    public boolean leGustaGenero(String genero){
        if(generos.contains(genero.toUpperCase())){
            return true;
        }
        return false;
    }

    public void noLeGustaMasGenero(String genero){
        if(generos.contains(genero.toUpperCase())){
            generos.remove(genero.toUpperCase());
        }
    }

    //METODOS SOBRE AUTORES
    public void agregarAutorFavorito(String autor){
        if(!autores.contains(autor.toUpperCase())){
            autores.add(autor.toUpperCase());
        }
    }
    public boolean leGustaAutor(String autor){
        if(autores.contains(autor.toUpperCase())){
            return true;
        }
        return false;
    }

    public void noLegustaMasAutor(String autor){
        if(autores.contains(autor.toUpperCase())){
            autores.remove(autor.toUpperCase());
        }
    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Producto otro = (Producto) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            System.out.println("No es un Producto");
        }
        return false;
    }
}
