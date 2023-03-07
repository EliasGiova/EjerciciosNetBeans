/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.servicios;

import guia9_extra3.entidades.Poliza;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPoliza {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServicioCliente sCl = new ServicioCliente();
    private final ServicioVehiculo sV = new ServicioVehiculo();
    private final ServicioCuota sCu = new ServicioCuota();
    
    
    public Poliza crearPoliza(){
        Poliza poliza = new Poliza();
        
        poliza.setCliente(sCl.crearCliente());
        poliza.setVehiculo(sV.crearVehiculo());
        
        poliza.getCliente().setVehiculos(poliza.getVehiculo());
        poliza.getVehiculo().setDueño(poliza.getCliente());
        
        System.out.println("Ingrese el numero de poliza:");
        poliza.setNroPoliza(leer.nextInt());
        int dI, dF, mI, mF, aI, aF;
        System.out.println("ingrese la fecha de inicio de la poliza:");
        System.out.print("Dia: ");
        dI = leer.nextInt();
        System.out.print("Mes :");
        mI = leer.nextInt();
        System.out.print("Año :");
        aI = leer.nextInt();
        Date fechaInicio = new Date(aI,mI,dI);
        poliza.setFechaInicio(fechaInicio);
        System.out.println("ingrese la fecha de fin de la poliza:");
        System.out.print("Dia: ");
        dF = leer.nextInt();
        System.out.print("Mes :");
        mF = leer.nextInt();
        System.out.print("Año :");
        aF = leer.nextInt();
        Date fechaFin = new Date(aF, mF, dF);
        poliza.setFechaFin(fechaFin);
        poliza.setCantCuotas(12 * (aF - aI) + mF - mI + 1);
        
        System.out.println("Ingrese la informacion de cada cuota:");
        for (int i = 0 ; i < poliza.getCantCuotas(); i++){
            poliza.getEstadoCuotas().add(sCu.crearCuota(i));
            System.out.println("");
        }
        int s = 0;
        for (int i = 0 ; i < poliza.getCantCuotas(); i++){
                if(poliza.getEstadoCuotas().get(i).isPagada()){
                    s += poliza.getEstadoCuotas().get(i).getMonto();
                } else{
                    
                }
        }
        poliza.setMontoTotalAsegurado(s);
        String resp;
        do {
            System.out.println("Esta asegurado contra granizo? (s/n)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));

        if (resp.equalsIgnoreCase("S")) {
            poliza.setGranizo(true);
            System.out.println("Cuanto es el maximo monto por granizo?");
            poliza.setMaxGranizo(leer.nextInt());
        } else {
            poliza.setGranizo(false);
            poliza.setMaxGranizo(0);
        }

        System.out.println("Ingrese el tipo de poliza: ");
        poliza.setTipoCobertura(leer.next());
        
        return poliza;
    }
    
}
