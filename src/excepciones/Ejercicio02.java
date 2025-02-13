package excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Valor de "+i+": ");
            try{
                vector[i] = scanner.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("Tipo de dato no valido, introduzca un numero entero o con decimal");
                scanner.next();
                i--;
            }


        }
        System.out.println(Arrays.toString(vector));


    }
}
