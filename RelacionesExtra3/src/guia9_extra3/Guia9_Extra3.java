/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3;

import guia9_extra3.entidades.Poliza;
import guia9_extra3.servicios.ServicioPoliza;

/**
 *
 * @author Usuario
 */
public class Guia9_Extra3 {
    
    

    public static void main(String[] args) {
        ServicioPoliza sP = new ServicioPoliza();
        
        Poliza nuevaPoliza = sP.crearPoliza();
        
        System.out.println(nuevaPoliza.toString());
        
    }
    
}
