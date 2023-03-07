/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cuota {
    
    private int nroCuota;
    private int monto;
    private boolean pagada;
    private Date fechaVencimiento;
    private String modoDePago;

    public Cuota() {
    }

    public Cuota(int nroCuota, int monto, boolean pagada, Date fechaVencimiento, String modoDePago) {
        this.nroCuota = nroCuota;
        this.monto = monto;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.modoDePago = modoDePago;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(String modoDePago) {
        this.modoDePago = modoDePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", monto=" + monto + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", modoDePago=" + modoDePago + '}';
    }


}
