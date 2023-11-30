package FarmaciaPractica;

public class Medicamento {
    String lab;
    String nombre;
    double precio;
    public Medicamento(String nombre, String lab, double precio){
        this.lab = lab;
        this.nombre = nombre;
        this.precio = precio;
    }

    //GETTERS
    public String getLab() {
        return lab;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "lab=' " + lab + '\'' +
                ", nombre=' " + nombre + '\'' +
                ", precio= " + precio +
                '}';
    }
}
