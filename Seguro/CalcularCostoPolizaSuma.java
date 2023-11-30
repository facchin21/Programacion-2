package Seguro;

public class CalcularCostoPolizaSuma implements ICalcularCostoPoliza{
    private ICalcularCostoPoliza c1, c2;

    public CalcularCostoPolizaSuma(ICalcularCostoPoliza c1, ICalcularCostoPoliza c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int calcularCostoPoliza(Seguro s) {
        return c1.calcularCostoPoliza(s) + c2.calcularCostoPoliza(s);
    }
}
