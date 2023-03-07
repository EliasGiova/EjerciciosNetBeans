package servicio;

import entidad.Auto;
import entidad.Usuario;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Ejercicio 7 Crea una clase Auto. Como atributos tendrá nombre del dueño,
 * fecha vencimiento carnet, color del vehículo, modelo y KM en motor (deberá
 * ser inicializado por defecto en 7500km), Crear métodos que permitan: ● Que un
 * usuario cargue su ficha del auto. ● Que el usuario, modifique la titularidad
 * del vehículo. ● Indicar un trayecto recorrido, modificando de este modo los
 * KM del motor ● Crear un método que indique si es necesario realizar Service
 * al vehículo, considerando que al llegar a los 10.000km corresponde
 * realizarlo.
 */
public class ServicioAuto {

    private Scanner leer;

    public ServicioAuto() {
        leer = new Scanner(System.in).useDelimiter("\n");
        Auto auto = new Auto();
    }

    public Auto crearAuto(Auto auto) {
//        Auto auto = new Auto();
        System.out.println("Ingrese el modelo de su vehiculo");
        auto.setModelo(leer.next());
        System.out.println("Ingrese el color de su vehiculo");
        auto.setColor(leer.next());
        System.out.println("Ingrese el kilometraje de su vehiculo");
        auto.setKm(leer.nextInt());

        return auto;
    }

    public Usuario crearUsuario(Usuario usuario) {

        System.out.println("Ingrese el nombre de usuario:");
        usuario.setNombre(leer.next());
        System.out.println("Ingrese el apellido de usuario:");
        usuario.setApellido(leer.next());
        System.out.println("Ingrese el día (XX) de vencimiento del carnet del usuario:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes (XX) de vencimiento del carnet del usuario:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año (XXXX) de vencimiento del carnet del usuario:");
        int anio = leer.nextInt();
        usuario.setVencimientoCarnet(LocalDate.of(anio, mes, dia));
        usuario.setCodigoUsuario((int) (Math.random() * 10000));
        System.out.println("Numero de Usuario: " + usuario.getCodigoUsuario());
        return usuario;
    }

    public int asignarCodigo(Auto auto, Usuario usuario) {
        System.out.println("Ingrese su codigo de usuario para asignar titularidad de auto");
        int cargaCodigo = leer.nextInt();
        if (usuario.getCodigoUsuario() == cargaCodigo) {
            usuario.setCodigoUsuario(auto.getCodigoVehiculo());
        }
        System.out.println("Usted le ha asignado su codigo de usuario " + cargaCodigo + " al vehiculo: ");
        System.out.println(auto);
        return usuario.getCodigoUsuario();
    }

    public void recorrerKilometros(Auto auto) {
        System.out.println("Ingrese la cantidad de km recorridos: ");
        int kmRecorridos = leer.nextInt();
        int kmAnterior = auto.getKm();
        auto.setKm(kmRecorridos + kmAnterior);
        System.out.println("La cantidad total de kilometros es " + auto.getKm()
                + "\nla cantidad de kilometros recorridos en este periodo es " + kmRecorridos);
    }

    public void modificarTitular(Auto auto, Usuario usuario) {
        System.out.println("Para cambiar la titularidad del vehiculo\nIngrese el codigo de usuario");
        int cargaCodigo = leer.nextInt();
        Usuario usuario2 = new Usuario();
        crearUsuario(usuario2);
        asignarCodigo(auto, usuario2);
        if (usuario.getCodigoUsuario() == cargaCodigo) {
            auto.setCodigoVehiculo(cargaCodigo);
            System.out.println("Ingrese el numero del nuevo usuario");
            cargaCodigo = leer.nextInt();
            System.out.println("Usted le ha asignado su codigo de usuario " + cargaCodigo + " al vehiculo: ");
            System.out.println(auto);
        }
    }

    public void proxService(Auto auto) {
        System.out.println("Ingrese el kilometraje al entrar al service: ");
        int kilometrajeActual = leer.nextInt();
        auto.setProxService(kilometrajeActual+10000);
        System.out.println("El service debe realizarse a los " + auto.getProxService() + " km");
    }

    public void kmProxServ(Auto auto) {
        System.out.println("Los kilometros faltantes para su proximo service son "
                + (auto.getProxService() - auto.getKm()) + " km");
    }
}
