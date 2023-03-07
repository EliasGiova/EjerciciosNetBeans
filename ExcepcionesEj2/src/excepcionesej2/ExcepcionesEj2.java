package excepcionesej2;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 *
 * @author elias
 */
public class ExcepcionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[3];

        try {
            for (int i = 0; i < 5; i++) {
                vector[i] = (int) (Math.random() * 10);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fuera de la cantidad ponele una arraylist");
        }
    }

}
