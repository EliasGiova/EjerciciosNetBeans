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
public class Yate extends Barco {

    protected int cvmotoryate;
    protected int camaroteslujo;

    public Yate() {
    }

    public Yate(int cvmotoryate, int camaroteslujo, String matricula, int eslora, int anioFabricacion, int modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.cvmotoryate = cvmotoryate;
        this.camaroteslujo = camaroteslujo;
    }

    public int getCvmotoryate() {
        return cvmotoryate;
    }

    public void setCvmotoryate(int cvmotoryate) {
        this.cvmotoryate = cvmotoryate;
    }

    public int getCamaroteslujo() {
        return camaroteslujo;
    }

    public void setCamaroteslujo(int camaroteslujo) {
        this.camaroteslujo = camaroteslujo;
    }
    
}
