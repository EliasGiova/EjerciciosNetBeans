/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import servicio.servicioArreglo;

/**
 *
 * @author elias
 */
public class POOEj10 {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioArreglo sa = new servicioArreglo();
        sa.crearArreglo();
        System.out.println("Arreglos Con Numeros Aleatorios");
        sa.mostrarArreglo();
        sa.ordenarArreglo();
        sa.remplazarArreglo();
        System.out.println("Arreglo A, ordenado de menor a mayor");
        System.out.println("Arreglo B, primeros 10 numeros ordenados, y luego"
                + "/nlos otros 10 con valor 0.5");
        sa.mostrarArreglo();
        
        
        
        
    }
    
}
