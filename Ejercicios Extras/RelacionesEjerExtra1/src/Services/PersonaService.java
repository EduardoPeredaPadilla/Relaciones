package Services;

import Entidades.Perro;
import Services.PerroService;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Persona> personas = new ArrayList();
    PerroService dog = new PerroService();
    
    public ArrayList<Persona> crearPersona(int totalPersonas) {
        
        for (int i = 0; i < totalPersonas; i++) {
            Persona per = new Persona();
            per.setNombre("Persona " + (i + 1));
            per.setApellido("Apellido " + (i + 1));
            per.setDocumento("DNI");
            per.setEdad(25);
            personas.add(per);
        }
        
        return personas;
    }
    
    public void adoptarPerro(Persona persona, ArrayList<Perro> perros) {
        
        boolean valid = false;
        
        System.out.println("Hola " + persona.getNombre() + ", a continuación se muestra la lista de perros para adopción");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        System.out.println("¿Cual es el nombre del perro que deseas adoptar?");
        String perroAdoptar = scan.next();
        for (Perro perro : perros) {
            System.out.println("Nombre del perro = " + perro.getNombre().toString());
            if (perro.getNombre().toString().equalsIgnoreCase(perroAdoptar)) {
                if (!perro.isAdoptado()) {
                    System.out.println("Felicidades, acabas de adoptar a " + perro.getNombre().toString());
                    perro.setAdoptado(true);
                    persona.setPerro(perro);
                    valid = true;
                    System.out.println(valid);
                    break;
                } else {
                    System.out.println("Lo sentimos, ese perro ya ha sido adoptado");
                    System.out.println("Busquemos otro perro");
                    valid = true;
                    adoptarPerro(persona, perros);
                }
            }
            
        }
        if (!valid) {
            System.out.println("Opción inválida");
            System.out.println("Busquemos otro perro");
            adoptarPerro(persona, perros);
        } 
        
        
    }
    
    public void mostrarPersonas(ArrayList<Persona> personas) {
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }
    
}
