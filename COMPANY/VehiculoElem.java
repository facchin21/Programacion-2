package COMPANY;

public abstract class VehiculoElem implements Comparable<VehiculoElem>{
    public abstract int getPrecio();
    public abstract int getAnio();
    public abstract String getMarca();
    public abstract int getCantVehiculos();

    @Override
    public int compareTo(VehiculoElem v){
      if(this.getPrecio() < v.getPrecio()){
          return -1;
      } else if (this.getPrecio() > v.getPrecio()) {
          return 1;
      }else{
          return 0;
      }
    };
}
