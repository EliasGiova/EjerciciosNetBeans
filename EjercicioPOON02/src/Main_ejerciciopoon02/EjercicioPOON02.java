
package Main_ejerciciopoon02;

import Circunferencia.Circunferencia;
import Circunferencia.Service.CircunferenciaService;

public class EjercicioPOON02 {

    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        
        Circunferencia c1 = cs.crearCircunferencia();
        
        System.out.println("El perimetro de la circunferencia es: " +(float) cs.perimetro());
        System.out.println("El area de la circunferencia es: " +(float) cs.area());
        
        }
        
    }
    
