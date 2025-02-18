package streams;

import java.io.*;
import java.util.*;

public class FicheroAlumnosReader {
    public static void main(String[] args) throws Exception {
        List<String> estudiantes = readFile();
        Map<String,Double> mediasEstudiantes = rellenarMapa(estudiantes);
        System.out.println("Resultado 1");
        mediasEstudiantes.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        //no entra examen
    }

    public static List<String> readFile() {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("alumnos_notas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return lineas;
    }

    public static Map<String,Double> rellenarMapa(List<String> estudiantes) throws Exception{
        Map<String, Double> mediasEstudiantes = new HashMap<>();
        for (String estudiante : estudiantes){ //recorremos la lista estudiantes
            String nombreCompleto;
            String[] arrayEstudiantes = estudiante.split(" ");  //Metemos en un array cada string por separado
            // Split se utiliza para dividir una cadena
            // en función de los delimitadores de cadena proporcionados como parámetro
            Double average, suma = 0.0;
            if(arrayEstudiantes.length<2) //si el array es menor que dos es que faltan datos
                throw new Exception("error en los datos");
            nombreCompleto = arrayEstudiantes[0] +" "+ arrayEstudiantes[1]; //el nombre completo es el nombre, en la pos0 en el array y el apellido en la pos1
            for (int i = 2; i <arrayEstudiantes.length-1 ; i++) { //vamos hasta la posicion 2 ya que la 0 y 1 son el nombre y apellido
                suma += Double.parseDouble(arrayEstudiantes[i]);
            }
            average = suma/(arrayEstudiantes.length-2);
            mediasEstudiantes.put(nombreCompleto,average);

        }

        return mediasEstudiantes;
    }
}
