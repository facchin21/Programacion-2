package Historiador;

public class CondicionTituloPalabra implements ICondicion{
    // b) Todos los documentos cuyo título contenga una palabra o frase dada.

    private String palabra;
    public CondicionTituloPalabra(String palabra){this.palabra = palabra.toLowerCase();}

    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.getTitulo().toLowerCase().contains(this.palabra);
    }
}
