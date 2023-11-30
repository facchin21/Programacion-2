package FarmaciaPractica;

public class CondicionXNombre extends Condicion{
    private String nombre;

    public CondicionXNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return medicamento.getNombre().equals(this.nombre);
    }
}
