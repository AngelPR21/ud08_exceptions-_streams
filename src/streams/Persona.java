package streams;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Comparable<Persona>, Serializable {
    private String nombre;
    private String apellido;
    private LocalDate fechanac;

    public Persona(String nombre, String apellido, LocalDate fechanac){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    @Override
    public String toString(){
        return nombre + apellido + fechanac;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Persona || o == null)){
            return false;
        }
        Persona persona = (Persona) o;
        return this.nombre.equals(persona.getNombre()) && this.apellido.equals(persona.getApellido());
    }
    @Override
    public int hashCode(){return nombre.hashCode() + apellido.hashCode();}

    @Override
    public int compareTo(Persona o){
        if(apellido.equals(o.getApellido()))
            return nombre.compareTo(o.getNombre());
        return apellido.compareTo(o.getApellido());
    }
}
