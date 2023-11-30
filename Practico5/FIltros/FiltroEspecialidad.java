package Practico5.FIltros;

import Practico5.Empleado;

public class FiltroEspecialidad implements IFiltro{
    private String especialidad;

    public FiltroEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean cumple(Empleado ee) {
        return ee.getEspecialidad().equals(this.especialidad);
    }

}
