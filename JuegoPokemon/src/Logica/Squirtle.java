package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle Ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle Ataque Mordisco");
    }

    @Override
    public void atacarConHidroBomba() {
        System.out.println("Squirtle Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle Ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle Ataque Pistola Agua");
    }
}
