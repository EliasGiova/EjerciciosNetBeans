package servicio;

import entidad.Perro;
import java.util.Scanner;

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
public class servicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro crearDog = new Perro();
        System.out.println("Ingrese el nombre del Perro");
        crearDog.setNombre(leer.next());
        System.out.println("Ingrese la raza");
        crearDog.setRaza(leer.next());
        System.out.println("Ingrese la edad");
        crearDog.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño");
        crearDog.setTamanio(leer.next());
        return crearDog;
    }
    public void mostrarPerro(Perro crearDog){
        System.out.println(crearDog.toString());
    }
}
