package Seguro;

public abstract class SeguroAbstracto {
    private int dni;

    public SeguroAbstracto(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public abstract int calcularMonto(ICalcularCostoPoliza Icalcular);
    public abstract int calcularPoliza(Seguro s);
}
