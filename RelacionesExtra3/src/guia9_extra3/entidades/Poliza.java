/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extra3.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Poliza {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int nroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantCuotas;
    private ArrayList<Cuota> estadoCuotas;
    private int montoTotalAsegurado;
    private boolean granizo;
    private int maxGranizo;
    private String tipoCobertura;

    public Poliza() {
        estadoCuotas = new ArrayList<>();
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, int nroPoliza, Date fechaInicio, Date fechaFin, int cantCuotas, int montoTotalAsegurado, boolean granizo, int maxGranizo, String tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        estadoCuotas = new ArrayList<>();
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.maxGranizo = maxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArrayList<Cuota> getEstadoCuotas() {
        return estadoCuotas;
    }

    public void setEstadoCuotas(ArrayList<Cuota> estadoCuotas) {
        this.estadoCuotas = estadoCuotas;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMaxGranizo() {
        return maxGranizo;
    }

    public void setMaxGranizo(int maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", nroPoliza=" + nroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", estadoCuotas=" + estadoCuotas + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", maxGranizo=" + maxGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }


    
    
    
}
