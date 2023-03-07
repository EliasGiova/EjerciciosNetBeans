/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class servicioLibro {

    public Libro altaLibro(){
        Libro l1 = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese ISBN");
        l1.setIsbn(leer.next());
        
        System.out.println("Ingrese el titulo");
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor");
        l1.setAutor(leer.next());
        
        System.out.println("Cuantas paginas tiene?");
        l1.setNumeroPag(leer.next());
        return l1;
    }
    
    public void mostrarLibro(Libro l1){
        System.out.println("El ISBN es: " + l1.getIsbn() + " \nEl titulo es: "
       + l1.getTitulo() + " \nEl autor es: " + l1.getAutor() + " \nLa cantidad de pagina es: "
               + l1.getNumeroPag());
    }
        
}