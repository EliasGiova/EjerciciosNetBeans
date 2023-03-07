/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author elias
 */

public class servicioTelevisor extends servicioElectrodomestico{
    Televisor crearTV = new Televisor();
    public Televisor crearTele(){
        System.out.println("Televisor");
       super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        crearTV.setPulgadas(leer.nextInt());
        System.out.println("¿Esta sintonizado?");
        String resp= leer.next();
        if("si".equalsIgnoreCase(resp)){
            crearTV.setSintonizado(true);
        }else{
            crearTV.setSintonizado(false);
        }
        precioFinal();
        return crearTV;
    }
    public ArrayList<Electrodomestico> listaTele (){
        ArrayList<Electrodomestico> listadaf = new ArrayList();
        String resp;
        do{
            crearTele();
            System.out.println("Desea Ingresar otra Tele");
            resp = leer.next();
            listadaf.add(Elec);
        }while(!"no".equalsIgnoreCase(resp));
        return listadaf;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(crearTV.getPulgadas()>40){
            Elec.setPrecio(Elec.getPrecio()+500);
        }
        if(crearTV.isSintonizado()){
            Elec.setPrecio(Elec.getPrecio()+500);
        }
    }
    
    @Override
    public void mostrar(){
        System.out.println("Informacion Del Televisor");
        super.mostrar();
        System.out.println("Pulgadas= " + crearTV.getPulgadas()+"'");
        if(crearTV.isSintonizado()){
            System.out.println("La TV esta Sintonizado");
        }else{
            System.out.println("No está Sintonizado");
        }
    }
}
