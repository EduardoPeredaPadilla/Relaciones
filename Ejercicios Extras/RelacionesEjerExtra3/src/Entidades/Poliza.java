package Entidades;

import Enums.FormaDePago;
import Enums.TipoDeCobertura;
import java.util.ArrayList;
import java.util.Date;

public class Poliza {
    
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private int cantidadCuotas;
    private ArrayList<Cuota> cuotas;
    private FormaDePago formaPago;
    private double montoTotalAseg;
    private String incluyeGranizo;
    private double montoMaxGranizo;
    private TipoDeCobertura tipoCobertura;
    

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numPoliza, Date fechaInicio, Date fechaFin, int cantidadCuotas, ArrayList<Cuota> cuotas, FormaDePago formaPago, double montoTotalAseg, String incluyeGranizo, double montoMaxGranizo, TipoDeCobertura tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.montoTotalAseg = montoTotalAseg;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }
    
    



    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
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

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public FormaDePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaDePago formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoTotalAseg() {
        return montoTotalAseg;
    }

    public void setMontoTotalAseg(double montoTotalAseg) {
        this.montoTotalAseg = montoTotalAseg;
    }

    public String getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(String incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public TipoDeCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoDeCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    

    @Override
    public String toString() {
        return "Poliza " + numPoliza + " \n " + vehiculo + " \n " + cliente + " \n "   + "Fecha de Inicio = " + fechaInicio + ", Vencimiento = " + fechaFin + ", Cantidad de Cuotas = " + cantidadCuotas + ", Forma de Pago = " + formaPago + ", Monto Total Asegurado = " + montoTotalAseg + ", incluye Granizo = " + incluyeGranizo + ", Monto Máximo de Granizo = " + montoMaxGranizo + ", Tipo de Cobertura = " + tipoCobertura + " \n " + "Cuotas = " + cuotas;
    }

    
}
