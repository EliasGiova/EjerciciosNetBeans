package entidad;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la
 * nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA –
 * CHILENA – VENEZOLANA solamente. Necesidades:  Crear los métodos de A – B -M
 * (Alta – Baja – modificación ) que manipulen los objetos de este tipo.  Crear
 * una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
 * para no hacer carga manual de los datos)  Ordenar y mostrar la lista de
 * alumnos ordenados por orden alfabético según su apellido de forma ascendente.
 *  Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según
 * su nombre de forma descendente.  Con un alumno especifico (suponiendo que no
 * existen dos alumnos con el mismo nombre y apellido), mostrar por pantalla su
 * edad. Considerar, el manejo de fechas, utilizando el atributo fecha de
 * nacimiento.  Crear listas paralelas de Alumnos, según la nacionalidad. 
 * Realizar un reporte final de datos que informe: o Cuantos alumnos son mayores
 * de 25 años. o Cuantos alumnos tiene su apellido que comienzan con letra L o P
 * o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
 * Recordar:  Hacer uso de paquetes y clases correspondientes para buena
 * estructura de nuestro proyecto.  Todos los métodos deben ser pensados para
 * reutilizar y adaptarse a futuros cambios (por ejemplo, mañana quiero carga de
 * 30 alumnos, y las instrucciones deben prevenir esta modificación)
 *
 * @author Raul Gomez
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer edad;
    private LocalDate fechaNac;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Integer edad, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.fechaNac = fechaNac;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido);
        hash = 59 * hash + Objects.hashCode(this.nacionalidad);
        hash = 59 * hash + Objects.hashCode(this.edad);
        hash = 59 * hash + Objects.hashCode(this.fechaNac);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno:\t" + apellido.toUpperCase() + "," + nombre.toUpperCase() 
                + "\t\tNac:\t" + nacionalidad + "\tEdad:\t" + edad+"\n";
    }

}
