package excepciones;



public class example06 {
    public static void main(String[] args) {
        try{
            checkNumero(5);
            checkNumero(10);


        }catch(ExcepcionMayor10 e) {
            e.printStackTrace();//te da la excepcion escrita
        }



    }

    public static void checkNumero(int num) throws ExcepcionMayor10{
        if(num>=10)
            throw new ExcepcionMayor10("Numero mayor de 10");


        System.out.println("Numero OK");

    }
}
