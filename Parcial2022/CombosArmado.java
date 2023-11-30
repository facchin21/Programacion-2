package Parcial2022;

import java.util.ArrayList;

public class CombosArmado extends ElementoInformatico{
    private ArrayList<ElementoInformatico> elementos;

    public CombosArmado(int id) {
        super(id);
        this.elementos = new ArrayList<>();
    }
    @Override
    public double getValor() {
        double aux = 0.0;
        for(ElementoInformatico e: elementos){
            aux += e.getValor();
        }
        return aux;
    }
    @Override
    public int getAntiguedad() {
        int max = -1;
        for (ElementoInformatico e: elementos){
           int  aux = e.getAntiguedad();
            if(aux > max){
                max = aux;
            }
        }
        return max;
    }
    @Override
    public ArrayList<Elemento> listar(Condicion c) {
        ArrayList<Elemento> salida = new ArrayList<>();
       for(ElementoInformatico e: elementos){
           salida.addAll(e.listar(c));
       }
        return salida;
    }
    public double getCostoAlquiler(){
        double aux = 0.0;
        for(ElementoInformatico e: elementos){
            aux += e.getCostoAlquiler();
        }
        return aux;
    }
}
