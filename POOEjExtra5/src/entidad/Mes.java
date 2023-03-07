/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 * final significa que no se puede modificar afuera
 * @author elias
 */
public class Mes {
    private final String[] mesNum;
    private final int mesSecreto;
    private final String adivinanza;

    public Mes() {
        mesNum = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = (int) (Math.random()*12);
        adivinanza = mesNum[mesSecreto];
    }

    public String[] getMesNum() {
        return mesNum;
    }

    public int getMesSecreto() {
        return mesSecreto;
    }

    public String getAdivinanza() {
        return adivinanza;
    }
    
    
    
}
