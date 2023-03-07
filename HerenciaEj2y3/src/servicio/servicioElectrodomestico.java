package servicio;

import entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class servicioElectrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Electrodomestico Elec;

    public void comprobarConsumoEnergetico(String letra) {

        switch (letra) {
            case "A":
                Elec.setConsumo(letra);
                break;
            case "B":
                Elec.setConsumo(letra);
                break;
            case "C":
                Elec.setConsumo(letra);
                break;
            case "D":
                Elec.setConsumo(letra);
                break;
            case "E":
                Elec.setConsumo(letra);
                break;
            default:
                Elec.setConsumo("F");
                break;
        }
    }

    public void comprobarColor(String color) {
        switch (color) {
            case "negro":
                Elec.setColor(color);
                break;
            case "rojo":
                Elec.setColor(color);
                break;
            case "azul":
                Elec.setColor(color);
                break;
            case "gris":
                Elec.setColor(color);
                break;
            default:
                Elec.setColor("blanco");
                break;
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Elec = new Electrodomestico();
        System.out.println("Ingrese el peso del Electrodomestico");
        Elec.setPeso(leer.nextInt());
        System.out.println("Ingrese el color del Electrodomestico");
        Elec.setColor(leer.next().toLowerCase());
        comprobarColor(Elec.getColor());
        System.out.println("Que consumo tiene el Electrodomestico desde la A-F");
        Elec.setConsumo(leer.next().toUpperCase());
        comprobarConsumoEnergetico(Elec.getConsumo());
        Elec.setPrecio(1000);
        return Elec;
    }
    
    public void precioFinal(){
        //Disminuye el precio a Mayor consumo
        switch (Elec.getConsumo()) {
            case "A":
                Elec.setPrecio(Elec.getPrecio()+1000);
                break;
            case "B":
                Elec.setPrecio(Elec.getPrecio()+800);
                break;
            case "C":
                Elec.setPrecio(Elec.getPrecio()+600);
                break;
            case "D":
                Elec.setPrecio(Elec.getPrecio()+500);
                break;
            case "E":
                Elec.setPrecio(Elec.getPrecio()+300);
                break;
            case "F":
                Elec.setPrecio(Elec.getPrecio()+100);
                break;
        }
        //Aumenta el precio a mayor peso
        if(Elec.getPeso()>=1 && Elec.getPeso()<=19){
            Elec.setPrecio(Elec.getPrecio()+100);
        }else if(Elec.getPeso()>=20 && Elec.getPeso()<=49){
            Elec.setPrecio(Elec.getPrecio()+500);
        }else if(Elec.getPeso()>=50 && Elec.getPeso()<=79){
            Elec.setPrecio(Elec.getPrecio()+800);
        }else if(Elec.getPeso()>=80){
            Elec.setPrecio(Elec.getPrecio()+1000);
        }
    }
    
    public void mostrar() {
        System.out.println(Elec.toString());
    }
}
