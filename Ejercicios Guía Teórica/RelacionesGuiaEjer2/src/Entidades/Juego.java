package Entidades;

import java.util.ArrayList;

public class Juego {
    
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver rev;

    public Juego() {
    }

    public Juego(Revolver rev) {
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", rev=" + rev + '}';
    }
    
    
    
}
