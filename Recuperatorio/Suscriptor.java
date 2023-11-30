package Recuperatorio;

import Recuperatorio.Filtros.Filtro;
import Recuperatorio.Filtros.FiltroAnd;

import java.util.ArrayList;

public class Suscriptor{
    private String nombre;
    private String email;
    private String apellido;
    private Filtro intereces;
    private ArrayList<Noticia> noticiasRecibidas;

    public Suscriptor(String nombre, String email, String apellido, Filtro intereces) {
        this.nombre = nombre;
        this.email = email;
        this.apellido = apellido;
        this.intereces = intereces;
        this.noticiasRecibidas = new ArrayList<>();
    }

    public void cambiarIntereses(Filtro nuevoInteres){
        this.intereces = nuevoInteres;
    }
    public void agregarInteres(Filtro nuevoInteres){
        Filtro and = new FiltroAnd(this.intereces, nuevoInteres);
    }
    public void recibirNoticia(Noticia noticia){
        if(intereces.cumple(noticia)){
            this.noticiasRecibidas.add(noticia);
        }
    }
}
