package Services;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
    
    public ArrayList<Alumno> AgregarAlumno() {
        
        Alumno alum = new Alumno();
        
        
        
        alumnos.add(alum);
        return alumnos;
    }
    
}
