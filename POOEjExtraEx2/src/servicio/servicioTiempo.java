/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.tiempo;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir
 * dos constructores: un constructor vacío y otro con la hora, minutos y
 * segundos ingresado por el usuario. Deberá definir además, los métodos getters
 * y setters correspondientes, y el método imprimirHoraCompleta(). Recordar
 * crear una validación sobre las horas, minutos y segundos ingresados por el
 * usuario. Te animas a simular el paso del tiempo en consola??????
 */
public class servicioTiempo {

    Scanner leer = new Scanner(System.in);
    LocalTime resultado;

    public tiempo crearTiempo() {

        tiempo tp = new tiempo();
        System.out.println("Ingrese el tiempo en HH:mm:ss");
        System.out.print("Ingrese la hora en hs: ");
        tp.setHora(leer.nextInt());
        if (tp.getHora() == 24) {
            tp.setHora(0);
        }
        while (tp.getHora() > 24) {
            System.out.print("Recuerde no pasar las 24hs: ");
            tp.setHora(leer.nextInt());
        }
        System.out.print("Ingrese los minutos: ");
        tp.setMinutos(leer.nextInt());
        while (tp.getMinutos() >= 60) {
            System.out.print("Recuerde no pasarse de 60 minutos: ");
            tp.setMinutos(leer.nextInt());
        }
        System.out.print("Ingrese los segundos: ");
        tp.setSegundos(leer.nextInt());
        while (tp.getMinutos() >= 60) {
            System.out.print("Recuerde no pasarse de 60 segundos: ");
            tp.setSegundos(leer.nextInt());
        }
        return tp;
    }

    public void imprimirHora(tiempo tp) {
        int cont = 0;
        ok: //es una etiqueta que sirve para terminar todos los bucles.
        do {
            for (int hh = 0; hh < 24; hh++) {  
                for (int mm = 0; mm < 60; mm++) {
                    for (int ss = 0; ss < 60; ss++) {
                        if (tp.getHora() <= hh && tp.getMinutos() <= mm && tp.getSegundos() < ss) {
                            cont++;
                            break ok;
                        } else {
                            System.out.println(String.format("Reloj: " + "%02d:%02d:%02d", hh, mm, ss));
                            segundo();
                        }
                    }
                }
            }
        } while (cont < 1);
    }

    /**
     * retrase el tiempo en un segundo en el bucle o en cualquier ejecucion de
     * codigo.
     */
    private void segundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
