package FarmaciaPractica;

public class CondicionXPrecio extends Condicion{
    private double precio;

    public CondicionXPrecio(double precio){
        this.precio = precio;
    }


    @Override
    public boolean cumpleCondicion(Medicamento medicamento) {
        return medicamento.getPrecio() == (this.precio);
    }
}
