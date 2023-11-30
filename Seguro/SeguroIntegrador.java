package Seguro;

import java.util.ArrayList;

public class SeguroIntegrador extends SeguroAbstracto{

    ArrayList<SeguroAbstracto> seguros;

    public SeguroIntegrador(int dni) {
        super(dni);
        this.seguros = new ArrayList<>();
    }


    @Override
    public int calcularMonto(ICalcularCostoPoliza costoPoliza) {
        int suma = 0;
        for(SeguroAbstracto ss: seguros){
            suma += ss.calcularMonto(costoPoliza);
        }
        return suma;
    }

    @Override
    public int calcularPoliza(Seguro s) {
        int max = -1;
        for(SeguroAbstracto ss : seguros){
            int aux = ss.calcularPoliza(s);
            if(aux > max){
                max = aux;
            }
        }
        return max;
    }
}
