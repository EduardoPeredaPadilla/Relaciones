package Services;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class JuegoService {
    
    Juego juego = new Juego();
    Revolver rev = new Revolver();
    ArrayList<Jugador> jugadores = new ArrayList();
    JugadorService jugServ = new JugadorService();
    
    public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver rev) {
        
        this.juego.setJugadores(jugadores);
        this.juego.setRev(rev);
        this.jugadores.addAll(jugadores);
        
        return juego;
    }
    
    public void ronda(Juego juego, Revolver rev) {
        
        boolean finJuego = false;
        
        do {
            
            System.out.println("Nueva ronda");
            for (Jugador jugador : jugadores) {
            
            System.out.println("Turno del jugador " + jugador.getNombre());
            jugServ.disparo(jugador, rev);
            if (jugador.isMojado()) {
//                System.out.println(rev.toString());
                System.out.println("El jugador que perdió y se mojó fue " + jugador.toString());
                System.out.println("---------- FIN DEL JUEGO ------------");
                finJuego = true;
                return;
            } else {
//                System.out.println(rev.toString());
                System.out.println("El jugador no se mojo, es turno del siguiente jugador");
                finJuego = false;
            }
        }
            
        } while (!finJuego);

    }
    
}
