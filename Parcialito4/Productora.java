package Parcialito4;

import java.util.ArrayList;

public class Productora {

    private ArrayList<Acta> actas;

    public Productora(){
        this.actas = new ArrayList<>();}
    public void addActa(Acta acta){
        if(!this.actas.contains(acta)){
            this.actas.add(acta);
        }
    }
    public ArrayList<Acta> getActasCriterio(ICriterio criterio){
        ArrayList<Acta>resultado = new ArrayList<>();
        for(Acta acta:this.actas){
            if(criterio.cumple(acta)){
                resultado.add(acta);
            }
        }
        return resultado;
    }
}
