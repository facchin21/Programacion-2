package Parcialito4;

import java.util.ArrayList;

public class Acta {
    private String titulo;
    private int cantidadPaginas;
    private int anio;
    private ArrayList <String> participantes;
    private String coordinador;

    public Acta(String titulo,String coordinador, int cantidadPaginas, int anio) {
        this.titulo = titulo;
        this.coordinador = coordinador;
        this.cantidadPaginas = cantidadPaginas;
        this.anio = anio;
        this.participantes = new ArrayList<>();
    }

    public void addParticipante(String participante){
        if(!this.participantes.contains(participante)){
            this.participantes.add(participante);
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public int getAnio() {
        return anio;
    }

    public boolean asiste(String participante){
        return this.participantes.contains(participante);
    }
    public String getCoordinador(){
        return this.coordinador;
    }
    @Override
    public boolean equals(Object o) {
        try {
            Acta otra = (Acta) o;
            return this.getTitulo().equals(otra.getTitulo());
        } catch (Exception e) {
            System.out.println("No es un Acta");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Acta{" +
                "titulo='" + titulo + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                ", anio=" + anio +
                ", participantes=" + participantes +
                ", coordinador='" + coordinador + '\'' +
                '}';
    }
}
