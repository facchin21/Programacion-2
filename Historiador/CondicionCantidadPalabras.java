package Historiador;

public class CondicionCantidadPalabras implements ICondicion{
    private int cantidadPalabras;
    public CondicionCantidadPalabras(int cantidadPalabras){
        this.cantidadPalabras = cantidadPalabras;
    }
    @Override
    public boolean cumpleCondicion(Documento documento) {
        return documento.getCantidadPalabras() > this.cantidadPalabras;
    }
}
