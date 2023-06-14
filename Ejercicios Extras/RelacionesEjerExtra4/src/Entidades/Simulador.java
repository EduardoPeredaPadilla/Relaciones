package Entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import Entidades.Alumno;
import java.util.Collections;

public class Simulador {
    
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Alumno> alumnos = new ArrayList();
    ArrayList<String> nombresCompletos = new ArrayList();
    ArrayList <Voto> votos = new ArrayList();
//    ArrayList<String> nombres = new ArrayList();
//    ArrayList<String> apellidos = new ArrayList();
    Voto vot = new Voto();
    HashSet<String> nombresParaVotos = new HashSet <>();
//    Alumno alumno = new Alumno();
    
     public ArrayList<Alumno> generarAlumnos() {
         
         
         int totalAlumnos = 15;
         
         for (int i = 0; i < totalAlumnos; i++) {
             
             Alumno alum = new Alumno();
             alum.setNombreCompleto(agregarNombre());
             alum.setDNI(random.nextLong());
             alum.setCantVotos(0);
             alum.setCantVotosEntregados(0);
             alumnos.add(alum);
             
         } 
         return alumnos;
     }
    
    
    public String agregarNombre() {
        
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> apellidos = new ArrayList(); 
        
        nombres.add("Alejandro");
        nombres.add("Alcides");
        nombres.add("Juan");
        nombres.add("Jero");
        nombres.add("Victor");
        nombres.add("Sofia");
        nombres.add("Eduardo");
        
        apellidos.add("Torres");
        apellidos.add("García");
        apellidos.add("Trim");
        apellidos.add("Gomez");
        apellidos.add("Alvarez");
        apellidos.add("DelaRosa");
        apellidos.add("Pereda");
        
        String nombreCompleto = generarNombresCompletos(nombres, apellidos);
        nombresCompletos.add(nombreCompleto);

        return nombreCompleto;
    }
    
    
    public String generarNombresCompletos(ArrayList<String> nombres, ArrayList<String> apellidos) {
        
        String nombreCompleto;
        int nom = random.nextInt(7);
        int ape = random.nextInt(7);
        nombreCompleto = nombres.get(nom).toString() + " " + apellidos.get(ape).toString() ;
        return nombreCompleto;
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> alumnos) {
        
        System.out.println("---------- LISTA DE ALUMNOS -------------");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("Total de alumnos = " + alumnos.size());
        System.out.println("----------------------------------------------------");
        System.out.println("");
        
    }
    
    public void verListaDeVotos() {
        
        System.out.println("-------------- LISTA DE VOTOS -----------------");
        for (Voto voto : votos) {
            System.out.println(voto);
        }
        System.out.println("---------------------------------------------------------");
        
    }
    
    public void votacion(ArrayList<Alumno> alumnos) {
        
        for (Alumno alumno : alumnos) {
            
            generarVoto(alumnos, alumno);
            
        }
        verListaDeVotos();
        
    }
    
    public void generarVoto(ArrayList<Alumno> alumnos, Alumno alumno) {
        
        ArrayList<String> votosDados = new ArrayList();
        HashSet<String> nombresParaVotos = new HashSet <>();
        int ind;
        String alu;
        nombresParaVotos.add(alumno.getNombreCompleto());
        Voto voto = new Voto();
        
        while (nombresParaVotos.size() < 4 && nombresParaVotos.size() < alumnos.size()) {
            ind = random.nextInt(alumnos.size());
            alu = alumnos.get(ind).getNombreCompleto();
            nombresParaVotos.add(alu);
        }
//        System.out.println("");
//        System.out.println("Antes de entrar a eliminar!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("");
//        System.out.println("Alumno que da votos = " + alumno.getNombreCompleto());
//        System.out.println(nombresParaVotos);
//        System.out.println("Tamaño del Hash = " + nombresParaVotos.size());
        nombresParaVotos.remove(alumno.getNombreCompleto());
//        System.out.println("Tamaño del Hash = " + nombresParaVotos.size());
//        System.out.println(nombresParaVotos);

        votosDados.addAll(nombresParaVotos);
        alumno.setCantVotosEntregados(votosDados.size());

        for (Alumno alumno1 : alumnos) {
            for (int i = 0; i < votosDados.size(); i++) {
                if (votosDados.get(i).equalsIgnoreCase(alumno1.getNombreCompleto())) {
                    alumno1.setCantVotos(alumno1.getCantVotos() + 1);
                }
            }
        }
        alumno.setVotosDados(votosDados);

        voto.setAlum(alumno);
        voto.setNombresCompletos(votosDados);
        votos.add(voto);

    }
    
    public void obtenerFacilitadores(ArrayList<Alumno> alumnos) {
        
        System.out.println("-------------------- FACILITADORES TOP ------------------------------");
        Comparator<Alumno> comparadorVotos = Comparator.comparingInt(Alumno::getCantVotos).reversed();
        Collections.sort(alumnos, comparadorVotos);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i).toString());
        }
        
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println("------------------------- FACILITADORES SUPLENTES ------------------");
        
        for (int i = 5; i < 10; i++) {
            System.out.println(alumnos.get(i).toString());
        }
        
        System.out.println("------------------------------------------------------------------------");
        
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombresParaVotos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Simulador other = (Simulador) obj;
        if (!Objects.equals(this.nombresParaVotos, other.nombresParaVotos)) {
            return false;
        }
        return true;
    }
    
    
    
}
