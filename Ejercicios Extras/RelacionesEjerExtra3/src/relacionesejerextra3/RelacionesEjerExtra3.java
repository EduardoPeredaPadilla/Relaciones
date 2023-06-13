package relacionesejerextra3;

import Entidades.Cliente;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Services.ClienteService;
import Services.PolizaService;
import Services.VehiculoService;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesEjerExtra3 {
    
//    Scanner scan = new Scanner(System.in);
    static ArrayList<Cliente> clientes = new ArrayList();
    static ArrayList<Vehiculo> vehiculos = new ArrayList();
    static ArrayList<Poliza> polizas = new ArrayList();
    static int cantClientes = 5;
    static int totalVehiculos = 5;

    static ClienteService clientServ = new ClienteService();
    static VehiculoService vehicServ = new VehiculoService();
    static PolizaService polizaServ = new PolizaService();
    static Poliza pol = new Poliza();

    public static void main(String[] args) {
        
        Menu();
        System.out.println("Hasta pronto!");

    }
    
    public static void Menu() {
        
        int opc = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("------------ LA TERCERA SEGUROS -----------------");
            System.out.println("Menú de opciones");
            System.out.println("1.  Agregar cliente de Prueba");
            System.out.println("2.  Agregar lista de clientes genéricos");
            System.out.println("3.  Mostrar lista de clientes");
            System.out.println("4.  Agregar un cliente por teclado");
            System.out.println("5.  Agregar Vehículo de prueba");
            System.out.println("6.  Agregar lista de veihículos genéricos");
            System.out.println("7.  Agregar un vehículo por teclado");
            System.out.println("8.  Mostrar lista de vehículos");
            System.out.println("9.  Agregar Poliza");
            System.out.println("10. Mostrar Polizas");
            System.out.println("11. Mostrar Cuotas de una poliza");
            System.out.println("12. Mostrar Cuotas Por Pagar de una poliza");
            System.out.println("13. Pagar Cuota de una poliza");
            System.out.println("14. Salir");
            opc = scan.nextInt();
            
            if (opc < 1 || opc > 14) {
                System.out.println("Opción inválida");
            } else {
                
                switch(opc) {
                    case 1:
                        System.out.println("Elegiste la opción 1. Agregar cliente de Prueba");
                        clientes = clientServ.agregarCliente();
                        System.out.println("");
                        Menu();
                        break;
                    case 2:
                        System.out.println("Elegiste la opción 2. Agregar lista de clientes genéricos");
                        clientServ.agregarVariosClientes(cantClientes);
                        System.out.println("");
                        Menu();
                        break;
                    case 3:
                        System.out.println("Elegiste la opción 3. Mostrar lista de clientes");
                        clientServ.mostrarCliente(clientes);
                        System.out.println("");
                        Menu();
                        break;
                    case 4:
                        System.out.println("Elegiste la opción 4. Agregar un cliente por teclado");
                        clientes.addAll(clientServ.agregarClientePorUsuario()) ;
                        System.out.println("");
                        Menu();
                        break;
                    case 5:
                        System.out.println("Elegiste la opción 5. Agregar Vehículo de prueba");
                        vehiculos = vehicServ.agregarVehiculo();
                        System.out.println("");
                        Menu();
                        break;
                    case 6:
                        System.out.println("Elegiste la opción 6. Agregar lista de vihículos genéricos");
                        vehicServ.agregarVariosVehiculos(totalVehiculos);
                        System.out.println("");
                        Menu();
                        break;
                    case 7:
                        System.out.println("Elegiste la opción 7. Agregar un vehículo por teclado");
                        vehiculos.addAll(vehicServ.agregarVehiculoUsuario());
                        System.out.println("");
                        Menu();
                        break;
                    case 8:
                        System.out.println("Elegiste la opción 8.  Mostrar lista de vehículos");
                        vehicServ.mostrarVehiculos(vehiculos);
                        System.out.println("");
                        Menu();
                        break;
                    case 9:
                        System.out.println("Elegiste la opción 9. Agregar Poliza");
                        polizas = polizaServ.agregarPoliza(clientes, vehiculos);
                        System.out.println("");
                        Menu();
                        break;
                    case 10:
                        System.out.println("Elegiste la opción 10. Mostrar Polizas");
                        polizaServ.mostrarPolizas(polizas);
                        System.out.println("");
                        Menu();
                        break;
                    case 11:
                        System.out.println("Elegiste la opción 11. Mostrar Cuotas de una poliza");
                        polizaServ.mostrarCuotasDePoliza(polizas);
                        System.out.println("");
                        Menu();
                        break;
                    case 12:
                        System.out.println("Elegiste la opción 12. Mostrar Cuotas Por Pagar de una poliza");
                        polizaServ.mostrarCuotasPorPagarDePoliza(polizas);
                        System.out.println("");
                        Menu();
                        break;
                    case 13:
                        System.out.println("Elegiste la opción 13. Pagar Cuota de una poliza");
                        polizaServ.pagarCuotasDePoliza(polizas);
                        System.out.println("");
                        Menu();
                        break;
                    case 14:
                        System.out.println("Elegiste la opción 14. Salir");
                        break;
                }
                
            }
            
        } while (opc != 14);
        
        if (opc == 14) {
            
            return;
        }
    }

}
