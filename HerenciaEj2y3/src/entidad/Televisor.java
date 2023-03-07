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
public final class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean sintonizado;

    public Televisor() {
        super();
    }

    public Televisor(int pulgadas, boolean sintonizado, int precio, String consumo, String color, int peso) {
        super(precio, consumo, color, peso);
        this.pulgadas = pulgadas;
        this.sintonizado = sintonizado;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizado() {
        return sintonizado;
    }

    public void setSintonizado(boolean sintonizado) {
        this.sintonizado = sintonizado;
    }
}
