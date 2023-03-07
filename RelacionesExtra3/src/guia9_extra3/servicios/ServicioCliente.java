/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.servicios;

import guia9_extra3.entidades.Cliente;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCliente {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente() {
        
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el nombre: ");
        cliente.setNombre(leer.next());
        
        System.out.println("Ingrese el apellido: ");
        cliente.setApellido(leer.next());
        
        System.out.println("Ingrese el numero de documento: ");
        cliente.setDocumento(leer.next());
        
        System.out.println("Ingrese el numero de telefono: ");
        cliente.setTelefono(leer.next());
        
        System.out.println("Ingrese el mail: ");
        cliente.setMail(leer.next());
        
        System.out.println("Ingrese el domicilio: ");
        cliente.setDomicilio(leer.next());
        

        return cliente;
    }

}
