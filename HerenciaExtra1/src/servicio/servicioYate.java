/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Yate;

/**
 *
 * @author elias
 */
public class servicioYate extends servicioBarco {
    Yate yate;
    public Yate crearYate(){
        yate = new Yate();
        super.crearBarco();
        System.out.println("Ingrese la potencia del motor");
        yate.setCvmotoryate(leer.nextInt());
        System.out.println("Ingrese el numero de camarotes");
        yate.setCamaroteslujo(leer.nextInt());
        yate.setModulo(barco.getModulo()+yate.getCamaroteslujo()+yate.getCvmotoryate());
        precioFinal();
        return yate;
    }
      @Override
    public void precioFinal(){
        super.precioFinal();
        long dias =  alquilo.getDias();
        long valor = dias*yate.getModulo();
        System.out.println("Su barco es un Yate");
        System.out.println("Tiene: " + yate.getCamaroteslujo() + " camarotes" );
        System.out.println("Con su potencia de: " + yate.getCvmotoryate() + "CV");
        System.out.println("Su numero de Matricula es: " + barco.getMatricula());
        System.out.println("Quien lo alquila es: " + alquilo.getNombre()+ " su Dni: " + alquilo.getDni());
        System.out.println("La posicion de Amarre es: " + alquilo.getPosicionAmarre());
        System.out.println("su precio final es de: U$S" + valor );
    }
}
