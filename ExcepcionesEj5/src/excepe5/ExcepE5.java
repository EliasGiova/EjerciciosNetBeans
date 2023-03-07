/*
EGG Progamacion
 */
package excepe5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @Ieme
 */
public class ExcepE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = (int) (Math.random() * 501);
        System.out.println(num);
        Scanner leer;
        int contador = 0;
        int intento = 0;
        do {

            System.out.println("Ingrese su opcion");
            try {

                leer = new Scanner(System.in).useDelimiter("\n");
                intento = leer.nextInt();

                if (intento < num) {
                    System.out.println("El numero es mayor");

                }
                if (intento > num) {
                    System.out.println("El numero es menor");

                }

            } catch (InputMismatchException e) {
                System.out.println("Ingreso erroneo, solo numeros!!!!");

            } finally {
                contador++;

            }

        } while (intento != num);

        System.out.println("Adivino el numero con " + contador + " intentos");

    }

}
