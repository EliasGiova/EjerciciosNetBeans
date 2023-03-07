/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Raiz;
import java.util.Scanner;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, las operaciones que se
 * podrán realizar son las siguientes: • Método getDiscriminante(): devuelve el
 * valor del discriminante (double). El discriminante tiene la siguiente
 * formula: (b^2)-4*a*c • Método tieneRaices(): devuelve un booleano indicando
 * si tiene dos soluciones, para que esto ocurra, el discriminante debe ser
 * mayor o igual que 0. • Método tieneRaiz(): devuelve un booleano indicando si
 * tiene una única solución, para que esto ocurra, el discriminante debe ser
 * igual que 0. • Método obtenerRaices(): llama a tieneRaíces() y si
 * devolvió́true, imprime las 2 posibles soluciones. • Método obtenerRaiz():
 * llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es en el caso
 * en que se tenga una única solución posible. • Método calcular(): esté método
 * llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
 * soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o
 * obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no
 * existir solución, se mostrará un mensaje. Nota: Formula ecuación 2o grado:
 * (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 *
 * @author elias
 */
public class servicioRaiz {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Raiz coeficientes(){
        Raiz cf = new Raiz();
        System.out.print("Ingrese el Coeficiente A: ");
        cf.setA(leer.nextDouble());
        System.out.print("Ingrese el Coeficiente B: ");
        cf.setB(leer.nextDouble());
        System.out.print("Ingrese el Coeficiente C: ");
        cf.setC(leer.nextDouble());
        return cf;
    }
    
    public double Discriminante(Raiz cf){
        //formula: (b^2)-4*a*c
        return (Math.pow(cf.getB(), 2))-(4*cf.getA()*cf.getC());
    }
    
    public boolean tieneRaices(Raiz cf){
        boolean raices = false; 
        if(Discriminante(cf)>0){
        raices = true;
        }
        return raices;
    }
    
    public boolean tieneRaiz(Raiz cf){
        boolean raiz = false;
        if(Discriminante(cf)==0){
            raiz = true;
        }
        return raiz;
    }
    
    public void obtenerRaices(Raiz cf){
        double raiz1= (-cf.getB()+Math.sqrt((Math.pow(cf.getB(), 2))-(4*cf.getA()*cf.getC())))/(2*cf.getA());
        double raiz2= (-cf.getB()-Math.sqrt(Math.pow(cf.getB(), 2)-(4*cf.getA()*cf.getC())))/(2*cf.getA());
        if(tieneRaiz(cf)==true){
            if(raiz1==raiz2){
                System.out.println("La raiz es: " + raiz1);
            }
        }  
    }
    
    public void calcular(Raiz cf){
        double raiz1= (-cf.getB()+Math.sqrt((Math.pow(cf.getB(), 2))-(4*cf.getA()*cf.getC())))/(2*cf.getA());
        double raiz2= (-cf.getB()-Math.sqrt(Math.pow(cf.getB(), 2)-(4*cf.getA()*cf.getC())))/(2*cf.getA());
        if(tieneRaices(cf)==true && raiz1!=raiz2){
            System.out.println("Una Raiz es: " + raiz1);
            System.out.println("Otra Raiz es: " + raiz2);
        }else if(tieneRaices(cf)==false && tieneRaiz(cf)==false){
            System.out.println("No tiene Raices");
        }
    }
}
