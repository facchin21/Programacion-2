package Practico5;
    import Practico5.FIltros.IFiltro;

    import java.util.ArrayList;
    import java.util.Comparator;

public class Grupo extends ElementoEmpresa {
    private ArrayList<ElementoEmpresa>elems;
    private String nombre;

    public Grupo(String nombre){
        elems = new ArrayList<>();
        this.nombre = nombre;
    }
    public boolean tieneElementos(){
        return !elems.isEmpty();
    }
    public void addElemento(ElementoEmpresa e) {
        if (!elems.contains(e)) {
            elems.add(e);
        }
    }
    @Override
    public double getGastoSueldo() {
        double suma = 0;
        for(ElementoEmpresa e: elems){
            suma += e.getGastoSueldo();
        }
        return suma;
    }
    @Override
    public int getCantEmpleados() {
        int suma = 0;
        for(ElementoEmpresa e :elems){
            suma += e.getCantEmpleados();
        }
        return suma;
    }
    @Override
    public ArrayList<Empleado> empleadoConEspecialidad(IFiltro filtro) {
        ArrayList<Empleado> salida = new ArrayList<>();
        for(ElementoEmpresa e : elems){
            ArrayList<Empleado> aux = e.empleadoConEspecialidad(filtro);
            salida. addAll(aux);
        }
        return salida;
    }
    @Override
    public ElementoEmpresa copia() {
        Grupo copia = new Grupo(this.getNombre());
        for (ElementoEmpresa e :elems){
            copia.addElemento(e.copia());
        }
        return copia;
    }
    @Override
    public ElementoEmpresa copia(IFiltro ff) {
        Grupo copia = new Grupo(this.getNombre());
        for (ElementoEmpresa e :elems){
            ElementoEmpresa copiaHijo = e.copia(ff);
            if(copiaHijo != null)
            copia.addElemento(e.copia(ff));
        }
        // VARIANTE UTILIZADA PARA SI NO SE PERMITEN GRUPOS (EN ESTE CASO) VACIOS.
        if(copia.tieneElementos()) {
            return copia;
        }else{
            return null;
        }
    }
    @Override
    public boolean equals(Object obj) {
        try{
            Grupo grupo = (Grupo) obj;
            return this.getNombre().equals(grupo.getNombre());
        } catch(Exception e){
        } return false;
    }

    //GETTER Y SETTER.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
