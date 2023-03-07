package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu Ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu Ataque Mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Pikachu Ataque Impac Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu Ataque Punio Trueno");
    }
}
