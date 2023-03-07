/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import entidad.Electrodomestico;
import java.util.ArrayList;
import servicio.servicioLavadora;
import servicio.servicioTelevisor;

/**
 *
 * @author elias
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        servicioLavadora servLav = new servicioLavadora();
        servicioTelevisor servTv = new servicioTelevisor();
        ArrayList<Electrodomestico> listaTele = servTv.listaTele();
        
        int sumatel=0;
        
        for (int i = 0; i < listaTele.size(); i++) {
        System.out.println(listaTele.get(i).getPrecio());    
        sumatel=sumatel+ listaTele.get(i).getPrecio();
        }
        System.out.println("Total de Televisores " + sumatel);
        
        ArrayList<Electrodomestico> listaLav = servLav.listaLav();
        int sumalav = 0;
        
        for (int i = 0; i < listaLav.size(); i++) {
            System.out.println(listaLav.get(i).getPrecio());
            sumalav = sumalav+listaLav.get(i).getPrecio();    
        }
        System.out.println("Total de Lavadoras " + sumalav);
        int total = sumalav+sumatel;
        
        System.out.println("La suma es:" + total );
        //servLav.crearLavadora();
        //servLav.mostrar();
        //System.out.println("----------------------");
        //servTv.crearTele();
        //servTv.mostrar();
    }
    
}
