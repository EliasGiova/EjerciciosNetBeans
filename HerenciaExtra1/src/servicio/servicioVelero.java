/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Velero;

/**
 *
 * @author elias
 */
public class servicioVelero extends servicioBarco {
    Velero velero;
    public Velero crearVelero(){
        velero = new Velero();
        super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles");
        velero.setMastiles(leer.nextInt());
        velero.setModulo(barco.getModulo()+velero.getMastiles());
        precioFinal();
        return velero;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        long dias = alquilo.getDias();
        long valor = dias*velero.getModulo();
        System.out.println("Su barco es un velero");
        System.out.println("Tiene: " + velero.getMastiles() + " mastiles" );
        System.out.println("Su numero de Matricula es: " + barco.getMatricula());
        System.out.println("Quien lo alquila es: " + alquilo.getNombre()+ " su Dni: " + alquilo.getDni());
        System.out.println("La posicion de Amarre es: " + alquilo.getPosicionAmarre());
        System.out.println("su precio final es de: U$S" + valor );
    }
}
