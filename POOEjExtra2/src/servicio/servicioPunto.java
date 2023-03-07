/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Punto;
import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 * @author elias
 */
public class servicioPunto {
    /**
     * Calcular la distancia entre dos puntos en Java Por ejemplo,
     * los dos puntos X y Y tienen las coordenadas (x1, y1) y (x2, y2),
     * la distancia entre estos dos puntos se puede denotar como XY,
     * y el teorema de Pitágoras se puede implementar en Java para
     * calcular la distancia como raiz((x2-x1)^2+(y2-y1)^2).
     * @return 
     */
    Scanner leer = new Scanner(System.in);
    public Punto crearPuntos(){
        Punto cp = new Punto();
        System.out.println("Digite las coordenadas del P1(x1,y1): ");
        System.out.print("x1: ");
        cp.setX1(leer.nextDouble());
        System.out.print("y1: ");
        cp.setY1(leer.nextDouble());
        System.out.println("Digite las coordenadas del P2(x2,y2): ");
        System.out.print("x2: ");
        cp.setX2(leer.nextDouble());
        System.out.print("y2: ");
        cp.setY2(leer.nextDouble());
        return cp;
    }

    /**
     * La función Math.sqrt() devuelve la raíz cuadrada de un número.
     * Math.pow() devuelve el valor de un número elevado a otro número.
     * Math.pow(base, exponente), donde base es el número base
     * y exponente es el número al que se eleva la base.
     * P1(x1,y1), P2(x2,y2)
     * Distancia(P1,P2) = raiz((x2-x1)^2+(y2-y1)^2)
     * @param cp
     * @return 
     */
    public double distanciaPuntos(Punto cp){ 
        return Math.sqrt(Math.pow((cp.getX2()-cp.getX1()), 2)
                +(Math.pow(cp.getY2() - cp.getY1(), 2)));
    }
    
}
