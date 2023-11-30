package AdicinalLIbreria;

public class ClienteExigente extends Cliente{

    public ClienteExigente(String nombre, String apellido, int dni, String direccion) {
        super(nombre, apellido, dni, direccion);
    }

    @Override
    public boolean leGusta(Producto producto) {
        boolean seguir = super.leGusta(producto);
        if(seguir){
            for(int i = 0; i < generos.size(); i++){
                if(producto.tieneGenero(generos.get(i))){
                    return true;
                }
            }
        }
        return false;
    }
}
