/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cuenta;
import java.util.Scanner;

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
 * 
 */
public class servicioCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta consultaSaldo(){
        Cuenta cs = new Cuenta();
        System.out.println("Ingrese el numero de Cuenta");
        cs.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el numero de Documento");
        cs.setDNI(leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        cs.setSaldoActual(leer.nextInt());
        return cs;
    }
    
    public void ingresarDinero(Cuenta cs){
        System.out.println("Cuanto dinero quiere ingresar?");
        double monto = leer.nextDouble();
        cs.setSaldoActual(cs.getSaldoActual()+ monto);
    }
    
    public void retirarDinero(Cuenta cs){
        System.out.println("Cuanto dinero quiere retirar?");
        double monto = leer.nextDouble();
        if(monto > cs.getSaldoActual()){
            System.out.println("No es posible realizar esta transaccion");
        }else{
            cs.setSaldoActual(cs.getSaldoActual() - monto);
        }
    }
    
    public void extracionRapida(Cuenta cs){
        System.out.println("Cuanto dinero quiere retirar? Recuerde que solamente es un 20%");
        double monto = leer.nextDouble();
        double extrap = 0.2;
        if(monto > cs.getSaldoActual()*extrap){
            System.out.println("No puede realizar esta transaccion");
        }else{
            cs.setSaldoActual(cs.getSaldoActual()-monto);
        }
    }
    
    public void mostrarSaldo(Cuenta cs){
        System.out.println("Su saldo es: " + cs.getSaldoActual());
    }
    
    public void mostrarDatosCuenta(Cuenta cs){
        System.out.println("Su numero de cuenta es: " + cs.getNumeroCuenta());
        System.out.println("Su DNI es: " + cs.getDNI());
        System.out.println("Su saldo es: " + cs.getSaldoActual());
    }  
}
