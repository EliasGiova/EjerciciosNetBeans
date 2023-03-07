/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;


/**
 *
 * @author elias
 */
public class Electrodomestico {

    protected int precio;
    protected String consumo;
    protected String color;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String consumo, String color, int peso) {
        this.precio = precio;
        this.consumo = consumo;
        this.color = color;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio Final= $" + precio + "\nConsumo= " + consumo + "\nColor= " + color + "\nPeso= " + peso +" kg";
    }
    
}
