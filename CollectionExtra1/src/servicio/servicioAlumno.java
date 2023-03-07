package servicio;

import entidad.Alumno;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import sun.util.calendar.BaseCalendar;

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
 *
 * @author elias
 */
public class servicioAlumno {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alumno cargaAlumno(){
        Alumno ingAlu = new Alumno();
        System.out.println("Ingrese Apellido Del Alumno");
        ingAlu.setApellido(leer.next());
        System.out.println("Ingrese Nombre Del Alumno");
        ingAlu.setNombre(leer.next());
        System.out.println("Ingrese Nacionalidad del Alumno");
        ingAlu.setNacionalidad(leer.next());
        System.out.println("Ingrese La Fecha de nacimiento");
        Period edad = Period.between(LocalDate.MIN, LocalDate.MIN);
        return ingAlu;
    }
}
