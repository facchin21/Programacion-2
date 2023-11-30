package FarmaciaPractica;

import java.util.ArrayList;
public class Farmacia {
    ArrayList <Medicamento> medicamentos;

    public Farmacia(){
        this.medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento nuevo){
        this.medicamentos.add(nuevo);
    }
    public ArrayList<Medicamento> buscarMedicamento(Condicion c){
        ArrayList<Medicamento> lista = new ArrayList<>();
        for (int i = 0; i < medicamentos.size(); i ++){
            Medicamento medicamento = (Medicamento)this.medicamentos.get(i);
            if(c.cumpleCondicion(medicamento)) {
                lista.add((Medicamento)this.medicamentos.get(i));
            }
        }
        return lista;
    }

}
