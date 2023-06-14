package Entidades;

import java.util.ArrayList;

public class Alumno {
    
    private String nombreCompleto;
    private long DNI;
    private int cantVotos;
    ArrayList<String> votosDados;
    private int  cantVotosEntregados;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, long DNI, int cantVotos, ArrayList<String> votosDados, int cantVotosEntregados) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantVotos = cantVotos;
        this.votosDados = votosDados;
        this.cantVotosEntregados = cantVotosEntregados;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    public ArrayList<String> getVotosDados() {
        return votosDados;
    }

    public void setVotosDados(ArrayList<String> votosDados) {
        this.votosDados = votosDados;
    }

    public int getCantVotosEntregados() {
        return cantVotosEntregados;
    }

    public void setCantVotosEntregados(int cantVotosEntregados) {
        this.cantVotosEntregados = cantVotosEntregados;
    }

    

    

    @Override
    public String toString() {
        return "Alumno \n " + "Nombre Completo = " + nombreCompleto + " \n DNI = " + DNI + " \n Votos recibidos = " + cantVotos + " \n Cantidad de Votos Entregados = " + cantVotosEntregados + " \n Votos Entregados = " + votosDados;
    }
    
    
    
}
