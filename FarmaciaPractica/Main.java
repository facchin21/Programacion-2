package FarmaciaPractica;

public class Main {
    public static void main(String[] args) {
        // Para buscar todos los medicamentos que contengan “ina” (según versión alternativa)
        Condicion cond1 = new CondicionXNombre("ina");
        // Para buscar todos los medicamentos del lab “Bayer”
        Condicion cond2 = new CondicionXLab("Bayer");
        // Para buscar todos los medicamentos que contengan “ina” y sean del lab “Bayer”
        Condicion cond3 = new CondicionAND(cond1, cond2);
        // Para buscar todos los medicamentos que contengan “ina” O sean del lab “Bayer”
        Condicion cond4 = new CondicionOR(cond1, cond2);
        // Para buscar todos los medicamentos que NO contengan “ina” y no sean del lab “Bayer”
        Condicion cond5 = new CondicionNOT(cond3);

        Medicamento aspirina = new Medicamento("Aspirina", "Bayer", 1500.0);
        System.out.println(aspirina);
    }
}
