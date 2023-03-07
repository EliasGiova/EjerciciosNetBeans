
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Perro {
    
    private String raza;
    private ArrayList <String> coso;
    
    public Perro() {
            
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
    
    
    
    
}
