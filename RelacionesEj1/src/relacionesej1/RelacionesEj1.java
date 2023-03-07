package relacionesej1;

import entidad.Perro;
import entidad.Persona;
import servicio.servicioPerro;
import servicio.servicioPersona;

public class RelacionesEj1 {

    public static void main(String[] args) {
        servicioPersona servPerson = new servicioPersona();
        servicioPerro servPerro = new servicioPerro();
        System.out.println("Persona 1");
        Persona p1 = servPerson.crearPersona();
        System.out.println("------------------");
        System.out.println("Persona 2");
        Persona p2 = servPerson.crearPersona();
        System.out.println("------------------");
        System.out.println("Perro 1");
        Perro d1 = servPerro.crearPerro();
        System.out.println("------------------");
        System.out.println("Perro 2");
        Perro d2 = servPerro.crearPerro();
        System.out.println("------------------");
        p1.setPerro(d1);
        servPerson.mostrarPersona(p1);
        System.out.println("------------------");
        p2.setPerro(d2);
        servPerson.mostrarPersona(p2);
    }

}
