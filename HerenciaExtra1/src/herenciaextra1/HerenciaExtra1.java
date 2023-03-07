/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra1;

import servicio.servicioBarcoMotor;
import servicio.servicioVelero;
import servicio.servicioYate;

/**
 *
 * @author elias
 */
public class HerenciaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioYate servyate = new servicioYate();
        servicioBarcoMotor servmotor = new servicioBarcoMotor();
        servicioVelero servvel = new servicioVelero();
        servyate.crearYate();
        System.out.println("----------");
        servvel.crearVelero();
        System.out.println("----------");
        servmotor.crearBarcoMotor();
    }
}
