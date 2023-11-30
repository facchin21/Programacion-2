package Historiador;

public class Main {
    public static void main(String []args) {
        Historiador h1 = new Historiador("Fermin");
        Documento d1 = new Documento("Historia", "Hablamos de la historia de Argentina");
        Documento d2 = new Documento("Novela", "Hablamos de novelas importantes");
        Documento d3 = new Documento("Novela de amor", "Hablamos de novelas europeas");

        //GRAN DETALLE NO OLVIDAR AGREGAR DOCUMENTOS O LO QUE SEA AL SISTEMA PRINCIPAL
        h1.addDocumento(d1);
        h1.addDocumento(d2);
        h1.addDocumento(d3);

        ICondicion c1 = new CondicionTitulo("Novela"); //A
        ICondicion c2 = new CondicionTituloPalabra("amor"); //B
        ICondicion c3 = new CondicionPalabraClave("pais"); //C
        ICondicion c4 = new CondicionTituloPalabra("pais");//D -- NO HAGO CONSTRUCTOR EN ESTE PORQUE NO TENGO QUE BUSCAR NADA ESPECIFICO.
        ICondicion c5 = new CondicionAutor("Borges");//E
        ICondicion c6 = new CondicionPalabraClave("novelas");//F
        ICondicion c7 = new CondicionCantidadPalabras(5); //En este caso 5 palabras. G
        ICondicion c8 = new CondicionAND(c1, c3); //H


        d1.addAutor("Borges");
        d1.addPalabra("pais");
        d2.addPalabra("pais"); //AGREGO ESTA PARA PROBAR EL INCISO C.
        d1.addPalabra("rico");
        d3.addPalabra("Chequeo"); //CHEQUEO INCISO D.


        d2.addAutor("Shakespeare");
        d2.addPalabra("Poesia");

        System.out.println(h1.buscar(c1));
        System.out.println(h1.buscar(c2));
        System.out.println(h1.buscar(c3));
        System.out.println(h1.buscar(c4));
        System.out.println(h1.buscar(c5));
        System.out.println(h1.buscar(c6));
        System.out.println(h1.buscar(c7));
        System.out.println(h1.buscar(c8));

    }
}
