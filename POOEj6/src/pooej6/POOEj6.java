/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import java.util.Scanner;
import servicio.servicioCafetera;

/**
 *  Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 * @author elias
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCafetera sc = new servicioCafetera();
        Cafetera mc = sc.llenarCafetera();
        int resp;
        do{
            System.out.println("Menu Cafetera");
            System.out.println("1-Servir Taza");
            System.out.println("2-Agregar Cafe");
            System.out.println("3-Mostrar Cafe");
            System.out.println("4-Vaciar Cafetera");
            System.out.println("5-Salir del Menu");
            resp = leer.nextInt();
            switch(resp){
                case 1: sc.servirTaza(mc);
                break;
                case 2: sc.agregarCafe(mc);
                break;
                case 3: sc.mostrarCafe(mc);
                break;
                case 4: sc.vaciarCafetera(mc);
                break;
                case 5: break;
                default: System.out.println("Opcion no Valida");
                break;
            }
        }while (resp != 5);
        System.out.println("Muchas Gracias!!!");
    }  
}
