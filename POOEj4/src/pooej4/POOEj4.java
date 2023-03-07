/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import entidad.Rectangulo;
import servicio.servicioRectangulo;

/**
 *
 * @author elias
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioRectangulo sr = new servicioRectangulo();
        Rectangulo rc = sr.armaRc();
        System.out.println("La superficie es: " + sr.Superficie(rc));
        System.out.println("El perimetro es: " + sr.Perimetro(rc));
        sr.mostrarRegtangulo(rc);
    }
    
}
