/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra5;

import entidad.Mes;
import java.util.Scanner;

/**
 *Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 * @author elias
 */
public class POOEjExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mes mm = new Mes();
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a jugar, Adivine el mes");
        String resp = leer.next();
        while(!resp.equalsIgnoreCase(mm.getAdivinanza())){
            System.out.println("Incorrecto, intente de nuevo, loser");
            resp = leer.next();
        }
        System.out.println("Adivinaste!!!, genial vuelve cuando quieras");
        System.out.println("");
        System.out.println("Vamos a jugar una vez mas!!!");
        Mes mm2 = new Mes();
        System.out.println("Vamos a jugar, Adivine el mes");
        resp = leer.next();
        while(!resp.equalsIgnoreCase(mm2.getAdivinanza())){
            System.out.println("Incorrecto, intente de nuevo, loser");
            resp = leer.next();
        }
        System.out.println("Adivinaste!!!, genial vuelve cuando quieras");
    }
}
