package Parcial2022;

public class CalculadorPorcentaje implements Calculador{
    private double porcentaje;
    @Override
    public double calcular(Elemento e) {
        return e.getValor()*(porcentaje/100);
    }
}
