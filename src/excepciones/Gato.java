package excepciones;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Gato implements Serializable {


    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws ExcepcionGatuna{
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
        if(edad<0){
            throw new ExcepcionGatuna("Edad negativa");
        }
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionGatuna{
        this.nombre = nombre;
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionGatuna {
        if(nombre.length()<3){
            throw new ExcepcionGatuna("Nombre incorrecto");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
//    @Override
//    public static List<Gato> load(String fichero) throws IOException, ClassNotFoundException{
//        List<Gato> listaGato = new ArrayList<>();
//        ObjectInputStream input = new ObjectInputStream(new FileInputStream(fichero));
//        return(List<Gato>) input.readObject();
//    }

//    @Override
//    public static void save(String fichero,List<Gato> gatos )throws IOException{
//        ObjectInputStream output = new ObjectOutputStream(new FileOutputStream(fichero));
//        output.writeObject(gatos);
//
//    }
}
