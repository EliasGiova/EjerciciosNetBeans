package entidad;

import java.time.LocalDate;

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
public class Usuario {

    private String nombre;
    private String apellido;
    private LocalDate vencimientoCarnet;
    private int codigoUsuario;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, LocalDate vencimientoCarnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vencimientoCarnet = vencimientoCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getVencimientoCarnet() {
        return vencimientoCarnet;
    }

    public void setVencimientoCarnet(LocalDate vencimientoCarnet) {
        this.vencimientoCarnet = vencimientoCarnet;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + "\nvencimientoCarnet=" + vencimientoCarnet + ", titularVehiculo=" + codigoUsuario + '}';
    }
}
