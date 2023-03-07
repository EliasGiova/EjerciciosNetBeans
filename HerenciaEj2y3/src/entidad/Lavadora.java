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
public class Lavadora extends Electrodomestico{
    protected int carga;

    public Lavadora() {
        
    }

    public Lavadora(int carga,  int precio, String consumo, String color, int peso) {
        super(precio, consumo, color, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
}
