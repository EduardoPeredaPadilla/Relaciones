package Services;

import Entidades.Perro;
import Enumeraciones.NombrePerro;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Perro> perros = new ArrayList();
    
    public ArrayList<Perro> agregarPerro(int totalPerros) {
        
        for (int i = 0; i < totalPerros; i++) {
            
            Perro dog = new Perro();
            switch (i) {
                case 0:
                    dog.setNombre(NombrePerro.MAYA);
                    break;
                case 1:
                    dog.setNombre(NombrePerro.COCO);
                    break;
                case 2:
                    dog.setNombre(NombrePerro.CANCUN);
                    break;
                case 3:
                    dog.setNombre(NombrePerro.SCOOBY);
                    break;
                case 4:
                    dog.setNombre(NombrePerro.COCAN);
                    break;
                case 5:
                    dog.setNombre(NombrePerro.POLLY);
                    break;
                case 6:
                    dog.setNombre(NombrePerro.ROCKO);
                    dog.setAdoptado(true);
                    break;
                case 7:
                    dog.setNombre(NombrePerro.PUSTULIO);
                    break;
            }
            dog.setRaza("Calle");
            dog.setEdad(3);
            dog.setTamanio("Mediano");
            perros.add(dog);
        }
        

        return perros;
    }
    
    public void mostrarPerros(ArrayList<Perro> perros) {
        
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        
    }
    
    
}
