package pokemon;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu(){

    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy Pikachu y este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("hola soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("hola soy Pikachu y este es mi ataque Punio Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("hola soy Pikachu y este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("hola soy Pikachu y este es mi ataque Rayo Carga");
    }
}
