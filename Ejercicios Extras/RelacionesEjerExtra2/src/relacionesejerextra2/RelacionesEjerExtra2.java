package relacionesejerextra2;

import Entidades.Asiento;
import Entidades.Espectador;
import Entidades.Pelicula;
import Services.CineService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesEjerExtra2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Asiento [ ] [ ] sala = new Asiento [ 8 ] [ 6 ];
        ArrayList<Espectador> espectadores = new ArrayList();
        ArrayList<Pelicula> peliculas = new ArrayList();
        CineService cine = new CineService();
        cine.iniciarOperaciones(sala, peliculas, espectadores);
        
    }

}
