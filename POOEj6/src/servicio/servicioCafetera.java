/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos: • Constructor predeterminado o
 * vacío • Constructor con la capacidad máxima y la cantidad actual • Métodos
 * getters y setters. • Método llenarCafetera(): hace que la cantidad actual sea
 * igual a la capacidad máxima. • Método servirTaza(int): se pide el tamaño de
 * una taza vacía, el método recibe el tamaño de la taza y simula la acción de
 * servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará
 * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó
 * la taza. • Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author elias
 */
public class servicioCafetera {
    Scanner leer = new Scanner(System.in); 
    public Cafetera llenarCafetera(){
        Cafetera mc = new Cafetera();
        System.out.println("Con cuanto CC quiere llenar la Cafetera?");
        mc.setCantidadActual(leer.nextInt());
        mc.setCapacidadMaxima(mc.getCantidadActual());
        return mc;
    }
    
    public void servirTaza(Cafetera mc){
        System.out.println("Cuanto cc tiene la taza que quiere llenar?");
        int cc = leer.nextInt();
        if(mc.getCantidadActual() >= cc){
            mc.setCantidadActual(mc.getCantidadActual()-cc);
            System.out.println("Se lleno su taza de " + cc + "cc con " + cc + "cc de un buen cafe, DISFRUTE!!!");
            System.out.println("En la cafetera queda " + mc.getCantidadActual());
        }else if(mc.getCantidadActual()<=0){
            System.out.println("No hay mas Cafe, vuelva a llenar");
        }else{
            System.out.println("Su taza se lleno con " + mc.getCantidadActual() + "cc porque estaba con poco cafe");
            mc.setCantidadActual(mc.getCantidadActual()-cc);
        }
    }
    
    public void vaciarCafetera(Cafetera mc){
        mc.setCantidadActual(0);
        System.out.println("Se ha vaciado su cafetera");
        System.out.println("Total de cafe es: " + mc.getCantidadActual() + "cc");
    }
    
    public void agregarCafe(Cafetera mc){
        System.out.println("Cuanto cc de cafe desea Agregar?"+
        "\nRecuerde que su capacidad maxima es: " + mc.getCapacidadMaxima()+"cc");
        int mascafe = leer.nextInt();
        if (mc.getCapacidadMaxima()>= mc.getCantidadActual() && (mc.getCantidadActual()+mascafe)<= mc.getCapacidadMaxima()){
            mc.setCantidadActual(mc.getCantidadActual()+mascafe);
            System.out.println("La Cafetera tiene" + mc.getCantidadActual() + "cc");
        }else{
            System.out.println("No Puede agregar esa cantidad, porque se excede del limite");
        }
    }
    
    public void mostrarCafe(Cafetera mc){
        System.out.println("Su Cafetera Tiene: " + mc.getCantidadActual() + "cc");
    }
}
