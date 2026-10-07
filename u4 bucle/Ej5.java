import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        
        // di cuantos digitos tiene
        // negativos incluido ( -1 )
        Scanner sc = new Scanner(System.in);
        System.out.print("dame un numero: ");
        int numero = sc.nextInt();
        boolean STOP = false ; 
        int digitos= 1 ; 
        int diezDi = 10 ; 
        int auxiliar;

        if ( numero < 0 ){
            numero *= -1 ; 
        }
        do{
            auxiliar = numero ; 
            auxiliar /= diezDi ;  // divide e

            if (auxiliar< 1){
                System.out.println("tiene "+ digitos + " digito ");
                STOP = true ; 
            }

            diezDi *= 10 ; 
            digitos++ ;

        } while ( STOP == false );
    }
}
