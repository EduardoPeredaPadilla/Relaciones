package Services;

import Entidades.Cuota;
import Entidades.Poliza;
import Enums.FormaDePago;
import java.util.ArrayList;
import java.util.Date;

public class CuotaService {
    
    ArrayList<Cuota> cuotas = new ArrayList();
    
    public ArrayList<Cuota> generarCuotas(int numCuotas, double monto, FormaDePago formPago) {
        
        
        double montoCuota = (double) monto / numCuotas;
        int auxMes = 1;
        int auxMes2 = 2;
        
        for (int i = 0; i < numCuotas; i++) {
            Cuota cuota = new Cuota();
            int numCuota = (i + 1);
            Date fechaVencimiento = new Date();
//            fechaVencimiento = fechaInicio;
            switch(numCuotas) {
                case 1:
                    fechaVencimiento.setDate(new Date().getDate() + 5);
                    break;
                case 6:
                    fechaVencimiento.setMonth(new Date().getMonth() + auxMes2);
                    auxMes2 = auxMes2 + 2;
                    break;
                case 12:
                    fechaVencimiento.setMonth(fechaVencimiento.getMonth() + auxMes);
                    auxMes = auxMes + 1;
                    break;
            }
            cuota.setNumCuota(numCuota);
            cuota.setMontoCuota(montoCuota);
            cuota.setPagada(false);
            cuota.setFechaVencimiento(fechaVencimiento);
            cuota.setFormaPago(formPago);

            cuotas.add(cuota);
        }
        
        
        return cuotas;
    }
    
    public void mostrarCoutas(Poliza pol) {
        
        ArrayList<Cuota> cuotas = new ArrayList();
        
        cuotas.addAll(pol.getCuotas());
        
        System.out.println("------------ Lista de Cuotas -------------");
        for (Cuota cuota : cuotas) {
            System.out.println(cuota.toString());
        }
        System.out.println("--------------------------------------------------");
    }
    
    public void mostrarCuotasPorPagar(Poliza pol) {
        
        ArrayList<Cuota> cuotas = new ArrayList();
        
        cuotas.addAll(pol.getCuotas());
        
        System.out.println("------------ Lista de Cuotas Por Pagar-------------");
        
        for (Cuota cuota : cuotas) {
            if (!cuota.isPagada()) {
                System.out.println(cuota.toString());
            }
        }
        
        System.out.println("--------------------------------------------------");
    }
    
    public void pagarCuota(Poliza pol, int numCuota) {
        
        ArrayList<Cuota> cuotas = new ArrayList();
        cuotas.addAll(pol.getCuotas());
        cuotas.get(numCuota).setPagada(true);
        
        
    }
    
    
}
