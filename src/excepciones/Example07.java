package excepciones;

public class Example07 {
    public static void main(String[] args) {
        int[] vector = {0,1,2};
        try{
            for(int i = 0; i <= vector.length; i++){
                System.out.println(vector[i]);
            }
        }catch(Exception e){
//            System.out.println("Ha salido error");
        }
    }
}
