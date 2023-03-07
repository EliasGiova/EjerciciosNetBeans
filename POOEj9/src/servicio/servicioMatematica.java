/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Matematica;
import java.util.Scanner;

/**
 **Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author elias
 */
public class servicioMatematica {
    Scanner leer = new Scanner(System.in);
    public Matematica numeros(){
        Matematica nn = new Matematica();
        nn.setNum1(Math.random()*100);
        nn.setNum2(Math.random()*100);
        return nn;
    }
    
    public void mostrarNum(Matematica nn){
        System.out.println("Numero 1: " + nn.getNum1());
        System.out.println("Numero 2: " + nn.getNum2());
    }
    /**
     * Math.max o Math.min sirve para buscar el maximo o minimo de dos valores
     * @param nn
     * @return 
     */
    public double devolverMayor(Matematica nn){
        return Math.max(nn.getNum1(), nn.getNum2());
    }
    /**
     * Math.pow sirve para el primer numero elevar a la potencia el segundo
     * @param nn
     * @return 
     */
    public int calcularPotencia(Matematica nn){
       return (int) (Math.pow(Math.max(nn.getNum1(), nn.getNum2()), Math.min(nn.getNum1(), nn.getNum2())));
    }
    /**
     * Math.sqrt sirve para sacar la raiz cuadrada
     * Math.abs sirve para sacar el valor absoluto
     * @param nn
     * @return 
     */
    public int Raiz(Matematica nn){
        return (int) (Math.sqrt(Math.abs(Math.min(nn.getNum1(), nn.getNum2()))));
    }
}
