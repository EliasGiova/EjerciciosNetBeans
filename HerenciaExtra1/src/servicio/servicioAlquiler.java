/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alquiler;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 *
 * @author elias
 */
public class servicioAlquiler {

    protected Alquiler alquilo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler valorAlquiler() {
        alquilo = new Alquiler();
        System.out.println("Ingrese su nombre");
        alquilo.setNombre(leer.next());
        System.out.println("Ingrese su DNI");
        alquilo.setDni(leer.next());
        System.out.println("Ingrese la fecha de alquiler dd/mm/aa");
        System.out.print("Ingrese el dia (dd): ");
        int dd = leer.nextInt();
        System.out.print("Ingrese el mes (mm): ");
        int mm = leer.nextInt();
        System.out.print("Ingrese el anio (aaaa): ");
        int aa = leer.nextInt();
        alquilo.setFechaAlquiler(LocalDate.of(aa, mm, dd));
        System.out.println("---------");
        System.out.println("Ingrese la fecha de devolucion dd/mm/aaaa");
        System.out.print("Ingrese el dia (dd): ");
        int dv = leer.nextInt();
        System.out.print("Ingrese el mes (mm): ");
        int mv = leer.nextInt();
        System.out.print("Ingrese el anio (aaaa): ");
        int av = leer.nextInt();
        alquilo.setFechaDevolucion(LocalDate.of(av, mv, dv));
        alquilo.setDias(DAYS.between(alquilo.getFechaAlquiler(),alquilo.getFechaDevolucion()));
        System.out.println("Dias alquilado: " + alquilo.getDias());
        System.out.println("Ingrese la posición de amarre, desde 1(cerca) hasta el 100(lejos)");
        alquilo.setPosicionAmarre(leer.nextInt());
        return alquilo;
    }
    
    public void precioFinal(){
     valorAlquiler();   
    }
}
