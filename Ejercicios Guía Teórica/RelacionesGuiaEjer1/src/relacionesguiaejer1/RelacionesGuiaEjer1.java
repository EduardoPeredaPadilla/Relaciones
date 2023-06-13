package relacionesguiaejer1;

import Entidades.Persona;
import Services.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesGuiaEjer1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int totPersonas = 2;
        PersonaService per = new PersonaService();
        
        for (int i = 0; i < totPersonas; i++) {
            per.crearPersona();
        }
        
        per.mostrarPersonas();
        
        
        
        

    }

}
