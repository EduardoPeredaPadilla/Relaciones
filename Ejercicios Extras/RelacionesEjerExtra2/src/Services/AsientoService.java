package Services;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Random;

public class AsientoService {
    
    Asiento [ ] [ ] sala = new Asiento [ 8 ] [ 6 ];
    Random random = new Random();
    
    public Asiento [ ] [ ] crearSala() {
        
        int num = 8;
        String letra;
        String asientoCreado;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                
                Asiento asiento = new Asiento();
                switch( j ) {
                    case 0:
                        asiento.setAsiento(String.valueOf(num) + "A");
                        sala[ i ] [ j ] = asiento;
//                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                    case 1:
                        asiento.setAsiento(String.valueOf(num) + "B");
                        sala[ i ] [ j ] = asiento;
//                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                    case 2:
                        asiento.setAsiento(String.valueOf(num) + "C");
                        sala[ i ] [ j ] = asiento;
//                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                    case 3:
                        asiento.setAsiento(String.valueOf(num) + "D");
                        sala[ i ] [ j ] = asiento;
//                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                    case 4:
                        asiento.setAsiento(String.valueOf(num) + "E");
                        sala[ i ] [ j ] = asiento;
//                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                    case 5:
                        asiento.setAsiento(String.valueOf(num) + "F");
                        sala[ i ] [ j ] = asiento;
                        num--;
//                        if (num == 0) {
//                            num = 8;
//                        }
                        break;
                }
                
                
            }
        }
        
        
        return sala;
        
    }
    
    public void asignarAsientos(Asiento [ ] [ ] sala, ArrayList<Espectador> espectadores, Pelicula peli, Cine cine) {
        
        int auxEspec = 0;
        
        
        for (int i = 0; i < espectadores.size(); i++) {
            
            int contDisp = validarDisponibilidad(sala);
            
            if (contDisp > 0) {
                if (espectadores.get(i).getEdad() >= peli.getEdadMinima() && espectadores.get(i).getDineroDisponible() >= cine.getPrecio()) {
                    buscarAsiento(auxEspec, sala, espectadores);
                    auxEspec++;
                }
            }
        }
        
    }
    
    public int validarDisponibilidad(Asiento [ ] [ ] sala) {
        
        int contDisp = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (sala[ i ][ j ].isDisponibilidad()) {
                    contDisp++;
                }
            }
        }
        return contDisp;
    }
    
    public void buscarAsiento(int auxEspec, Asiento [ ] [ ] sala, ArrayList<Espectador> espectadores) {
        
        int aux1 = random.nextInt(7) + 1;
        int aux2 = random.nextInt(5) + 1;

        if (sala[aux1][aux2].isDisponibilidad()) {
            sala[aux1][aux2].setEspectador(espectadores.get(auxEspec));
            sala[aux1][aux2].setDisponibilidad(false);
        } else {
            buscarAsiento(auxEspec, sala, espectadores);
        }
        
    }
    
    public void asientosDisponibles(Asiento [ ] [ ] sala) {
        
        int asientosDisponibles = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                
                if (sala[ i ] [ j ].isDisponibilidad()) {
                    System.out.println(sala[ i ] [ j ].toString());
                    asientosDisponibles++;
                }
                
            }
        }
        System.out.println("La cantidad de asientos disponibles es " + asientosDisponibles);

        
    }
    
    public void mostrarSala(Asiento [ ] [ ] sala) {
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[ " + sala [ i ] [ j ] + " ]" ); 
                if (j == 5) {
                    System.out.println("");
                }
            }
        }
        
    }
    
}
