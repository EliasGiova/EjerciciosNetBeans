/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.servicios;

import guia9_extra3.entidades.Cuota;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCuota {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuota crearCuota(int i) {

        Cuota cuota = new Cuota();

        cuota.setNroCuota(i);

        System.out.println("Ingrese el monto de la cuota " + (i+1));
        cuota.setMonto(leer.nextInt());
        String resp;
        do {
            System.out.println("Esta paga la cuota? (s/n)");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n"));
        if (resp.equalsIgnoreCase("S")) {
            cuota.setPagada(true);
        } else {
            cuota.setPagada(false);
        }
        int d,m,a;
        System.out.println("Ingrese la fecha de vencimiento:");
        System.out.println("Dia:");
        d = leer.nextInt();
        System.out.println("Mes:");
        m = leer.nextInt();
        System.out.println("Año:");
        a = leer.nextInt();
        Date fechaVencimiento = new Date(a, m, d);
        cuota.setFechaVencimiento(fechaVencimiento);
        if (cuota.isPagada()) {
            System.out.println("Ingrese el medio de pago:");
            cuota.setModoDePago(leer.next());
        } else {
            cuota.setModoDePago("-");
        }
        
        return cuota;
    }
}
