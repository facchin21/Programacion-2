package COMPANY;

import java.util.ArrayList;

public class Lote extends VehiculoElem{
    private String nombre;
    private ArrayList<VehiculoElem> elementos;

    public Lote(String nombre){
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }


    @Override
    public int getPrecio() {
        int suma = 0;
        for(VehiculoElem v: elementos){
            suma += v.getPrecio();
        }
        return suma;
    }

    @Override
    public int getAnio() {
        int suma = 0;
        for(VehiculoElem v : elementos){
            suma += v.getPrecio();
        }
        return (suma/elementos.size());
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public int getCantVehiculos() {
        int cantidad = 0;
        for(VehiculoElem v: elementos){
            cantidad += getCantVehiculos();
        }
        return cantidad;
    }

    public void addElem(VehiculoElem v){
        elementos.add(v);
    };
}
