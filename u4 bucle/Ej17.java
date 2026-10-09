import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("AAAAA: ");
        int numero = sc.nextInt()  ;
        int total = 0 ; 
        
        if (numero >= 0 ){

            for ( int i = numero ; i < (numero+100)  ; i++ ){
                total += i ;
            }
            System.out.println(total);
        } else{
            System.out.println("introduce un número positivo");
        }

    }
}
