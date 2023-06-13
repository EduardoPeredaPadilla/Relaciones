package Entidades;

public class Asiento {
    
    private String asiento;
    private boolean disponibilidad = true;

    public Asiento(String asiento, Espectador espectador) {
        this.asiento = asiento;
        this.espectador = espectador;
    }
    private Espectador espectador;

    public Asiento() {
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return asiento + ", disp = " + disponibilidad + ", espectador = " + espectador;
    }

    
    
}
