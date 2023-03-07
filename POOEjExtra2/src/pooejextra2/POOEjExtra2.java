/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextra2;

import entidad.Punto;
import servicio.servicioPunto;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos.
 *
 * @author elias
 */
public class POOEjExtra2 {

    public static void main(String[] args) {
        servicioPunto sp = new servicioPunto();
        Punto cp = sp.crearPuntos();
        System.out.println("La distancia de Ambos Puntos es: " + sp.distanciaPuntos(cp));
    }
}
