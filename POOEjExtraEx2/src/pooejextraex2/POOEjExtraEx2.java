/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextraex2;

import entidad.tiempo;
import servicio.servicioTiempo;

/**
 *
 * @author elias
 */
public class POOEjExtraEx2 {

    /**
     * Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos.
     * Definir dos constructores: un constructor vacío y otro con la hora,
     * minutos y segundos ingresado por el usuario. Deberá definir además, los
     * métodos getters y setters correspondientes, y el método
     * imprimirHoraCompleta(). Recordar crear una validación sobre las horas,
     * minutos y segundos ingresados por el usuario. Te animas a simular el paso
     * del tiempo en consola??????
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        servicioTiempo sp = new servicioTiempo();
        tiempo tp = sp.crearTiempo();
        sp.imprimirHora(tp);
        
    }

}
