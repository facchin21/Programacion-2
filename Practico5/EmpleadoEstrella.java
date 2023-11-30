package Practico5;

import Practico5.FIltros.IFiltro;

import java.util.ArrayList;

public class EmpleadoEstrella extends Empleado{

    public EmpleadoEstrella(String nombre, String apellido, String especialidad, double sueldo) {
        super(nombre, apellido, especialidad, sueldo);
    }

    @Override
    public ArrayList<Empleado> empleadoConEspecialidad(IFiltro ff) {
        ArrayList<Empleado> salida = new ArrayList<>();
        salida.add(this);
        return salida;
    }

    @Override
    public ElementoEmpresa copia() {
        return new EmpleadoEstrella(this.getNombre(), this.getApellido(),
                this.getEspecialidad(), this.getGastoSueldo());
    }
}
