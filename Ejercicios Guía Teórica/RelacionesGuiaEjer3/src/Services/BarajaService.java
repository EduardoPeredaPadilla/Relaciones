package Services;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaService {
    
    private ArrayList<Carta> cartas = new ArrayList();
    private ArrayList<Carta> cartasFuera = new ArrayList();
    Scanner scan = new Scanner(System.in);
    
    public Baraja crearBaraja() {
        
        CartaService cartaServ = new CartaService();
        Baraja baraja = new Baraja();
        baraja.setCartas(cartaServ.crearCartas());

        return baraja;
    }
    
    public void barajear(Baraja baraja) {
        
        Collections.shuffle(baraja.getCartas());

    }
    
    public Carta siguienteCarta(Baraja baraja) {
        
        Carta cartaSiguiente = new Carta();
        cartas.addAll(baraja.getCartas());
        if (cartas.size() > 1) {
            cartaSiguiente = cartas.get(0);
        } else if (cartas.size() == 1) {
            cartaSiguiente = cartas.get(0);
            System.out.println("Esta fue la última carta");
        } else {
            System.out.println("Ya no hay más cartas");
        }
        
        return cartaSiguiente;
    }
    
    public void cartasDisponibles(Baraja baraja) {
        
        System.out.println("El número de cartas disponibles para repartir es " + baraja.getCartas().size());
        
    }
    
    public void darCartas(Baraja baraja) {
        
        System.out.println("Cuantas cartas quieres?");
        int numCartas = scan.nextInt();
        
        if (numCartas > baraja.getCartas().size()) {
            System.out.println("No hay la cantidad de cartas a retirar");
            return;
        }
        
        for (int i = 0; i < numCartas; i++) {
            cartasFuera.add(baraja.getCartas().get(0));
            baraja.getCartas().remove(0);
        }
        
    }
    
    public void cartasMonto(Baraja baraja) {
      
        System.out.println("Las cartas que ya han salido son = " + cartasFuera.size());
        if (cartasFuera.size() == 0) {
            System.out.println("No han salido cartas");
            return;
        } else {
            for (Carta carta : cartasFuera) {    
                System.out.println(carta);
            }
        }
        
        
    }
    
    public void mostrarBaraja(Baraja baraja) {
        
        System.out.println(baraja.toString());
        
    }
    
}
