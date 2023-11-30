package Parcial2022;

import java.util.ArrayList;

public class ElementoObsolencia extends Elemento{
    private double descuento;
    private int obsolencia;
    private double factor;
    private ElementoInformatico apuntado;

    public ElementoObsolencia(int id, String descripcion, double valor, int antiguedad, Calculador cc, double descuento, int obsolencia, double factor, ElementoInformatico apuntado) {
        super(id, descripcion, valor, antiguedad, cc);
        this.descuento = descuento;
        this.obsolencia = obsolencia;
        this.factor = factor;
        this.apuntado = apuntado;
    }

    public boolean esObsoleto(){
        return apuntado.getAntiguedad() > obsolencia;
    }

    @Override
    public double getValor() {
        if(this.esObsoleto()){
            double aux = apuntado.getValor();
            return aux - aux * descuento *(apuntado.getAntiguedad() - obsolencia);
        }else{
            return apuntado.getValor();
        }
    }

    @Override
    public int getAntiguedad() {
        return apuntado.getAntiguedad();
    }
    @Override
    public ArrayList<Elemento> listar(Condicion c) {
        ArrayList<Elemento> salida = new ArrayList<>();
        if(this.esObsoleto()){
            return salida;
        }else{
            salida.addAll(apuntado.listar(c));
        }return salida;
    }
    public double getCostoAlquiler(){
        if(!this.esObsoleto()){
            return apuntado.getCostoAlquiler();
        }else{
            return apuntado.getCostoAlquiler() / factor;
        }
    }
}
