package Entidades;

import Enums.FormaDePago;
import java.util.Date;

public class Cuota {
    
    private int numCuota;
    private double montoCuota;
    private boolean pagada;
    private Date fechaVencimiento;
    private FormaDePago formaPago;

    public Cuota() {
    }

    public Cuota(int numCuota, double montoCuota, boolean pagada, Date fechaVencimiento, FormaDePago formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
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

    public FormaDePago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaDePago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return " \n " +  " + Número de Cuota = " + numCuota + ", Monto de la Cuota = $" + montoCuota + ", Pagada = " + pagada + ", Fecha de Vencimiento = " + fechaVencimiento + ", Forma de Pago = " + formaPago;
    }
    
    
    
}
