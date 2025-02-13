package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Numerador: ");
            int numerador = scanner.nextInt();
            System.out.println("Denominador");
            int denominador = scanner.nextInt();
            System.out.println("División: " +numerador/denominador);
        } catch(ArithmeticException e) {
            System.out.println("Error dividir por cero");

        } catch(InputMismatchException i) {
            //System.out.println(i.getMessage());
            System.out.println("Error por introducir una letra");
        }finally{
             System.out.println("Fin del proceso");

        }


    }
}
