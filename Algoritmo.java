import java.util.Scanner;

public class Algoritmo {

    public static void main(String[] args) {
        String nombre = "cristian";
        int numero ;
        
        
        System.out.println("\033[41moye mi papu, te he de decir que me introduzcas un numero y te dire quien es la perrita mas obediente ese numero de veces, >3\033[0m");
        Scanner sc = new  Scanner(System.in);
        numero = sc.nextInt() ; 

        System.out.print("\033[32mPErrita a continuacion\n\033[0m");

        for ( int i= 0 ; i < numero ; i++ ){
            System.out.printf(nombre+" ");
        }
        
    }
}