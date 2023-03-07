package servicio;

import entidad.Auto;
import entidad.Usuario;
import java.util.Scanner;

public class Menu {

    private Scanner leer;

    public Menu() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menuAuto(Auto auto, Usuario usuario) {
        ServicioAuto servAuto = new ServicioAuto();
        int opcion;
do{
        System.out.println("-----------------MENU-----------------");
        System.out.println("1- Crear Usuario\n2-Crear Auto\n"
                + "3-Asignar codigo\n4-Cargar kilometros recorridos\n"
                + "5-Modifcar titularidad\n6-Kilometraje al entrar al Service\n"
                + "7-Proximo Service\n8-Salir");
     opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                servAuto.crearUsuario(usuario);
                break;
            case 2:
                servAuto.crearAuto(auto);
                break;
            case 3:
                servAuto.asignarCodigo(auto, usuario);
                break;
            case 4:
                servAuto.recorrerKilometros(auto);
                break;
            case 5:
                servAuto.modificarTitular(auto, usuario);
                break;
            case 6:
                servAuto.proxService(auto);
                break;
            case 7:
                servAuto.kmProxServ(auto);
                break;
            case 8:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }while (opcion!=8);
}
}
