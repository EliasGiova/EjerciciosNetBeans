/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextraex1;

import entidad.fraccion;
import servicio.servicioFraccion;

/**
 *Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 * @author elias
 */
public class POOEjExtraEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioFraccion sf = new servicioFraccion();
        fraccion fr = sf.crearFraccion();
       
    }
    
}
