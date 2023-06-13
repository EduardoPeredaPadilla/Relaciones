package Services;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Cliente> clientes = new ArrayList();
    
    public ArrayList<Cliente> agregarClientePorUsuario() {
        
        Cliente client = new Cliente();
        
        System.out.println("Ingrese el nombre del cliente");
        client.setNombre(scan.next());
        System.out.println("Ingrese el apellido del cliente");
        client.setApellido(scan.next());
        System.out.println("Ingrese el documento");
        client.setDocumento(scan.next());
        System.out.println("Ingrese el mail del cliente");
        client.setMail(scan.next());
        System.out.println("Ingrese el domicilio del cliente");
        client.setDomicilio(scan.next());
        System.out.println("Ingrese el telefono del cliente");
        client.setTelefono(scan.nextInt());
        
        clientes.add(client);
        
        return clientes;
    }
    
    public ArrayList<Cliente> agregarCliente() {
        
        String nombre = "José";
        String apellido = "Hernández";
        String documento = "INE";
        String mail = "jose.hernandez@gmail.com";
        String domicilio = "cdmx, México";
        int telefono = 5556856;
        
        Cliente client = new Cliente();
        
        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setDocumento(documento);
        client.setMail(mail);
        client.setDomicilio(domicilio);
        client.setTelefono(telefono);
        clientes.add(client);
        
        return clientes;
    }
    
    public ArrayList<Cliente> agregarVariosClientes(int cantClientes) {
        
        for (int i = 0; i < cantClientes; i++) {
            
            Cliente client = new Cliente();
            
            client.setNombre("Cliente " + (i + 1));
            client.setApellido("Apellido " + (i + 1));
            client.setDocumento("INE");
            client.setMail("cliente" +  + (i + 1) + "@gmail.com");
            client.setDomicilio("cdmx, México");
            client.setTelefono(5578997);
            clientes.add(client);
        }
        
        return clientes;
    }
    
    public void mostrarCliente(ArrayList<Cliente> clientes) {
        
        System.out.println("> LISTA DE CLIENTES ------------");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
        System.out.println("Total de clientes registrados = " + clientes.size());
        System.out.println("-------------------------------------------");
        
    }
    
}
