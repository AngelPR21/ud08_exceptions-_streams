package streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static streams.FicheroAlumnosReader.readFile;

public class NombresYApellidosRandom {
    public static void main(String[] args) {
      List<String> nombres = readNombres();
        List<String> apellidos = readApellidos();
        escribeFichero(nombres,apellidos);
    }

    public static List<String> readNombres() { //lo metemos en una lista
        List<String> nombres = new ArrayList<>();
        String nombre;
        try (BufferedReader reader = new BufferedReader(new FileReader("usa_nombres.txt"))) {
            while ((nombre = reader.readLine()) != null) { //mientras que nombre sea distinto de null
                nombre = reader.readLine(); //nombre sera la linea que lea del ARCHIVO
                nombres.add(nombre);//y se añade a la LISTA nombres

            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return nombres;
    }
    public static List<String> readApellidos() {
        List<String> apellidos = new ArrayList<>();
        String apellido;
        try (BufferedReader reader = new BufferedReader(new FileReader("usa_apellidos.txt"))) {
            while ((apellido = reader.readLine()) != null) {

                apellido = reader.readLine();
                apellidos.add(apellido);


            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return apellidos;
    }
    public static void escribeFichero(List<String> nombres, List<String> apellidos){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usa_personas.txt"))) {
            //Random aleatorio = new Random()
            for (int i = 0; i < 400; i++) {
                Collections.shuffle(nombres); //tambien se puede hacer con un nombres.get(aleatorio.nextInt(nombres.size()))
                Collections.shuffle(apellidos);
                String nombreCompleto = nombres.getFirst() + " " + apellidos.getFirst();
                writer.write(nombreCompleto);
                writer.newLine();

            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }




    }

}
