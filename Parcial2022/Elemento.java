package Parcial2022;

import java.util.ArrayList;

public class Elemento extends ElementoInformatico{
        private String descripcion;
        private double valor;
        private int antiguedad;
        Calculador cc;

        public Elemento(int id, String descripcion, double valor, int antiguedad, Calculador cc) {
                super(id);
                this.descripcion = descripcion;
                this.valor = valor;
                this.antiguedad = antiguedad;
                this.cc = cc;
        }
        public double getCostoAlquiler(){
                return cc.calcular(this);
        }

        @Override
        public double getValor() {
                return this.valor;
        }

        @Override
        public int getAntiguedad() {
                return this.antiguedad;
        }

        @Override
        public ArrayList<Elemento> listar(Condicion c) {
                ArrayList<Elemento> salida = new ArrayList<>();
                if(c.cumple(this)){
                        salida.add(this);
                }
                return salida;
        }

        public String getDescripcion() {
                return descripcion;
        }
        //getter and setter
        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public void setAntiguedad(int antiguedad) {
                this.antiguedad = antiguedad;
        }

        public Calculador getCc() {
                return cc;
        }

        public void setCc(Calculador cc) {
                this.cc = cc;
        }
}
