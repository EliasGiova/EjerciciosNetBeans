/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota(leer.next(), "Perro", "Chichi");
        System.out.println(m1.nombre + " " + m1.apodo + " " + m1.tipo);
    }
    
}
