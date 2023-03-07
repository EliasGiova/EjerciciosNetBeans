package servicio;

import entidad.triangulo;
import java.util.Scanner;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: ● Calcular área ● Calcular perímetro ● Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 *
 * @author elias
 */
public class servicioTriangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public triangulo crearTriangulos() {
        triangulo ct = new triangulo();
        for (int i = 0; i < ct.getArreglo().length; i++) {
            System.out.println("Triangulo N° " + (i + 1));
            System.out.println("Valor de los Lados");
            ct.setLados(leer.nextInt());
            System.out.println("Valor de la Base");
            ct.setBase(leer.nextInt());
            ct.setArea(calcularArea(ct));
            ct.setPerimetro(calcularPerimetro(ct));
            ct.getArreglo()[i] = new triangulo(ct.getLados(), ct.getBase(), ct.getArea(), ct.getPerimetro());
            //ct.setArreglo(ct.getArreglo());
        }
        return ct;
    }

    // producto de la base por la altura dividido entre dos.
    public int calcularArea(triangulo ct) {
        double altura = Math.sqrt(Math.pow(ct.getLados(), 2) - (Math.pow(ct.getBase(), 2)) / 4);
        return (int) (ct.getBase() * altura) / 2;
    }

    public int calcularPerimetro(triangulo ct) {
        return (ct.getLados() + ct.getLados() + ct.getBase());
    }

    public void mostrarArreglo(triangulo ct) {
        int contArea = 0;
        int cont=0;
        for (int i = 0; i < ct.getArreglo().length; i++) {
            System.out.println("Triangulo " + i + ct.getArreglo()[i].toString());
            if (contArea < ct.getArreglo()[i].getArea() ) {
            contArea = ct.getArreglo()[i].getArea();
            cont=i;
            }
        }
        
        System.out.println("El Triangulo Mas Grande es: " +ct.getArreglo()[cont].toString());
    }
}
