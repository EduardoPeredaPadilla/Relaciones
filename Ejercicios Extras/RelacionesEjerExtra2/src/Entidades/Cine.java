package Entidades;

import java.util.ArrayList;

public class Cine {
    
    private Pelicula pelicula;
    public double precio;
    private Asiento [ ] [ ] sala = new Asiento [ 8 ] [ 6 ];
    private ArrayList<Espectador> espectadores = new ArrayList();

    public Cine() {
    }

    public Cine(Pelicula pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + sala + ", espectadores=" + espectadores + '}';
    }
    
    
    
}
