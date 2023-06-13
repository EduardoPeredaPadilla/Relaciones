package Services;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Enums.FormaDePago;
import Enums.TipoDeCobertura;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class PolizaService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Poliza> polizas = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Cuota> cuotas = new ArrayList();
    Random random = new Random();
    CuotaService cuotaServ = new CuotaService();
    
    public ArrayList<Poliza> agregarPoliza(ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculos) {
        
        Poliza pol = new Poliza();
        int numCliente = 1;
        int numVehiculo = 1;
        
        System.out.println("---------- Lista de clientes ------------");
        for (Cliente cliente : clientes) {
            System.out.println(numCliente + ". " + cliente.getNombre() + " " + cliente.getApellido());
            numCliente++;
        }
        System.out.println("Seleccione un cliente para asignar la poliza");
        int client = scan.nextInt();
        System.out.println("Cliente seleccionado :");
        System.out.println(clientes.get(client - 1).toString());
        pol.setCliente(clientes.get(client - 1));
        
        System.out.println("---------- Lista de vehiculos ------------");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(numVehiculo + ". " + vehiculo.toString());
            numVehiculo++;
        }
        System.out.println("Seleccione el vehículo para asignar a la poliza");
        int vehic = scan.nextInt();
        System.out.println("Vehículo seleccionado :");
        System.out.println(vehiculos.get(vehic - 1).toString());
        pol.setVehiculo(vehiculos.get(vehic - 1));
        
        pol.setNumPoliza(random.nextInt(801) + 100);
        
        
        
//        Date fechaInicio = new Date();
//        fechaInicio.setYear(fechaInicio.getYear() - 1);
        System.out.println("Fecha de inicio = " + new Date());
        pol.setFechaInicio(new Date());
        Date fechaFin = new Date();
        fechaFin.setYear(fechaFin.getYear() + 1);
        System.out.println("Fecha de vencimiento de la poliza = " + fechaFin);
        pol.setFechaFin(fechaFin);
        
        System.out.println("Defina la cantidad de cuotas (12, 6, 1)");
        int numCuotas = scan.nextInt();
        pol.setCantidadCuotas(numCuotas);
        
        
        
        System.out.println("Seleccione la forma de pago = ");
        System.out.println("1. Efectivo");
        System.out.println("2. Transferecnia");
        System.out.println("3. TDD");
        System.out.println("4. TDC");
        int formPag = scan.nextInt();
        switch(formPag) {
            case 1:
                pol.setFormaPago(FormaDePago.EFECTIVO);
                break;
            case 2:
                pol.setFormaPago(FormaDePago.TRANSFERENCIA);
                break;
            case 3:
                pol.setFormaPago(FormaDePago.TDD);
                break;
            case 4:
                pol.setFormaPago(FormaDePago.TDC);
                break;
        }
        
        System.out.println("Ingrese el monto total asegurado");
        double monto = scan.nextDouble();
        pol.setMontoTotalAseg(monto);
        
        pol.setCuotas(cuotaServ.generarCuotas(numCuotas, monto, pol.getFormaPago()));
        
        System.out.println("Inclue Granizo?");
        System.out.println("S. Sí");
        System.out.println("N. No");
        String incGran = scan.next();
        if (incGran.equalsIgnoreCase("s")) {
            pol.setIncluyeGranizo("Incluye Granizo");
        } else if (incGran.equalsIgnoreCase("n")) {
            pol.setIncluyeGranizo("No Incluye Granizo");
        }
        
        if (pol.getIncluyeGranizo().equalsIgnoreCase("Incluye Granizo")) {
            System.out.println("Ingrese el monto máximo de granizo");
            pol.setMontoMaxGranizo(scan.nextDouble());
        }
        
        System.out.println("Seleccione el tipo d cobertura de la poliza");
        System.out.println("1. Total");
        System.out.println("2. Contra terceros");
        System.out.println("3. Media");
        System.out.println("4. Básica");
        int cobert = scan.nextInt();
        switch(cobert) {
            case 1:
                pol.setTipoCobertura(TipoDeCobertura.TOTAL);
                break;
            case 2:
                pol.setTipoCobertura(TipoDeCobertura.CONTRATERCEROS);
                break;
            case 3:
                pol.setTipoCobertura(TipoDeCobertura.MEDIA);
                break;
            case 4:
                pol.setTipoCobertura(TipoDeCobertura.BASICA);
                break;
        }
        
        
        
        polizas.add(pol);
        System.out.println("++++++++++ Poliza generada exitosamente ++++++++");
        
        return polizas;
    }
    
    public void mostrarPolizas(ArrayList<Poliza> polizas) {
        
        int totalPolizas = 0;
        
        System.out.println("> LISTA DE POLIZAS -----------------------");
        for (Poliza poliza : polizas) {
            System.out.println(poliza.toString());
            totalPolizas++;
        }
        System.out.println("Total de polizas registradas = " + totalPolizas);
        System.out.println("--------------------------------------------------------------");
        
    }
    
    public void mostrarCuotasDePoliza(ArrayList<Poliza> polizas) {
        
        System.out.println("Ver las cuotas de una poliza en particular");
        int indice = 1;
        
        for (Poliza poliza : polizas) {
            System.out.println("No." + indice + " " + poliza.getNumPoliza() + " " + poliza.getCliente().toString());
            indice++;
        }
        
        System.out.println("Ingrese el número de poliza");
        int numPoliza = scan.nextInt() - 1;
        
        cuotaServ.mostrarCoutas(polizas.get(numPoliza));
        
    }
    
    public void mostrarCuotasPorPagarDePoliza(ArrayList<Poliza> polizas) {
        
        System.out.println("Ver las cuotas por pagar de una poliza en particular");
        int indice = 1;
        
        for (Poliza poliza : polizas) {
            System.out.println("No." + indice + " " + poliza.getNumPoliza() + " " + poliza.getCliente().toString());
            indice++;
        }
        
        System.out.println("Ingrese el número de poliza");
        int numPoliza = scan.nextInt() - 1;
        cuotaServ.mostrarCuotasPorPagar(polizas.get(numPoliza));
        
    }
    
    public void pagarCuotasDePoliza(ArrayList<Poliza> polizas) {
        
        System.out.println("Ver las cuotas por pagar de una poliza en particular");
        int indice = 1;
        
        for (Poliza poliza : polizas) {
            System.out.println("No." + indice + " " + poliza.getNumPoliza() + " " + poliza.getCliente().toString());
            indice++;
        }
        
        System.out.println("Ingrese el número de poliza");
        int numPoliza = scan.nextInt() - 1;
        cuotaServ.mostrarCuotasPorPagar(polizas.get(numPoliza));
        
        System.out.println("Ingrese el número de cuota a pagar");
        int numCuota = scan.nextInt() - 1;
        cuotaServ.pagarCuota(polizas.get(numPoliza), numCuota);
        
        System.out.println("--------- Cuota Pagada exitosamente -------------");
        System.out.println("***********************************************************");
        System.out.println("");
        cuotaServ.mostrarCoutas(polizas.get(numPoliza));
        
    }
    
}
