package relacionesejerextra4;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.ArrayList;
import java.util.Scanner;

public class RelacionesEjerExtra4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
//        ArrayList<String> nombres = new ArrayList();
//        ArrayList<String> apellidos = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();
        Simulador sim = new Simulador();
        alumnos.addAll(sim.generarAlumnos());
        sim.mostrarAlumnos(alumnos);
        sim.votacion(alumnos);
        sim.mostrarAlumnos(alumnos);
        sim.obtenerFacilitadores(alumnos);

    }

}
