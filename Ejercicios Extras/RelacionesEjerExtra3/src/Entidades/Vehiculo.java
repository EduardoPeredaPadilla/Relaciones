package Entidades;

import Enums.TipoVehiculo;
import java.util.Date;

public class Vehiculo {
    
    private String marca;
    private String modelo;
//    private Date anio = new Date();
    private int anio;
    private long numMotor;
    private String chasis;
    private String color;
    private  TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, long numMotor, String chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(long numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo {" + "marca = " + marca + ", modelo = " + modelo + ", anio = " + anio + ", numMotor = " + numMotor + ", chasis = " + chasis + ", color = " + color + ", tipo = " + tipo + '}';
    }
    
    
    
}
