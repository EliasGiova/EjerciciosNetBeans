/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class servicioRectangulo {
    public Rectangulo armaRc(){
        Rectangulo rc = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la dimensión de la base");
        rc.setBase(leer.nextInt());
        System.out.println("Ingrese la dimensión de la altura");
        rc.setAltura(leer.nextInt());
        return rc;
    }
    
     public int Superficie(Rectangulo rc){
        return (rc.getAltura() * rc.getAltura());
    }
     
    public int Perimetro(Rectangulo rc){
        return (rc.getAltura() + rc.getBase()) * 2;
    }
    
    public void mostrarRegtangulo(Rectangulo rc){
        for (int i = 0; i < rc.getAltura(); i++){
            for (int j = 0; j < rc.getBase(); j++){
                if(i > 0 && i < rc.getAltura()-1 && j > 0 && j < rc.getBase()-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
