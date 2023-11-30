package Practico5;

import Practico5.FIltros.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleado lujan = new Empleado("Lujan", "Qurioga", "Backend", 200000);
        Empleado fermin = new Empleado("Fermin", "Facchin", "Front end", 210012);
        Empleado Noelia = new Empleado("Noelia", "Sayago", "Backend", 230000);
        Empleado Martin = new Empleado("Martin", "Qurioga", "Investigador", 200000);
        EmpleadoEstrella estrella = new EmpleadoEstrella("Estrellita" , "Martinez", "Todo", 9900090 );
        Grupo g1 = new Grupo("Backend");
        g1.addElemento(lujan);
        g1.addElemento(Noelia);

        Grupo g2 = new Grupo("Investigacion");

        Grupo g3 = new Grupo("Front End");
        g3.addElemento(fermin);
        g3.addElemento(estrella);

        Grupo sucTandil = new Grupo("Sucursal de Tandil");
        sucTandil.addElemento(g3);
        sucTandil.addElemento(g1);

        Grupo sucQuequen = new Grupo("Sucursal Quequen");
        sucQuequen.addElemento(g3);

        System.out.println("El grupo tiene "+sucTandil.getCantEmpleados() + " empleados totales");

        IFiltro sonFrontEnd = new FiltroEspecialidad("Front end");
        IFiltro sueldoMayor = new FiltroSueldoMayor(159000);
        ArrayList<Empleado> emplead1 = g3.empleadoConEspecialidad(new FiltroEspecialidad("Front end"));
//        ArrayList<Empleado> emplead2 = g2.empleadoConEspecialidad(new FiltroSueldoMayor(150000));

        IFiltro fComp = new FiltroOR(sonFrontEnd, sueldoMayor);
//        System.out.println("Los programadores especializados en FRONT END son: " + emplead1);
        System.out.println("El filtro compuesto: "+g1.empleadoConEspecialidad(fComp));

    }
}
