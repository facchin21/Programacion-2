package Seguro;

import facchin.src.CalcularPoliza;

public class Seguro extends SeguroAbstracto{
    private String descripcion;
    private int numeroPoliza;
    private double montoAsegurado;
    private CalcularPoliza calcularPoliza;

    public Seguro(int dni, String descripcion, int numeroPoliza, double montoAsegurado, CalcularPoliza calcularPoliza) {
        super(dni);
        this.descripcion = descripcion;
        this.numeroPoliza = numeroPoliza;
        this.montoAsegurado = montoAsegurado;
        this.calcularPoliza = calcularPoliza;
    }

    @Override
    public int calcularMonto(ICalcularCostoPoliza costoPoliza) {

        return (int) this.montoAsegurado;
    }

    @Override
    public int calcularPoliza(Seguro s) {
        return this.getNumeroPoliza();
    }

    //getter and setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

}
