
package Entidades;


public class Polideportivo extends Edificio{

    private boolean techo;
    private String nombre;

    public Polideportivo() {
    }

    public Polideportivo(boolean techo, String nombre, int alto, int ancho, int prof) {
        super(alto, ancho, prof);
        this.techo = techo;
        this.nombre = nombre;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie total es: " + super.ancho*super.prof + " m2.");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen total es: " + super.alto*super.ancho*super.prof + " m3.");
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cargarPolideportivo(){
        super.cargarEdificio();
        System.out.println("Ingrese el nombre del polideportivo: ");
        nombre = leer.next();
        System.out.println("El complejo es techado ? (S/N)");
        String elec = leer.next();
        if (elec.equalsIgnoreCase("s")) {
            techo =true;
        } else if (elec.equalsIgnoreCase("n")) {
            techo = false;
        } else {
            System.out.println("La opcion ingresada es incorrecta, por defecto es sin techo");
            techo = false;
        }
    }
    
    
}
