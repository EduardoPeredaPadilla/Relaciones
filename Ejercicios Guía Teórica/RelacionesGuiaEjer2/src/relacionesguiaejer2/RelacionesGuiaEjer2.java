package relacionesguiaejer2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Services.JuegoService;
import Services.JugadorService;
import Services.RevolverService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesGuiaEjer2 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);      
        
        
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverService rev = new RevolverService();
        Revolver r = rev.llenarRevolver();
        JugadorService jug = new JugadorService();
        
        

        System.out.println("**** JUEGO DE RULETA RUZA DE AGUA ***** ");
        System.out.println("Ingresa el número de jugadores");
        int numJugadores = scan.nextInt();
        System.out.println("Agregando jugadores");
        jugadores = jug.agregarJugadores(numJugadores);
        System.out.println("-------- Lista de Jugadores --------------");
        System.out.println(jugadores.toString());
        System.out.println("------- Inicio al juego! ----------");
        JuegoService jServ = new JuegoService();
        Juego juego = jServ.llenarJuego(jugadores, r);
        jServ.ronda(juego, r);
        

    }

}
