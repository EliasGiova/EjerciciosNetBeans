
package Entidades;

import java.util.Scanner;


public abstract class Edificio {

    protected int alto;
    protected int ancho;
    protected int prof;
    protected Scanner leer;
    public Edificio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Edificio(int alto, int ancho, int prof) {
        this.alto = alto;
        this.ancho = ancho;
        this.prof = prof;
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Edificio{" + "alto=" + alto + ", ancho=" + ancho + ", prof=" + prof + '}';
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
    public void cargarEdificio(){
        
        System.out.println("Ingrese la altura de cada planta:");
        this.alto = leer.nextInt();
        System.out.println("Ingrese el ancho del edificio:");
        this.ancho = leer.nextInt();
        System.out.println("Ingrese la profundidad del edificio:");
        this.prof = leer.nextInt();
        
    }
}
