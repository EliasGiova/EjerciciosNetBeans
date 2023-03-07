package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {

    Scanner leer;
    ArrayList<String> perros;
    Perro p1;

    public PerroServicio() {

        leer = new Scanner(System.in).useDelimiter("\n");
        perros = new ArrayList<String>();
        p1 = new Perro();
    }

    public Perro crearPerro() {
        String condicion;
        do {
            System.out.println("Ingrese la raza del choco: ");
            p1.setRaza(leer.next());

            System.out.println("Desea añadir otro perro ? ");
            condicion = leer.next();

            perros.add(p1.getRaza());

        } while ("si".equalsIgnoreCase(condicion));

        return p1;
    }

    public ArrayList<String> getPerros() {
        return perros;
    }
    
    
    
    
}
