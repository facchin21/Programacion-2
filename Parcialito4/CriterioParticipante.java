package Parcialito4;

public class CriterioParticipante implements ICriterio{
    private String Participante;

    public CriterioParticipante(String participante){
        this.Participante = participante;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.asiste(this.Participante);
    }
}
