/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;

/**
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un
 * arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números,
 * también reales. El programa deberá inicializar el arreglo A con números
 * aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de
 * menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20
 * elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los
 * dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 *
 * @author elias
 */
public class servicioArreglo {

    double ArregloA[] = new double[50];
    double ArregloB[] = new double[20];

    /**
     * Metodo para llenar un arreglo con numeros aleatorios
     */
    public void crearArreglo() {
        for (int i = 0; i < ArregloA.length; i++) {
            ArregloA[i] = Math.random() * 100;
        }
        for (int i = 0; i < ArregloB.length; i++) {
            ArregloB[i] = Math.random() * 100;
        }
    }
    
    /**
     * Una de las funciones útiles de Arrays es toString (),
     * que toma un array de varios tipos de datos como int y char
     * y devuelve una representación de cadena del array.
     */
    public void mostrarArreglo(){
        System.out.println(" " + Arrays.toString(ArregloA));
        System.out.println(" " + Arrays.toString(ArregloB));
    }
    
    /**
     * El método Array.Sort () ordena el array en orden ascendente.
     */
    public void ordenarArreglo() {
        Arrays.sort(ArregloA);
    }

    /**
     * Utilice el método Arrays.fill () para rellenar elementos en un array de
     * Java
     */
    public void remplazarArreglo() {
        Arrays.fill(ArregloB, 10, 20, 0.5);

        for (int i = 0; i < 10; i++) {
            if (i < 10) {
                ArregloB[i] = ArregloA[i];
            }
        }
    }
}
