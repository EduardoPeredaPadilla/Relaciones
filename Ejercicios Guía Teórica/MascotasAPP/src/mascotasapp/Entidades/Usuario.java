package mascotasapp.Entidades;

import java.util.Date;
import mascotasapp.Enumeraciones.SexoHumano;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    private Mascota mascota;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, Integer dni, Date nacimiento, String pais, SexoHumano sexo, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ", mascota=" + mascota + '}';
    }
    
    
    
}
