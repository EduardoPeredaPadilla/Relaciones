package Services;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;

public class CineService {
    
    Asiento [ ] [ ] sala = new Asiento [ 8 ] [ 6 ];
    ArrayList<Pelicula> peliculas = new ArrayList();
    ArrayList<Espectador> espectadores = new ArrayList();
    Random random = new Random();
    
    public void iniciarOperaciones(Asiento [ ] [ ] sala, ArrayList<Pelicula> peliculas, ArrayList<Espectador> espectadores) {
        
        AsientoService asiento = new AsientoService();
        PeliculaService peliServ = new PeliculaService();
        EspectadorService espServ = new EspectadorService();
        Cine cine = new Cine();
        cine.setPrecio(random.nextInt(21) + 80);
        
        int numEspectadores = random.nextInt(29) + 200;
        int cantPeliculas = 10;
        
        
        sala = asiento.crearSala();
        System.out.println(" ---------- SALA DE CINE VACIA -----------");
        asiento.mostrarSala(sala);
        espServ.agregarEspectador(numEspectadores, espectadores);
        System.out.println(" ---------- LISTA DE ESPECTADORES -----------");
        espServ.mostrarEspectadores(espectadores);
        peliServ.agregarPeliculas(cantPeliculas, peliculas);
        System.out.println(" ---------- RESUMEN DE PELICULAS -----------");
        peliServ.mostrarPeliculas(peliculas);
        Pelicula peli = asignarPelicula(peliculas);
        System.out.println(" ---------- PELICULA SELECCIONADA -----------");
        System.out.println(peli.toString());
        asiento.asignarAsientos(sala, espectadores, peli, cine);
        System.out.println(" ---------- ASIGNAR ASIENTOS PARA ESPECTADORES QUE CUMPLAN LA EDAD MÍNIMA Y TENGAN EL $ SIUFICIENTE -----------");
        System.out.println("Edad mínima de la pelicula seleccionada = " + peli.getEdadMinima());
        System.out.println("Precio del cine = $" + cine.getPrecio());
        System.out.println(" ---------- SALA DE CINE CON ESPECTADORES -----------");
        asiento.mostrarSala(sala);
        System.out.println(" ---------- ASIENTOS DISPONIBLES -----------");
        asiento.asientosDisponibles(sala);

        int asientosVacios = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (sala[ i ][ j ].isDisponibilidad()) {
                asientosVacios++;
            }
            }
        }
        
        int asientosOcupados = 48 - asientosVacios;
        
        System.out.println("");
        System.out.println(" ---------- RESUMEN DE OPERACIONES -----------");
        System.out.println("Total de Espectadores = " + espectadores.size());
        System.out.println("Pelicula = " + peli.getTitulo());
        System.out.println("Precio = $" + cine.getPrecio());
        System.out.println("Total de espectadores que pudieron entrar (edad mínima y precio) = " + asientosOcupados);
        System.out.println("Total de asientos ocupados = " + asientosOcupados);
        System.out.println("Total de asientos libres = " + asientosVacios);
        System.out.println("Total de ingresos por entradas a la pelicula = $" + (cine.getPrecio() * asientosOcupados));
        
    }
    
    public Pelicula asignarPelicula(ArrayList<Pelicula> peliculas) {
        
        Pelicula peli = peliculas.get(random.nextInt(10));
        return peli;
    }
    
}
