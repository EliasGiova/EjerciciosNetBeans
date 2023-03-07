package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur Ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur Ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur Ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur Ataque Paralizar");
    }
    
}
