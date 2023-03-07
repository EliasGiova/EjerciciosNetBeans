/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
31
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package Servicies;

import Entities.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class AhorcadoService {

    Scanner leer;

    public AhorcadoService() {

        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Ahorcado crearJuego() {

        Ahorcado ahorcadoEj = new Ahorcado();

        System.out.println("Ingrese la palabra a buscar: ");
        String palabraBuscar = leer.next();

        String[] palabraVector = new String[palabraBuscar.length()];
        String[] solucionVector = new String[palabraBuscar.length()];

        for (int i = 0; i < palabraBuscar.length(); i++) {

            palabraVector[i] = palabraBuscar.substring(i, i + 1);
            solucionVector[i] = "-";
        }

        ahorcadoEj.setPalabra(palabraVector);
        ahorcadoEj.setSolucion(solucionVector);

        System.out.println("Ingrese la cantidad de intentos: ");
        ahorcadoEj.setCantidadIntentos(leer.nextInt());

        ahorcadoEj.setLetrasEncontradas(0);

        return ahorcadoEj;
    }

    public void longitud(Ahorcado ahorcadoEj) {

        System.out.println("La longitud de la palabra a encontrar es: " + ahorcadoEj.getPalabra().length);
    }

    public boolean encontradas(String letra, Ahorcado ahorcadoEj) {

        int contador = 0;
        int repetidas = 0;

        String[] solucionVector = ahorcadoEj.getSolucion();

        for (int i = 0; i < ahorcadoEj.getPalabra().length; i++) {

            if (letra.equalsIgnoreCase(ahorcadoEj.getPalabra()[i]) && !letra.equalsIgnoreCase(ahorcadoEj.getSolucion()[ i ])  && letra.length() == 1 ) {
                contador++;

                solucionVector[i] = letra;
                
            } else if ( letra.equalsIgnoreCase(ahorcadoEj.getPalabra()[i]) && letra.equalsIgnoreCase(ahorcadoEj.getSolucion()[ i ]) ){
                
                repetidas++;
            }
        }

        ahorcadoEj.setSolucion(solucionVector);

        if (contador != 0) {

            ahorcadoEj.setLetrasEncontradas(ahorcadoEj.getLetrasEncontradas() + contador);

            System.out.println("La letra está contenida dentro de la palabra.");
            System.out.println("Número de letras (encontradas, faltantes): ( " + ahorcadoEj.getLetrasEncontradas() + ", " + (ahorcadoEj.getPalabra().length - ahorcadoEj.getLetrasEncontradas()) + " )");

            System.out.println(Arrays.toString(ahorcadoEj.getSolucion()));

            return true;

        } else if  ( repetidas != 0 ) {
            
            System.out.println("Escribió una letra repetida. Perdió una chance por gil.");
            return false;
            
        } else {

            System.out.println("La letra NO está contenida dentro de la palabra.");
            System.out.println("Perdió una chance.");
            
            return false;
        }
    }

    public void intentos(Ahorcado ahorcadoEj) {

        System.out.println("Le quedan " + ahorcadoEj.getCantidadIntentos() + " intentos.");
    }

    public void juego() {

        Ahorcado ahorcadoEj = crearJuego();

        System.out.println("------------------------------------------");
        
        longitud(ahorcadoEj);

        while (ahorcadoEj.getCantidadIntentos() != 0 && ahorcadoEj.getLetrasEncontradas() != ahorcadoEj.getPalabra().length) {

            System.out.println("Ingrese una letra: ");

            String letra = leer.next();

            boolean encontrarLetra = encontradas(letra, ahorcadoEj);

            if (!encontrarLetra) {

                ahorcadoEj.setCantidadIntentos(ahorcadoEj.getCantidadIntentos() - 1);
            }

            intentos(ahorcadoEj);
            
        System.out.println("------------------------------------------");

        }
    }
}
