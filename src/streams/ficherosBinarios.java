package streams;

import java.io.*;

public class ficherosBinarios {
    public static void main(String[] args) {
        //copiarCeroEficiente("hiopo.png","copia.png");
        copiarPocoEficiente("hiopo.png", "copia.png");

    }

    private static void copiarCeroEficiente(String original, String copia) {
        FileInputStream entrada = null;
        FileOutputStream salida = null;
        try {
            entrada = new FileInputStream(original);
            salida = new FileOutputStream(copia);
            int aux;
            while ((aux = entrada.read()) != -1) {
                salida.write(aux);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                entrada.close();
                salida.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }
    }

    private static void copiarPocoEficiente(String original, String copia) {
        try (FileInputStream entrada = new FileInputStream(original);
             FileOutputStream salida = new FileOutputStream(copia)) {
            int aux;
            while ((aux = entrada.read()) != -1) {
                salida.write(aux);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void copiarEficiente(String original, String copia) {
        FileOutputStream salida = null;
        FileInputStream entrada = null;
        try (BufferedInputStream bufferEntrada = new BufferedInputStream(new FileInputStream(original));
            BufferedOutputStream bufferSalida = new BufferedOutputStream(new FileOutputStream(copia))
            ){
            int aux;
            while  ((aux = bufferEntrada.read()) != -1){
                bufferSalida.write(aux);

            }
    }catch (IOException e){
        e.printStackTrace();
    }


    }


}