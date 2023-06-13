package Services;

import Entidades.Perro;
import java.util.Scanner;

public class PerroService {
    
    Scanner scan = new Scanner(System.in);
    
    public Perro agregarPerro() {
        
        Perro dog = new Perro();
        System.out.println("Ingrese el nombre del perro");
        dog.setNombre(scan.next());
        System.out.println("Ingrese la raza del perro");
        dog.setRaza(scan.next());
        System.out.println("Ingrese la edad del perro");
        dog.setEdad(scan.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        dog.setTamanio(scan.next()); 
        
        return dog;
    }
    
    
    
}
