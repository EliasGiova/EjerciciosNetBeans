/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class servicioOperacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Operacion tabla(){
        Operacion tb = new Operacion();
        
        System.out.println("Ingresa el valor del numero 1");
        tb.setNum(leer.nextInt());
        System.out.println("Ingresa el valor del numero 2");
        tb.setNum2(leer.nextInt());
        return tb;
    }
    public int sumar(Operacion tb){
        int suma = tb.getNum()+tb.getNum2();
        return suma;
    }
    public int restar(Operacion tb){
        int resta = tb.getNum()-tb.getNum2();
        return resta;
    }
    
    public int multiplicacion(Operacion tb){
        int multiplo = 0;
        if (tb.getNum() == 0 || tb.getNum2() == 0){
            System.out.println("Usted va a multiplicar por 0, esta seguro s/n ");
            String resp = leer.next();
            if(resp.equalsIgnoreCase("s")){
                multiplo = 0;
            }else{
                System.out.println("Vuelva a cargar otros numeros");
            }
        }else{
            multiplo = tb.getNum() * tb.getNum2();
        }
        return multiplo;
    }
    
    public int division(Operacion tb){
        int div = 0;
        if (tb.getNum() == 0 || tb.getNum2() == 0){
            System.out.println("Usted va a dividir por 0, esta seguro s/n ");
            String resp = leer.next();
            if(resp.equalsIgnoreCase("s")){
                div = 0;
            }else{
                System.out.println("Vuelva a cargar otros numeros");
            }
        }else{
            div = tb.getNum()/tb.getNum2();
        }
        return div;
    }
    
    public void resultado(Operacion tb){
        int opcion;
        do{
        System.out.println("Que Desea Hacer?");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Salir");
        opcion = leer.nextInt();
            switch (opcion){
                case 1: System.out.println("La Suma es: " + sumar(tb) );
                break;
                case 2: System.out.println("La Resta es: " + restar(tb) );
                break;
                case 3: System.out.println("La Multiplicación es: " + multiplicacion(tb));
                break;
                case 4: System.out.println("La División es: " + division(tb));
                break;
                case 5: break;
                }
        } while(opcion != 5);
        System.out.println("Ha Salido Del Menu");
    }
}
