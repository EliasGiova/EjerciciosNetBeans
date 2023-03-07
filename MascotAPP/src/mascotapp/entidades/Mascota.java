/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author elias
 */
public class Mascota {
    public String nombre;
    public String apodo;
    public String tipo;
    public String raza;
    public String color;
    public int edad;
    public boolean cola;
    
    public Mascota(){
        
    }
    
    public Mascota(String nombre, String tipo, String apodo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public Mascota(String nombre, String apodo, String tipo, String raza, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
    }
    
}
