package Seguro;

import facchin.src.CalcularPoliza;

import java.time.LocalDate;

public class SeguroTemporal extends Seguro{

    private LocalDate fechaIni;
    private LocalDate fechaFin;


    public SeguroTemporal(int dni, String descripcion, int numeroPoliza, double montoAsegurado, CalcularPoliza calcularPoliza, LocalDate fechaIni, LocalDate fechaFin) {
        super(dni, descripcion, numeroPoliza, montoAsegurado, calcularPoliza);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    @Override
    public int calcularMonto(ICalcularCostoPoliza costoPoliza) {
        if(LocalDate.now().isAfter(fechaIni)  && LocalDate.now().isBefore(fechaFin)){
            return super.calcularMonto(costoPoliza);
        }
        return 0;
    };

    @Override
    public int calcularPoliza(Seguro s) {
        return super.calcularPoliza(s);
    }
}
