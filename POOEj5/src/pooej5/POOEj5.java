/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import entidad.Cuenta;
import java.util.Scanner;
import servicio.servicioCuenta;

/**
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * @author elias
 */
public class POOEj5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioCuenta sc = new servicioCuenta();
        Cuenta cs = sc.consultaSaldo();
        int resp;
        do{
            System.out.println("Menu");
            System.out.println("1- Ingresar Dinero");
            System.out.println("2- Retirar Dinero");
            System.out.println("3- Extracción Rapida");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Consultar Datos De La Cuenta");
            System.out.println("6- Salir");
            resp = leer.nextInt();
            switch (resp){
                case 1: sc.ingresarDinero(cs);
                break;
                case 2: sc.retirarDinero(cs);
                break;
                case 3: sc.extracionRapida(cs);
                break;
                case 4: sc.mostrarSaldo(cs);
                break;
                case 5: sc.mostrarDatosCuenta(cs);
                break;
                case 6: break;
            }
        }while(resp != 6);
        System.out.println("Ha salido del menu");
    }
    
}
