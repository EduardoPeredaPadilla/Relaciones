package relacionesguiaejer3;

import Entidades.Baraja;
import Entidades.Carta;
import Services.BarajaService;
import Services.CartaService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesGuiaEjer3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        BarajaService barServ = new BarajaService();
        Baraja baraja = barServ.crearBaraja();
        System.out.println("-------- BAJARA ORDENADA ---------");
        barServ.mostrarBaraja(baraja);
        System.out.println("-------- BAJARA DESORDENADA ---------");
        barServ.barajear(baraja);
        System.out.println("-------- MOSTRAR CARTAS ---------");
        barServ.mostrarBaraja(baraja);
        System.out.println("-------- SIGUEINTE CARTA ---------");
        Carta cartaSiguiente = barServ.siguienteCarta(baraja);
        System.out.println(cartaSiguiente.toString());
        System.out.println("-------- CARTAS DISPONIBLES ---------");
        barServ.cartasDisponibles(baraja);
        System.out.println("-------- ENTREGAR CARTAS ---------");
        barServ.darCartas(baraja);
        System.out.println("-------- MOSTRAR CARTAS ---------");
        barServ.mostrarBaraja(baraja);
        System.out.println(baraja.getCartas().size());
        System.out.println("-------- CARTAS MONTO ---------");
        barServ.cartasMonto(baraja);
        System.out.println("-------- MOSTRAR CARTAS ---------");
        barServ.mostrarBaraja(baraja);
    }

}
