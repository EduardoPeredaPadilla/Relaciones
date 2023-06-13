package Services;

import Entidades.Revolver;
import java.util.Random;

public class RevolverService {
    
    
    
    public Revolver llenarRevolver() {
        Revolver rev = new Revolver();
        Random random = new Random();
        int num = random.nextInt(5) + 1;
        int num2 = random.nextInt(5) + 1;
        rev.setPosActual(num);
        rev.setPosAgua(num2);
        
        return rev;
    }
    
    public boolean mojar(Revolver rev) {
        
        boolean mojado = false;
        
        if (rev.getPosActual() == rev.getPosAgua()) {
            mojado = true;
            System.out.println("Dispara agua el revolver!");
            System.out.println(rev.toString());
            return mojado;
        }
        
        System.out.println("revolver vacio, tuviste suerte!");
        System.out.println(rev.toString());
        return mojado;
    }
    
    public void siguienteChorro(Revolver rev) {
        
        if (rev.getPosActual() < 5) {
            rev.setPosActual(rev.getPosActual() + 1);
        } else {
            rev.setPosActual(1);
        }
        
    }
    
}
