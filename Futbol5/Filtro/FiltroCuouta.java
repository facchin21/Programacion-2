package Practico7.Futbol5.Filtro;

import Practico7.Futbol5.Socio;

public class FiltroCuouta implements Filtro{
    private boolean pagoRealizado;

    public FiltroCuouta(boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    public boolean isPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    @Override
    public boolean cumple(Socio ss) {
        if(!pagoRealizado){
            return false;
        }else{
            return true;
        }
    }

}
