package Services;

import Services.PerroService;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Persona> personas = new ArrayList();
    PerroService dog = new PerroService();
    
    public Persona crearPersona() {
        
        Persona per = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        per.setNombre(scan.next());
        System.out.println("Ingrese el apellido de la persona");
        per.setApellido(scan.next());
        System.out.println("Ingrese la edad de la persona");
        per.setEdad(scan.nextInt());
        System.out.println("Ingrese el documento de la persona");
        per.setDocumento(scan.next());
        
        per.setPerro(dog.agregarPerro());
        personas.add(per);
        
        return per;
    }
    
    public void mostrarPersonas() {
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }
    
}
