package Practico7.Futbol5;

import Practico7.Futbol5.Filtro.Filtro;

import java.util.ArrayList;

public class Socio extends SistemaFutbol{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pagoCuota;
    private ArrayList<Cancha> alquileres;


    public Socio(String nombre, String apellido, int edad, boolean pagoCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pagoCuota = pagoCuota;
        this.alquileres = new ArrayList<>();
    }
    public void alquilarCancha(int idCancha, double monto, int fecha) {
        alquileres.add(new Cancha(idCancha, fecha, monto));
    }

    @Override
    public ArrayList<Socio> buscar(Filtro f) {
       ArrayList<Socio> salida = new ArrayList<>();
       if(f.cumple(this)){
           salida.add(this);
       }
       return salida;
    }

    //METODOS DEL ARRAY
    public void addAlquiler(Cancha c){
        if(!alquileres.contains(c)){
            alquileres.add(c);
        }
    }
    public boolean contieneCancha(int id){
        for (Cancha c : alquileres){
           if(c.getId() == id){
               return true;
           }
        }
        return false;
    }
    public double getCosto(){
        double suma = 0;
        for (Cancha c : alquileres){
            suma += c.getCosto();
        }
        return suma;
    }

    @Override
    public int cantidadAlquilada() {
        int suma = 0;
        for (Cancha c : alquileres){
            suma+= c.cantidadAlquilada();
        }
        return suma;
    }

    public boolean contieneCancha(Cancha c){
        if(alquileres.contains(c)){
            return true;
        }
        return false;
    }
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isPagoCuota() {
        return pagoCuota;
    }
    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }
}
