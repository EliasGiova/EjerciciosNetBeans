package entidad;

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
public class Auto {

    private String color;
    private String modelo;
    private int km;
    private int codigoVehiculo;
    private int proxService;

    public Auto() {
        this.km = 7500;
    }

    public Auto(String color, String modelo, int km) {
        this.color = color;
        this.modelo = modelo;
        this.km = 7500;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if (km > 7500) {
            this.km = km;
        } else {
            System.out.println("El sistema toma por defecto un valor de 7500 "
                    + "para cualquier valor menor se le asigna dicho valor");
        }
    }

    public int getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(int codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getProxService() {
        return proxService;
    }

    public void setProxService(int proxService) {
        this.proxService = proxService;
    }

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", modelo=" + modelo + ", km=" + km + ", codigo=" + (int) codigoVehiculo + '}';
    }

}
