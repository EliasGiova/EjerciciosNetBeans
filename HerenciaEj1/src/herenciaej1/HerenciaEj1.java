package herenciaej1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta.
 *
 * @author elias
 */
public class HerenciaEj1 {

    public static void main(String[] args) {
        Animal Perro1 = new Perro("Teddy", "Carne", 1, "Osito");
        System.out.println("Se llama " + Perro1.getNombre());
        Perro1.Alimentarse();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Animal Perro2 = new Perro("Terry", "Asado", 2, "Caniche");
        System.out.println("Se llama " + Perro2.getNombre());
        Perro2.Alimentarse();
        System.out.println("--------------------");
        Animal Gato1 = new Gato("Gardfield", "Gati", 3, "Anaranjado");
        System.out.println("El Gato tiene " + Gato1.getEdad());
        Gato1.Alimentarse();
        System.out.println("-----------------");
        Animal Caballo1 = new Caballo("Tornado", "Manzana", 1, "Colorado");
        System.out.println("La raza del Caballo es " + Caballo1.getRaza());
        Caballo1.Alimentarse();
    }

}
