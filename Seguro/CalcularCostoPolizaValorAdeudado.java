package Seguro;

public class CalcularCostoPolizaValorAdeudado implements ICalcularCostoPoliza {

   private double porcentaje;

    public CalcularCostoPolizaValorAdeudado( double porcentaje) {
        this.porcentaje = porcentaje;
    }


    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int calcularCostoPoliza(Seguro s) {
        return (int) (s.getMontoAsegurado() * (porcentaje / 100));
    }
}
