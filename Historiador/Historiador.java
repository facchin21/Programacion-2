package Historiador;

import java.util.ArrayList;

public class Historiador {
    private ArrayList<Documento> documentos;
    private String nombre;

    public Historiador(String nombre){
        this.documentos = new ArrayList<>();
        this.nombre = nombre;
    }
    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDocumento(Documento nuevo) {
        if(!documentos.contains(nuevo)) {
            documentos.add(nuevo);
        }
    }
    //MODELO PARA HACER FILTRO POR CONDICIONES QUE SE INDIQUEN.
    public ArrayList<Documento> buscar(ICondicion condicion ){
        ArrayList<Documento> retorno = new ArrayList<>();
        for (int i = 0; i < documentos.size(); i++) {
            Documento actual = documentos.get(i);
            if (condicion.cumpleCondicion(actual) )
                retorno.add(documentos.get(i));
        }
        return retorno;
    }
}
