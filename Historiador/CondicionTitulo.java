package Historiador;

public class CondicionTitulo implements ICondicion{
    //a) Todos los documentos cuyo título sea exactamente igual a un título dado.
    private String titulo;
    public CondicionTitulo(String titulo){
        this.titulo = titulo.toLowerCase();
    }

    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.getTitulo().toLowerCase().equals(this.titulo);
    }
}
