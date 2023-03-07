package pooejextraex3;

import entidad.pass;
import java.util.Scanner;
import servicio.servicioPass;

/**
 * Crear una clase Pass, donde declaremos los siguientes atributos: ● pass : Del
 * tipo String ● nombre: Del tipo String ● dni: Del tipo int. Métodos para
 * desarrollar: ● Ingresar datos de usuarios (usando el constructor. HACER
 * INGRESO DE DATOS FIJOS (no por teclado) ● Crear un método para ingresar una
 * contraseña (crearPass). En este método, debemos validar que la longitud sea
 * correcta. (10). En caso de ser correcto, almaceno la contraseña. Si ingreso a
 * esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
 * ● Crear un método para analizar la contraseña(analizarPass). Donde: o SI
 * Existe al menos una letra z : Es nivel MEDIO o Si Existe al menos una letra z
 * y al menos 2 letras a: Es nivel ALTO o Si ninguna condición se cumple es
 * nivel BAJO ● Crear los métodos correspondientes para modificar el nombre o
 * DNI. Atención! Primero debe ingresar el pass para poder realizar dicha
 * gestión. Caso contrario se impedirá el acceso a modificar los datos. ● A
 * través de un menú de opciones: o A) ingresar la contraseña, recordar que
 * antes de guardarla debe ser ingresada una contraseña valida). o B) Mensaje al
 * usuario que tipo de NIVEL es su contraseña o C) Modificar contraseña, donde
 * primero debe poner su contraseña anterior para dar permiso o C) Modificar
 * nombre, donde primero debe poner su contraseña para dar permiso, SINO impedir
 * cambios o D) Modificar DNI, donde primero debe poner su contraseña para dar
 * permiso, SINO impedir cambios
 *
 * @author elias
 */
public class POOEjExtraEx3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioPass sp = new servicioPass();
        pass cp = sp.crearPass();
        sp.analizarPass(cp);
        int num;
        String resp;
        do {
            System.out.println("Menu");
            System.out.println("1-Modificar Contraseña");
            System.out.println("2-Modificar Nombre");
            System.out.println("3-Modificar DNI");
            System.out.println("4-Salir");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.print("Ingrese su clave: ");
                    resp = leer.next();
                    if (cp.getPasw().equals(resp)) {
                        sp.modificarClave(cp);
                        break;
                    } else {
                        System.out.println("Clave incorrecta");
                        break;
                    }
                case 2:
                    System.out.print("Ingrese su clave: ");
                    resp = leer.next();
                    if (cp.getPasw().equals(resp)) {
                        sp.modificarNombre(cp);
                        break;
                    } else {
                        System.out.println("Clave incorrecta");
                        break;
                    }
                case 3:
                    System.out.println("Ingrese su clave: ");
                    resp = leer.next();
                    if (cp.getPasw().equals(resp)) {
                        sp.modificarDNI(cp);
                        break;
                    } else {
                        System.out.println("Clave incorrecta");
                        break;
                    }
                case 4:
                    break;
            }
        } while (num != 4);
        System.out.println("La clave es: " + cp.getPasw());
        System.out.println("Dni: " + cp.getDNI());
        System.out.println("Nombre: " + cp.getNombre());
    }
}
