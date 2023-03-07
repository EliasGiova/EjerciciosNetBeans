/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra1;

import entidad.Cancion;
import java.util.Scanner;

/**
 *Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 * @author elias
 */
public class POOEjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion nc = new Cancion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo de la cancion?");
        nc.setTitulo(leer.next());
        System.out.println("Ingrese el autor de la cancion");
        nc.setAutor(leer.next());
        System.out.println("El Titulo es " + nc.getTitulo() + " y el Autor es "
                + nc.getAutor());
    }
    
}
