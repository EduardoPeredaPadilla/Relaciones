package Services;

import Entidades.Espectador;
import java.util.ArrayList;
import java.util.Random;

public class EspectadorService {
    
    Random random = new Random();
    ArrayList<Espectador> espectadores = new ArrayList();
    
    public void agregarEspectador(int numEspectadores, ArrayList<Espectador> espectadores) {
        
        for (int i = 0; i < numEspectadores; i++) {
            
            Espectador esp = new Espectador();
            esp.setNombre("Cliente " + (i + 1));
            esp.setEdad(random.nextInt(26) + 15);
            esp.setDineroDisponible((double) random.nextInt(300) );
            espectadores.add(esp);
        }
        
        
    }
    
    public void mostrarEspectadores(ArrayList<Espectador> espectadores) {
        
        for (Espectador espectador : espectadores) {
            System.out.println(espectador);
        }
        
    }
    
}
