package Services;

import Entidades.Carta;
import Entidades.Palo;
import java.util.ArrayList;

public class CartaService {
    
    ArrayList<Carta> cartas = new ArrayList();
    
    public ArrayList<Carta> crearCartas() {
        
        int num = 1;
        int controlPalo = 1;
        for (int i = 0; i < 40; i++) {
            
            Carta carta = new Carta();
            carta.setNum(num);
           
            if (num < 13) {
                switch(controlPalo) {
                    case 1:
                      carta.setPalo(Palo.BASTOS);
                        num++;
                        if (num == 8) {
                            num = 10;
                        } else if (num == 13) {
                            controlPalo++;
                            num = 1;
                        }  
                        cartas.add(carta);
                        break;
                    case 2:
                        carta.setPalo(Palo.COPAS);
                        num++;
                        if (num == 8) {
                            num = 10;
                        } else if (num == 13) {
                            controlPalo++;
                            num = 1;
                        }  
                        cartas.add(carta);
                        break;
                    case 3:
                        carta.setPalo(Palo.ESPADAS);
                        num++;
                        if (num == 8) {
                            num = 10;
                        } else if (num == 13) {
                            controlPalo++;
                            num = 1;
                        }  
                        cartas.add(carta);
                        break;
                    case 4:
                        carta.setPalo(Palo.OROS);
                        num++;
                        if (num == 8) {
                            num = 10;
                        } else if (num == 13) {
                            controlPalo++;
                            num = 1;
                        }  
                        cartas.add(carta);
                        break;
                }
            }
        }
        System.out.println("Cartas creadas");
        return cartas;
    }
    
}
