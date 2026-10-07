import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        int numero ; 
        Scanner sc = new Scanner(System.in);
        System.out.print("dame un numero: ");
        numero = sc.nextInt();
        for(int i = 0 ; i <= 10 ; i++){
            int total = numero * i ;
            System.out.println(numero + "x" + i + ": "+ total);
        }
    }
}