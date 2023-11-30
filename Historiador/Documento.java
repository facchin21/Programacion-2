package Historiador;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String continidoTextual;
    private ArrayList<String> palabraClaves;

    private int cantidadPalabras;

    public Documento(String titulo, String continidoTextual, int cantidadPalabras) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.continidoTextual = continidoTextual;
        this.palabraClaves = new ArrayList<>();
        this.cantidadPalabras = cantidadPalabras;
    }
    public Documento(String titulo, String continidoTextual) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.continidoTextual = continidoTextual;
        this.palabraClaves = new ArrayList<>();
    }
    //CONTENIDO TEXTUAL
    public boolean contieneContenido(String contenido){
        if(continidoTextual.contains(contenido)){
            return true;
        }
        return false;
    }
    //AUTOR
    public boolean contieneAutor(String autor){
        for(int i = 0; i < autores.size();i++){
            String a = autores.get(i);
            if(a.equalsIgnoreCase(autor)){
                return true;
            }
        }
        return false;
    }
    public void addAutor(String autor){
        if(!autores.contains(autor)){
            autores.add(autor);
        }
    }
    //PALABRAS CLAVES
    public boolean contienePalabra(String palabraClave){
        for(int i = 0; i < palabraClaves.size(); i++){
            String palabra = palabraClaves.get(i);
            if(palabra.equalsIgnoreCase(palabraClave))
            return true;
        }
        return false;
    }
    public void addPalabra(String palabra){
        if(!palabraClaves.contains(palabra)){
            palabraClaves.add(palabra);
        }
    }

    //GETTER AND SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContinidoTextual() {
        return continidoTextual;
    }

    public void setContinidoTextual(String continidoTextual) {
        this.continidoTextual = continidoTextual;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }
    //DOS DOCUMENTOS SON IGUALES SI TIENEN EL MISMO TITULO.
    public boolean equals(Object o) {
        try {
            Documento doc = (Documento)o;
            return doc.getTitulo().equals(titulo) && doc.getContinidoTextual().equals(continidoTextual);
        }
        catch(Exception e) {
            return false;
        }
    }

    public String toString() {
        return "Titulo: " + titulo + " - Contenido: " + continidoTextual;
    }
}
