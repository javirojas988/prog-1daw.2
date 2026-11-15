import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static int lecturaSegura(String frase){
        boolean repetir;
        int respuesta = 0 ; 

        do {
            repetir = false; 
            try {

                System.out.print(frase);
                respuesta = sc.nextInt();
                if(respuesta<0){
                    repetir=true;
                    System.out.println("repite bicho");
                }

            } catch (InputMismatchException e) {
                repetir = true;
                System.out.println("repite bixho");
                sc.next();
            }
        } while (repetir);


        return respuesta;
    }
    public static void main(String[] args) throws Exception {


    }
}
