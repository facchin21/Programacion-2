package Historiador;

public class CondicionPalabraClave implements ICondicion{
    // c) Todos los documentos que contengan una palabra clave dada.
    private String palabraClave;

    public CondicionPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.contienePalabra(this.palabraClave);
    }
}
