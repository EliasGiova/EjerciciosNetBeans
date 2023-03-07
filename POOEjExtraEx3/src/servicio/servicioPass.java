package servicio;

import entidad.pass;
import java.util.Scanner;

public class servicioPass {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public pass crearPass(){
        pass cp = new pass();
        System.out.print("Ingrese una contraseña de 10 caracteres: ");
        cp.setPasw(leer.next());
        while(cp.getPasw().length()!=10){
            System.out.println("Tiene que ser de 10 caracteres");
            cp.setPasw(leer.next());
        }
        return cp;
    }
    
    public void analizarPass(pass cp){
        int contz=0;
        int conta=0;
        for (int i = 0; i < cp.getPasw().length(); i++) {
            if (cp.getPasw().substring(i, i+1).equals("z")){
                contz++;
            }else if(cp.getPasw().substring(i, i+1).equals("a")){
                conta++;
            }
        }
        if(contz > 0 && conta > 1){
            System.out.println("La Clave Es Nivel ALTO");
        }else if(contz > 0){
        System.out.println("La Clave Es Nivel MEDIO");
        }else{
            System.out.println("La Clave Es Nivel BAJO");
        }
    }
    public String modificarClave(pass cp){
        System.out.print("Ingrese la Clave nueva: ");
        cp.setPasw(leer.next());
        while(cp.getPasw().length()!=10){
            System.out.println("Tiene que ser de 10 caracteres");
            cp.setPasw(leer.next());
        }
        return cp.getPasw();
    }
    
    public int modificarDNI(pass cp){
        System.out.print("Ingrese DNI: ");
        cp.setDNI(leer.nextInt());
        return cp.getDNI();
    }
    
    public String modificarNombre(pass cp){
        System.out.print("Ingrese Nombre: ");
        cp.setNombre(leer.next());
        return cp.getNombre();
    }
}
