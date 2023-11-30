package Recuperatorio;

import Recuperatorio.Filtros.Filtro;

import java.util.ArrayList;

public class Portal{
    private ArrayList<Suscriptor> suscriptors;
    private ElementoPortal categoriaRaiz;

    public Portal() {
        this.suscriptors = new ArrayList<>();
    }

    public void repartirNoticiaASuscriptores(Noticia noticia){
        for(Suscriptor suscriptor:suscriptors){
            suscriptor.recibirNoticia(noticia);
        }
    }
}
