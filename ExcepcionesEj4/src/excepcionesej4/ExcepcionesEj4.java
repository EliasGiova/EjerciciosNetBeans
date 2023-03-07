package excepcionesej4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
 * teclado puede causar una excepción de tipo InputMismatchException, el método
 * Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
 * NumberFormatException y además, al dividir un número por cero surge una
 * ArithmeticException. Manipule todas las posibles excepciones utilizando
 * bloques try/catch para las distintas excepciones
 *
 * @author elias
 */
public class ExcepcionesEj4 {
    public static void main(String[] args) {
        leernumero();
        System.out.println("-----------");
        convertirnumero();
        System.out.println("-----------");
        dividir();
    }
    
    public static void leernumero(){
        
        System.out.println("Ingrese un numero");
        try {
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            System.out.println("El numero es " + num);
        } catch (InputMismatchException e) {
            System.out.println("Ingreso caracteres y no numeros.");
        }
    }
    
    public static void convertirnumero(){
        System.out.println("Ingrese un numero");
        try {
            Scanner leer = new Scanner(System.in);
            String num = leer.next();
            int numconvertido = Integer.parseInt(num);
            System.out.println("El numero convertido es: " + numconvertido);
        } catch(NumberFormatException e){
            System.out.println("Ingreso caracteres pero distintos de numeros");
        }
    }
    
    public static void dividir(){
        System.out.println("Ingrese un numero entero");
        
        try {
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            System.out.println("Ingrese otro numero entero");
            int num2 = leer.nextInt();
            if(num2 == 0){
                int total = (num/num2);
            }
            double total = ((double)num/(double)num2);
            System.out.println("La division es: " + total);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch (InputMismatchException e) {
            System.out.println("Has ingresado numero con coma");
        }
    }
}
