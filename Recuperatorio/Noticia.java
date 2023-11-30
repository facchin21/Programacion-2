package Recuperatorio;

import Recuperatorio.Filtros.Filtro;

import java.util.ArrayList;

public class Noticia extends ElementoPortal{
    private String contenido;
    private String titulo;
    private String autor;
    private ArrayList<String> palabrasClaves;

    public Noticia(String categoria, String contenido, String titulo, String autor) {
        super(categoria);
        this.contenido = contenido;
        this.titulo = titulo;
        this.autor = autor;
        this.palabrasClaves = new ArrayList<>();
    }

    @Override
    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(this.palabrasClaves);
    }

    @Override
    public ElementoPortal copia(Filtro ff) {
        if(ff.cumple(this)){
            Noticia copia = new Noticia( this.getCategoria(), this.getContenido(), this.getTitulo(), this.getAutor());
            for(String s: this.palabrasClaves){
                copia.addPlabraClave(s);
            }
            return copia;
        }
        return null;
    }

    public void addPlabraClave(String palabra){
        if(!palabrasClaves.contains(palabra)){
            palabrasClaves.add(palabra);
        }
    }
    //GETTERS Y SETTERS.
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
