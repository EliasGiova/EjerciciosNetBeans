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
public class BarcoMotor extends Barco {

    protected int cvbarcomotor;

    public BarcoMotor() {
    }

    public BarcoMotor(int cvbarcomotor) {
        this.cvbarcomotor = cvbarcomotor;
    }

    public BarcoMotor(int cvbarcomotor, String matricula, int eslora, int anioFabricacion, int modulo) {
        super(matricula, eslora, anioFabricacion, modulo);
        this.cvbarcomotor = cvbarcomotor;
    }

    public int getCvbarcomotor() {
        return cvbarcomotor;
    }

    public void setCvbarcomotor(int cvbarcomotor) {
        this.cvbarcomotor = cvbarcomotor;
    }

}
