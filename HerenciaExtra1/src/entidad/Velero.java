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
public class Velero extends Barco{
    protected int mastiles;

    public Velero() {
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, String matricula, int eslora, int anioFabricacion, int modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.mastiles = mastiles;
    }
    
    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
}
