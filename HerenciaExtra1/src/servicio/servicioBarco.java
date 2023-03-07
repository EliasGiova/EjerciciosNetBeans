/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Barco;


/**
 *En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 * @author elias
 */
public class servicioBarco extends servicioAlquiler {
    Barco barco = new Barco();
    public Barco crearBarco(){
        System.out.println("Ingrese el numero de matricula");
        barco.setMatricula(leer.next());
        System.out.println("Cuatos metros tiene la eslora?");
        barco.setEslora(leer.nextInt());
        System.out.println("Ingrese el anio de fabricacion");
        barco.setAnioFabricacion(leer.nextInt());
        barco.setModulo(barco.getEslora()*10);
        return barco;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
    }
}
