/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.servicios;

import guia9_extra3.entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioVehiculo {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo();

        System.out.println("Ingrese la marca:");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese el modelo:");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese el año del modelo:");
        vehiculo.setAño(leer.nextInt());
        System.out.println("Ingrese el numero de motor:");
        vehiculo.setNumeroMotor(leer.nextInt());
        System.out.println("Ingrese el chasis:");
        vehiculo.setChasis(leer.next());
        System.out.println("Ingrese el color:");
        vehiculo.setColor(leer.next());
        System.out.println("Ingrese el tipo de vehiculo:");
        vehiculo.setTipo(leer.next());

        return vehiculo;
    }

}
