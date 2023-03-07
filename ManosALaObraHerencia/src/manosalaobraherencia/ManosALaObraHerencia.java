
package manosalaobraherencia;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

/**
 * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva
 * un saludo “Hola”. Luego haremos clase Perro y clase Gato que extiendan de
 * Animal y sobreescriban el método hacerRuido() con el ruido que corresponda a
 * cada uno. Luego, en el main vamos a crear un ArrayList de animales y los
 * siguientes animales Animal a = new Animal(); Animal b = new Perro(); Animal c
 * = new Gato(); Agregaremos a la lista a cada uno y luego, con un for each,
 * recorreremos la lista llamando al método hacerRuido() de cada ítem.
 *
 * @author elias
 */
public class ManosALaObraHerencia {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> Animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        Animales.add(a);
        Animales.add(b);
        Animales.add(c);
        
        for (Animal Animale : Animales) {
            Animale.hacerRuido();
        }
        
    }

}
