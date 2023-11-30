package Practico5;



import Practico5.FIltros.IFiltro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoEmpresa {
    public abstract double getGastoSueldo();
    public abstract int getCantEmpleados();
    //    BUSQUEDA SERIA
    public abstract ArrayList<Empleado> empleadoConEspecialidad(IFiltro ff);
    public ArrayList<Empleado> empleadoConEspecialidad(IFiltro ff, Comparator<Empleado> orden){
        ArrayList<Empleado> temp = this.empleadoConEspecialidad(ff);
        Collections.sort(temp, orden);
        return temp;
    }


//    UTILIZADOS PARA COPIA RESPETANDO LA ESTRUCTURA.
    public abstract ElementoEmpresa copia();
    public abstract ElementoEmpresa copia(IFiltro ff);
}
