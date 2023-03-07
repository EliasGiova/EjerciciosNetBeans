package excepcionesej3;

import java.util.Scanner;

/**
 * Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
 * para leer dos números en forma de cadena. A continuación, utilice el método
 * parseInt() de la clase Integer, para convertir las cadenas al tipo int y
 * guardarlas en dos variables de tipo int. Por ultimo realizar una división con
 * los dos numeros y mostrar el resultado.
 *
 * @author elias
 */
public class ExcepcionesEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        String cadena1 = leer.next();
        System.out.println("Ingrese otro numero");
        String cadena2 = leer.next();
        try{
            int num1 = Integer.parseInt(cadena1);
            int num2 = Integer.parseInt(cadena2);
            System.out.println("El resultado es" + divisionNumero(num1, num2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static int divisionNumero(int num1, int num2) throws Exception{
        int total = 0;
        if (num2==0){
            throw new Exception("El segundo numero no puede ser cero");
        }else{
            total = num1/num2;
        }
        return total;
    }
}
