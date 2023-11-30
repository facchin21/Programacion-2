package ParcialPiezas.Condicion;

import ParcialPiezas.Pieza;

public class CondicionColor implements Condicion{
    private String color;

    public CondicionColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean cumple(Pieza p) {
        return (p.getColor().contains(this.color));
    }
}
