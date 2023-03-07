package guia8ejercicio1;

import Servicios.PerroServicio;

public class Guia8Ejercicio1 {

    public static void main(String[] args) {

        PerroServicio ps = new PerroServicio();

        ps.crearPerro();

        
        System.out.println(ps.getPerros().toString());
    }

}
