package Services;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class JugadorService {
    
    
    RevolverService revServ = new RevolverService();
    Revolver rev = revServ.llenarRevolver();
    ArrayList<Jugador> jugadores = new ArrayList();
    
    public ArrayList<Jugador> agregarJugadores(int numJugadores) {
        for (int i = 0; i < numJugadores; i++) {
            Jugador jug = new Jugador();
            jug.setId(i + 1);
            jug.setNombre("Jugador " + jug.getId());
            jugadores.add(jug);
        }
        return jugadores;
    }
    
    public void disparo(Jugador jug, Revolver rev) {
        
        boolean mojado = revServ.mojar(rev);
        revServ.siguienteChorro(rev);
        
        if (mojado == true) {
            jug.setMojado(mojado);
        } else {
            jug.setMojado(false);
        }
        
    }
    
}
