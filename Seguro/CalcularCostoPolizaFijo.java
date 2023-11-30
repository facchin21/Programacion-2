package Seguro;

public class CalcularCostoPolizaFijo implements ICalcularCostoPoliza {
    private int montoFijo;

    public CalcularCostoPolizaFijo(int montoFijo) {
        this.montoFijo = montoFijo;
    }

    public int getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(int montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public int calcularCostoPoliza(Seguro s) {
        return this.montoFijo;
    }
}
