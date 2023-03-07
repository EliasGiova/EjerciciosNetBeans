/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.time.LocalTime;

/**
 *
 * @author eliasDefinir la clase Tiempo, la cual tendrá la hora, minutos y
 * segundos. Definir dos constructores: un constructor vacío y otro con la hora,
 * minutos y segundos ingresado por el usuario. Deberá definir además, los
 * métodos getters y setters correspondientes, y el método
 * imprimirHoraCompleta(). Recordar crear una validación sobre las horas,
 * minutos y segundos ingresados por el usuario. Te animas a simular el paso del
 * tiempo en consola??????
 */
public class tiempo {
    int hora, minutos, segundos;
   
    public tiempo() {
    }

    public tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    } 
}
