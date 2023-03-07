package Circunferencia.Service;

import Circunferencia.Circunferencia;
import java.util.Scanner;
import java.lang.Math;


public class CircunferenciaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Circunferencia cr = new Circunferencia();

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        cr.setRadio(leer.nextDouble());
        return new Circunferencia();
    }

    public double area() {
        double area = (Math.PI) * (cr.getRadio() * cr.getRadio());
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * (Math.PI) * cr.getRadio();
        return perimetro;
    }
}
