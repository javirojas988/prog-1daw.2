import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int cifra = 0 ; 
        Scanner sc = new Scanner(System.in);
        System.out.print("número: ");
        int numero = sc.nextInt();

        if (numero / 10000 >=1){
            cifra = numero/10000;
            System.out.println("La primera cifra del número introducido es el "+cifra);
        }else if (numero / 1000 >=1){
            cifra = numero/1000;
            System.out.println("La primera cifra del número introducido es el "+cifra);

        }else if (numero / 100 >=1){
            cifra = numero/100;
            System.out.println("La primera cifra del número introducido es el "+cifra);

        }else if (numero / 10 >=1){
            cifra = numero/10;
            System.out.println("La primera cifra del número introducido es el "+cifra);

        }else {
            cifra = numero ; 
            System.out.println("La primera cifra del número introducido es el "+cifra);
        }
    }   
}
