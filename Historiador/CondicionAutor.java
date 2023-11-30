package Historiador;

public class CondicionAutor implements ICondicion{
    // e) Todos los documentos de un autor determinado.
    private String autor;
    public CondicionAutor(String autor){
        this.autor = autor;
    }
    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.contieneAutor(this.autor);
    }

}
