package relacionesguiaejer1;

import Entidades.Perro;
import Entidades.Persona;
import Services.PerroService;
import Services.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesGuiaEjer1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        PersonaService per = new PersonaService();
        PerroService perrServ = new PerroService();
        
        System.out.println("--------- EJERCICIO PERSONAS ADOPTANDO PERROS ----------");
        System.out.println("Ingrese la cantidad de personas que desean adoptar");
        int totalPersonas = scan.nextInt();
        
        System.out.println("-------- Lista de personas ---------");
        personas.addAll(per.crearPersona(totalPersonas));
        per.mostrarPersonas(personas);
        
        System.out.println("-------- Lista de perros ---------");
        perros.addAll(perrServ.agregarPerro(totalPersonas));
        perrServ.mostrarPerros(perros);
        int cont = 1;
        System.out.println("------- Inicia proceso de adopción ---------");
        for (Persona persona : personas) {
            per.adoptarPerro(persona, perros);
            System.out.println("vueltas del ciclo " + cont);
            cont++;
        }
        
        System.out.println("-------- Lista de personas y sus perros ---------");
        per.mostrarPersonas(personas);
        perrServ.mostrarPerros(perros);

    }

}
