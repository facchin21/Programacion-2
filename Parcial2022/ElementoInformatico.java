package Parcial2022;

import java.util.ArrayList;

public abstract class  ElementoInformatico {
    private int id;

    public ElementoInformatico(int id) {
        this.id = id;
    }

    public int getId(){return this.id;}
    public abstract double getValor();
    public abstract int getAntiguedad();
    public abstract ArrayList<Elemento>listar(Condicion c);
    public abstract double getCostoAlquiler();

}
