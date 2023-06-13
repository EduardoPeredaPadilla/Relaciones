package Services;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;

public class PeliculaService {
    
    ArrayList<Pelicula> peliculas = new ArrayList();
    Random random = new Random();
    
    public void agregarPeliculas(int cantPeliculas, ArrayList<Pelicula> peliculas) {
        
        for (int i = 0; i < cantPeliculas; i++) {
            
            Pelicula peli = new Pelicula();
            peli.setTitulo("Pelicula " + (i + 1));
            peli.setDirector("Director");
            peli.setDuracion((double) random.nextInt(200) + 60);
            peli.setEdadMinima(random.nextInt(7) + 12);
            peliculas.add(peli);
        }
        
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
}
