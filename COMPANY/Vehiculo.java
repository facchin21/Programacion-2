package COMPANY;

import java.util.ArrayList;

public class Vehiculo extends VehiculoElem{
    private int precio ,anio;
    private String marca;

    public Vehiculo(int precio, int anio, String marca){
        this.precio = precio;
        this.anio = anio;
        this.marca = marca;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public int getAnio() {
        return this.anio;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public int getCantVehiculos() {
        return 1;
    }
}
