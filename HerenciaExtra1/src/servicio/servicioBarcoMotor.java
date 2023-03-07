/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.BarcoMotor;

/**
 *
 * @author elias
 */
public class servicioBarcoMotor extends servicioBarco {

    BarcoMotor barcomotor;

    public BarcoMotor crearBarcoMotor() {
        barcomotor = new BarcoMotor();
        super.crearBarco();
        System.out.println("Ingrese la potencia del barco");
        barcomotor.setCvbarcomotor(leer.nextInt());
        barcomotor.setModulo(barco.getModulo() + barcomotor.getCvbarcomotor());
        precioFinal();
        return barcomotor;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        long dias = alquilo.getDias();
        long valor = dias * barcomotor.getModulo();
        System.out.println("Su barco es a motor");
        System.out.println("Su barco tiene: " + barcomotor.getCvbarcomotor() + "CV");
        System.out.println("Su numero de Matricula es: " + barco.getMatricula());
        System.out.println("Quien lo alquila es: " + alquilo.getNombre() + " su Dni: " + alquilo.getDni());
        System.out.println("La posicion de Amarre es: " + alquilo.getPosicionAmarre());
        System.out.println("su precio final es de: U$S" + valor);
    }
}
