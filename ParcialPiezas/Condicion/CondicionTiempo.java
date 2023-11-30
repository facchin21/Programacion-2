package ParcialPiezas.Condicion;

import ParcialPiezas.Pieza;

public class CondicionTiempo implements Condicion{
    private double time;

    public CondicionTiempo(double time) {
        this.time = time;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }
    @Override
    public boolean cumple(Pieza p) {
        return p.getTiempoEstimado() > this.time;
    }
}
