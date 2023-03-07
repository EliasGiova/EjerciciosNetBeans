package entidad;

public class pass {
    private String pasw;
    private String nombre = "Elias Giovanella";
    private int DNI = 39025109;

    public pass() {
    }
    
    public String getPasw() {
        return pasw;
    }

    public void setPasw(String pasw) {
        this.pasw = pasw;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    } 
}
