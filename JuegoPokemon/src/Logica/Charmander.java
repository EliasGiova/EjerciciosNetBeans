package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander Ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander Ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander Ataque Punio Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander Ataque Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander Ataque Ascuas");
    }
}
