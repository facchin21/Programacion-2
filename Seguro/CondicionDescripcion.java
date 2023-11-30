package Seguro;

import Historiador.ICondicion;

public class CondicionDescripcion implements Filtrar {
    private String palabra;

    public CondicionDescripcion(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ICondicion cc) {
        return false;
    }
}

//    @Override
//    public boolean cumple(ICondicion cc) {
//        return cc.cumpleCondicion();
//    }
//}
