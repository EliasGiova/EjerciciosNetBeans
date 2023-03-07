/*
 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio4guia10;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 *
 * @author FrancoSca
 */
public class Ejercicio4Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo cir = new Circulo (15);
        Rectangulo rec = new Rectangulo(15, 7);
        
        System.out.println("El area del circulo es: " + cir.calcularArea());
        System.out.println("El perimetro del circulo es: " + cir.calcularPerimetro());
        System.out.println("El area del rectangulo es: " + rec.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rec.calcularPerimetro());
        
    }
    
}
