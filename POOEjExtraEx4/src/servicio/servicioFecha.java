/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.fecha;
import java.util.Scanner;

/**
 * Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes,
 * año). No se podrá utilizar ningún tipo de objeto de “clase fechas”.
 * Inicializando desde la entidad los valores en 1, 1, 1900 respectivamente. Se
 * deberá en métodos independientes: ● Verificar que el año ingresado por el
 * usuario este entre 1900 y 2021, caso contrario, el año tomara el valor por
 * defecto. ● Conocer la cantidad de días totales que tiene el mes elegido por
 * el usuario. EJ: USTED INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días ● Mostrar
 * día anterior a la fecha ingresada (Hay que considerar que sucede con inicio
 * de cada mes) Profe. Adri Bestilleiro ● Mostrar día posterior a la fecha
 * ingresada (Hay que considerar que sucede con fin de cada mes) ● Crear un
 * método para verificar si el año ingresado es bisiesto
 *
 * @author elias
 */
public class servicioFecha {

    Scanner leer = new Scanner(System.in);

    public fecha verificarAnio() {
        fecha va = new fecha();
        System.out.println("Ingrese el anio");
        int anionuevo = leer.nextInt();
        if (anionuevo >= 1900 && anionuevo <= 2021) {
            va.setAnio(anionuevo);
        }
        return va;
    }

    public void verificarMes(fecha va) {
        System.out.println("Elija el mes");
        int mesnuevo = leer.nextInt();
        if (mesnuevo >= 1 && mesnuevo <= 12) {
            va.setMes(mesnuevo);
        }
        if(va.getMes()==2){
            if(esBisiesto(va)){
                System.out.println("El mes tiene 29 dias");
            }else{
                System.out.println("El mes tiene 28 dias");
            }
        }else{
            System.out.println("El mes tiene " + va.getDiashab()[va.getMes()-1]
            + " dias");
        }
    }
    
    public void verificarDia(fecha va){
        
        System.out.println("Ingrese el Dia");
        va.setDia(leer.nextInt());
    }
    
    public void mostrarDiaAnterior(fecha va){
        int anio, dia, mes;
        if(va.getDia()==1){
            mes = va.getMes()-1;
            dia= va.getDiashab()[va.getMes()-2];
        }
    }
    
    public boolean esBisiesto(fecha va) {
        boolean es;
        if(va.getAnio() % 4 == 0) {
            es = true;
        } else {
            es = false;
        }
        if(va.getAnio()%100==0 && va.getAnio()%400!=0){
            es = false;
        }
        return es;
    }
}
