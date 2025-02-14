package excepciones;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) {
        List<Gato> camada = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try{
                for(Gato gato: camada)
                    System.out.println(gato);
                System.out.println("Nombre gato" +i+": ");
                String nombre = scanner.next();
                System.out.println("Edad gato " +i+ ": ");
                int edad = scanner.nextInt();
                camada.add(new Gato(nombre, edad));

            }catch(ExcepcionGatuna e){ //tambien captura las gatunas con Exception puesto que extiende exception
                System.out.println(e.getMessage());
                i--;

            }catch(InputMismatchException e){
                e.printStackTrace();
                i--;
                scanner.nextLine();
            }

        }

    }

}
