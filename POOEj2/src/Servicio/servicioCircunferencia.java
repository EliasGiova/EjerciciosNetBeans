/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class servicioCircunferencia {
    
    public Circunferencia Radio(){
        Circunferencia cf = new Circunferencia();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De cuanto es el Radio?");
        cf.setRadio(leer.nextDouble());
        return cf;
    }
    public void area(Circunferencia cf){
            System.out.println("El area es de: " + cf.getRadio()*cf.getRadio()*Math.PI);
    }
    
    public void perimetro(Circunferencia cf){
        System.out.println("El Perimetro es de: " + cf.getRadio()*2*Math.PI);
    }
}
