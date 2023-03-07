package servicio;

import entidad.Persona;
import java.util.Scanner;

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
public class servicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
       Persona crearPerson = new Persona();
        System.out.println("Ingrese su Nombre");
        crearPerson.setNombre(leer.next());
        System.out.println("Ingrese su Apellido");
        crearPerson.setApellido(leer.next());
        System.out.println("Ingrese su Edad");
        crearPerson.setEdad(leer.nextInt());
        System.out.println("Ingrese su Dni");
        crearPerson.setDocumento(leer.next());
        return crearPerson;
    }
    public void mostrarPersona(Persona crearPerson){
        System.out.println(crearPerson.toString());
    }
}
