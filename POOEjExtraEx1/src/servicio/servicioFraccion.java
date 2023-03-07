/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.fraccion;
import java.util.Scanner;

/**
 *Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 * @author elias
 */
public class servicioFraccion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public fraccion crearFraccion(){
    fraccion fr = new fraccion();
        System.out.println("Primera Fracción");
        System.out.print("Digite el numero del numerador 1: ");
        fr.setNumerador1(leer.nextInt());
        do{
        System.out.print("Digite el numero del denominador 1: ");
        fr.setDenominador1(leer.nextInt());
        }while(fr.getDenominador1()==0);
        System.out.print("Digite el numero del numerador 2: ");
        fr.setNumerador2(leer.nextInt());
        do{
        System.out.print("Digite el numero del denominador 2: ");
        fr.setDenominador2(leer.nextInt());
        }while(fr.getDenominador2()==0);
    return fr;
    }
    
}