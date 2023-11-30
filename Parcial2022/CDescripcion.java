package Parcial2022;

public class CDescripcion implements Condicion{
    private String palabra;

    public CDescripcion(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public boolean cumple(Elemento p) {
        return p.getDescripcion().contains(palabra);
    }
}
