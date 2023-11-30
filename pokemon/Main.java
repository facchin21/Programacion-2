package pokemon;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        System.out.println("-----------SQUIRTLE---------");
        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();

        System.out.println("-----------CHARMANDER---------");
        charmander.atacarAraniazo();
        charmander.atacarAscuas();

        System.out.println("-----------BULBASAUR---------");
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarHojaAfilada();

        System.out.println("-----------PIKACHU---------");
        pikachu.atacarRayo();
        pikachu.atacarPunioTrueno();
    }
}
