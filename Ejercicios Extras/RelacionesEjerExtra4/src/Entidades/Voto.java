package Entidades;

import java.util.ArrayList;

public class Voto {
    
    private Alumno alum;
    private ArrayList<String> nombresCompletos = new ArrayList();

    public Voto() {
    }

    public Voto(Alumno alum) {
        this.alum = alum;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public ArrayList<String> getNombresCompletos() {
        return nombresCompletos;
    }

    public void setNombresCompletos(ArrayList<String> nombresCompletos) {
        this.nombresCompletos = nombresCompletos;
    }

    @Override
    public String toString() {
        return "Voto { " + alum.getNombreCompleto()  + " \n Votos entregados = " +  nombresCompletos +  '}';
    }
    
    
    
}
