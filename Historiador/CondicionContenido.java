package Historiador;

public class CondicionContenido implements ICondicion{
    // f) Todos los documentos cuyo contenido tenga una palabra o frase dada
    private String contenidoTextual;

    public CondicionContenido(String contenidoTextual){
        this.contenidoTextual = contenidoTextual;
    }
    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.contieneContenido(contenidoTextual);
    }
}
