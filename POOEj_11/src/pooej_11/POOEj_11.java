/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_11;

import entidad.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *  Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 * @author elias
 */
public class POOEj_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Fecha fc = new Fecha();
        System.out.println("Ingrese el dia");
        fc.setDia(leer.nextInt());
        System.out.println("Ingrese el mes");
        fc.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
        fc.setAnio(leer.nextInt());
        Date fecha = new Date(fc.getAnio()-1900,fc.getMes()-1,fc.getDia());
        fc.setFechaNacimiento(fecha);
        Date hoy = new Date();
        System.out.println("Pasaron " + (hoy.getYear()-fc.getFechaNacimiento().getYear())+
        " años");
            
    }    
}
