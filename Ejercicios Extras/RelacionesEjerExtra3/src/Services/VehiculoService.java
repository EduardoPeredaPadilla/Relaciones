package Services;

import Entidades.Vehiculo;
import Enums.TipoVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class VehiculoService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public  ArrayList<Vehiculo> agregarVehiculoUsuario() {
        
        Vehiculo vehic = new Vehiculo();
        
        System.out.println("Igrese la marca del vehículo");
        vehic.setMarca(scan.next());
        System.out.println("Ingrese el modelo");
        vehic.setModelo(scan.next());
        System.out.println("Ingrese el año");
        vehic.setAnio(scan.nextInt());
        System.out.println("Ingrese el número de motor");
        vehic.setNumMotor(scan.nextLong());
        System.out.println("Ingrese el chasis");
        vehic.setChasis(scan.next());
        System.out.println("Ingrese el color");
        vehic.setColor(scan.next());
        
        
        vehiculos.add(vehic);
        return vehiculos;
    }
    
    public ArrayList<Vehiculo> agregarVehiculo() {
        
        Vehiculo vehic = new Vehiculo();
        
        String marca = "Ford";
        String modelo = "Focus";
    //    private Date anio = new Date();
        int anio = 2023;
        long numMotor = 987654321;
        String chasis = "Chasis";
        String color = "Negro";
        
        vehic.setMarca(marca);
        vehic.setModelo(modelo);
        vehic.setAnio(anio);
        vehic.setNumMotor(numMotor);
        vehic.setChasis(chasis);
        vehic.setColor(color);
        vehic.setTipo(TipoVehiculo.SEDAN);

        vehiculos.add(vehic);
        return vehiculos;
    }
    
    public ArrayList<Vehiculo> agregarVariosVehiculos(int totalVehiculos) {
        
        for (int i = 0; i < totalVehiculos; i++) {
            
            Vehiculo vehic = new Vehiculo();
            
            String marca = "Vehiculo " + (i + 1);
            String modelo = "Jeep";
        //    private Date anio = new Date();
            int anio = 2023;
            long numMotor = 987654321;
            String chasis = "Chasis";
            String color = "Blanco";

            vehic.setMarca(marca);
            vehic.setModelo(modelo);
            vehic.setAnio(anio);
            vehic.setNumMotor(numMotor);
            vehic.setChasis(chasis);
            vehic.setColor(color);
            vehic.setTipo(TipoVehiculo.CAMIONETA);
            
            vehiculos.add(vehic);
        }
        
        
        return vehiculos;
    }
    
    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos) {
        
        System.out.println("> LISTA DE VEHÍCULOS -----------------------");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("Total de vehículos registrados = " + vehiculos.size());
        System.out.println("----------------------------------------------");
        
    }
    
}
