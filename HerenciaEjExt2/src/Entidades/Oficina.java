
/*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/

package Entidades;


public class Oficina extends Edificio{
    
    private int pisos;
    private int oficinas;
    private int personasXOficina;

    @Override
    public void calcularSuperficie() {
        
        System.out.println("La superficie total es: " + (super.ancho*super.prof)*this.pisos + " m2.");
        
    }

    @Override
    public void calcularVolumen() {
        
        System.out.println("El volumen total es: " + super.alto*super.ancho*super.prof + " m3.");
        
    }

    public Oficina() {
        
    }

    public Oficina(int pisos, int oficinas, int personasXOficina, int alto, int ancho, int prof) {
        super(alto, ancho, prof);
        this.pisos = pisos;
        this.oficinas = oficinas;
        this.personasXOficina = personasXOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonasXOficina() {
        return personasXOficina;
    }

    public void setPersonasXOficina(int personasXOficina) {
        this.personasXOficina = personasXOficina;
    }
    
    public void cargarOficinas (){
        super.cargarEdificio();
        System.out.println("Ingrese el numero de pisos del edificio: ");
        pisos = leer.nextInt();
        alto = alto*pisos;
        System.out.println("Ingrese el numero de oficinas por piso: ");
        oficinas = leer.nextInt();
        System.out.println("Ingrese la capacidad de cada oficina: ");
        personasXOficina = leer.nextInt();
    }
    public void cantPersonas (){
        System.out.println("La cantidad de personas por piso es: " + oficinas * personasXOficina);
        System.out.println("La cantidad de personas en todo el edificio es: " + oficinas * personasXOficina * pisos);
    }
}
