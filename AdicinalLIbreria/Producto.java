package AdicinalLIbreria;

import java.util.ArrayList;

public  class Producto {
    private String nombre;
    private String autor;
    private double precio;
    private int cantPaginas;
    private String resumen;
    private ArrayList<String> generos;

    public Producto(String nombre, String autor, double precio, int cantPaginas, String resumen) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.cantPaginas = cantPaginas;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
    }

    //AGREGO LOS GENEROS COMPROBANDO QUE NOS LOS CONTENGA Y OBLIGO QUE SE PASE TODO A MAYUSCULAS.
    public void addGenero(String genero){
        if(!generos.contains(genero.toUpperCase())){
            generos.add(genero.toUpperCase());
        }
    }
    //AGREGO TODOS LOS ELEMENTOS REUTILIZANDO EL ADDGENERO DE 1 A 1.
    public void addGenero(ArrayList <String> generos){
        for(int i = 0; i < generos.size(); i++){
            this.addGenero(generos.get(i));
        }
    }
    //PREGUNTAMOS SI TENE EL GENERO Y LO BORRAMOS (SIEMPRE MANTENIENDO NUESTRAS "PALABRAS" EN MAYUSCULA).
    public void borrarGenero(String genero){
        if(generos.contains(genero.toUpperCase())){
            generos.remove(genero.toUpperCase());
        }
    }

    //MANTEGO EL CONTROL PREGUNTANDO SI CONTIENE EL GENERO Y SIEMPRE UTILIZO LAS "PALABRAS" EN MAYUSCULAS.
    public boolean tieneGenero(String genero){
        return generos.contains(genero.toUpperCase());
    }


    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
}
