package Recuperatorio;

import Recuperatorio.Filtros.Filtro;

public class NoticiaPrivada extends Noticia{
    public NoticiaPrivada(String categoria, String contenido, String titulo, String autor) {
        super(categoria, contenido, titulo, autor);
    }

    @Override
    public ElementoPortal copia(Filtro ff) {
        return null;
    }
}
