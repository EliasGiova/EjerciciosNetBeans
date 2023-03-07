
package pooejextraex5;

import entidad.triangulo;
import servicio.servicioTriangulo;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: ● Calcular área ● Calcular perímetro ● Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 *
 * @author elias
 */
public class POOEjExtraEx5 {

    public static void main(String[] args) {
        servicioTriangulo st = new servicioTriangulo();
        triangulo cp = st.crearTriangulos();
        st.mostrarArreglo(cp);
    }

}
