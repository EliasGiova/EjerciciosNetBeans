

/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */


package ejextra2guia10;

import Entidades.Edificio;
import Entidades.Oficina;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class EjExtra2Guia10 {

    public static void main(String[] args) {
        Polideportivo poli1 = new Polideportivo();
        Polideportivo poli2 = new Polideportivo();
        Oficina ofic1 = new Oficina();
        Oficina ofic2 = new Oficina();
        poli1.cargarPolideportivo();
        poli2.cargarPolideportivo();
        ofic1.cargarOficinas();
        ofic2.cargarOficinas();
        ArrayList <Edificio> edificios = new ArrayList<>();
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(ofic1);
        edificios.add(ofic2);
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            if (edificio.getClass().equals(Oficina.class)) {
                Oficina of = (Oficina) edificio;
                of.cantPersonas();
            } else if (edificio.getClass().equals(Polideportivo.class)) {
                Polideportivo pol = (Polideportivo) edificio;
                if (pol.isTecho()) {
                    System.out.println("El polideportivo " + pol.getNombre() + " es techado.");
                } else {
                    System.out.println("El polideportivo " + pol.getNombre() + " no es techado.");
                }
            }
        }
    }
}
