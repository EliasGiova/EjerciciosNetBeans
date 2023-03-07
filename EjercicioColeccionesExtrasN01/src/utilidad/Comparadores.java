package utilidad;

import entidad.Alumno;
import java.util.Comparator;

public class Comparadores {
     public static Comparator<Alumno> ordenarPorNombreDescendente = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };
     public static Comparator<Alumno> ordenarPorNombreAscendente = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
     public static Comparator<Alumno> ordenarPorApellidoAscendente = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.getApellido().compareTo(o2.getApellido());
        }
    };
}
