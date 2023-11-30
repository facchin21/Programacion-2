package Parcialito4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos la productora
        Productora productora = new Productora();
        //creamos las actas y les agregamos participantes
        Acta acta1 = new Acta("concurso","Pedro Almodovar" ,15, 2020);
        acta1.addParticipante("Luis");
        acta1.addParticipante("Marcelo");
        acta1.addParticipante("Ariel");

        Acta acta2 = new Acta("contratacion", "Martin Scorsese",5, 2023);
        acta2.addParticipante("Lucas");
        acta2.addParticipante("Caetano");

        Acta acta3 = new Acta("convocatoria", "Pedro Almodovar", 3, 2020);
        acta3.addParticipante("Matias");
        acta3.addParticipante("Gonzalo");

        //agregamos las actas a la productora
        productora.addActa(acta1);
        productora.addActa(acta2);
        productora.addActa(acta3);

        System.out.println("Buscar todas las actas y/o resoluciones que en el título contenga la palabra “concurso” y cuyo año sea anterior a 2022.");
        CriterioTitulo fTitulo = new CriterioTitulo("concurso");
        CriterioAnio fAnio= new CriterioAnio(2022);
        CriterioAND fAnd = new CriterioAND(fTitulo, fAnio);
        ArrayList<Acta> actas = productora.getActasCriterio(fAnd);
        for (Acta a: actas ) System.out.println(a);

        System.out.println("");
        System.out.println("Buscar todas las actas y/o resoluciones en cuya lista de participantes NO contenga a “Robert de Niro” y cuyo coordinador haya sido “Pedro Almodovar”.");
        CriterioParticipante fPartic = new CriterioParticipante("Robert de Niro");
        CriterioNOT fNot = new CriterioNOT(fPartic);
        CriterioCoordinador fCoord = new CriterioCoordinador("Pedro Almodovar");
        CriterioAND fAnd2 = new CriterioAND(fNot, fCoord);
        actas = productora.getActasCriterio(fAnd2);
        for (Acta a: actas ) {
            System.out.println(a);
        }

        System.out.println("");
        System.out.println("Buscar todas las actas y/o resoluciones cuya cantidad de páginas sea menor a 20 y cuyo coordinador NO haya sido “Martin Scorsese”.");
        CriterioPagina fCantPag = new CriterioPagina(20);
        CriterioCoordinador fCoord2 = new CriterioCoordinador("Martin Scorsese");
        CriterioNOT fNot2 = new CriterioNOT(fCoord2);
        CriterioAND fAnd3 = new CriterioAND(fCantPag, fNot2);
        actas = productora.getActasCriterio(fAnd3);
        for (Acta a: actas ) {
            System.out.println(a);
        }

    }
}
