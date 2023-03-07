package entidad;

/**
 * Definir una clase triangulo que modelara triángulos isósceles . Definir los
 * atributos necesarios para operar. Crear los métodos correspondientes a la
 * clase Entidad. Crear un arreglo con 4 objetos de la clase Crear los
 * siguientes métodos: ● Calcular área ● Calcular perímetro ● Mostrar los datos
 * del triangulo que tenga el área de mayor superficie
 *
 * @author elias
 */
public class triangulo {
    private int lados, base, area, perimetro;
    private triangulo arreglo[] = new triangulo[4];
    
    public triangulo() {
    }
    
    public triangulo(int lados, int base, int area, int perimetro) {
        this.lados = lados;
        this.base = base;
        this.area = area;
        this.perimetro = perimetro;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public triangulo[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(triangulo[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public String toString() {
        return "triangulo{" + "lados=" + lados + ", base=" + base + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    

    

    
    
    
}
