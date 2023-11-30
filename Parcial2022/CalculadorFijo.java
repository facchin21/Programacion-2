package Parcial2022;

public class CalculadorFijo implements Calculador{
    private double montoFijo;
    @Override
    public double calcular(Elemento e) {
        return montoFijo;
    }
}
