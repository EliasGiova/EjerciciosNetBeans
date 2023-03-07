/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Lavadora;
import java.util.ArrayList;

/**
 *
 * @author elias
 */
public class servicioLavadora extends servicioElectrodomestico {

    Lavadora crearLav = new Lavadora();

    public Lavadora crearLavadora() {
        System.out.println("Lavadora");
        super.crearElectrodomestico();
        System.out.println("Que Capacidad de Carga Quieres De la Lavadora");
        crearLav.setCarga(leer.nextInt());
        precioFinal();
        return crearLav;
    }
    public ArrayList<Electrodomestico> listaLav (){
        ArrayList<Electrodomestico> listalaf = new ArrayList();
        String resp;
        do{
            crearLavadora();
            System.out.println("Desea Ingresar otra Lavadora");
            resp = leer.next();
            listalaf.add(Elec);
        }while(!"no".equalsIgnoreCase(resp));
        return listalaf;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if(crearLav.getCarga()>30){
            Elec.setPrecio(Elec.getPrecio()+500);
        }
    }
    
    
    @Override
    public void mostrar(){
        System.out.println("Informacion de la Lavadora");
        super.mostrar();
        System.out.println("Carga= " +crearLav.getCarga()+ " kg");
        
    }
}
