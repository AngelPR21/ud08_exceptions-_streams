package streams;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploStreamObjetos {
    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Angel", "Pascual", LocalDate.of( 2006,2, 21)));
        personas.add(new Persona("Eric", "Mierda", LocalDate.of( 2006,6, 2)));
        personas.add(new Persona("Pau", "Mongol", LocalDate.of( 1218, 2,1)));
        personas.add(new Persona("Tutankamon", "Garcia", LocalDate.of( 822, 2,19)));

        guardar("personas.dat",personas);
        leer("personas.dat");

    }
    private static void guardar(String fichero, Set<Persona> personas){
        try(ObjectOutputStream objOut
                    = new ObjectOutputStream(new FileOutputStream(fichero))){
            for(Persona persona:personas){
                objOut.writeObject(persona);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private static List<Persona> leer(String fichero){
        List<Persona> lista = new ArrayList<>();
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fichero))) {
            Persona persona;
            while ((persona = (Persona) input.readObject()) != null)
                lista.add(persona);

        }catch(EOFException e){
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return lista;
    }
}
