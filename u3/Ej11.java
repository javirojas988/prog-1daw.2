import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = sc.nextInt();

        if (numero >= 100_000){
            System.out.println("Introduce un número de cinco cifras máximo");
        } else 
        if (numero / 10_000 >=1 || numero*-1 /10000 >=1){
            System.out.println("El número tiene 5 cifras " );
        }else if (numero / 1000 >=1 || numero*-1 /1000 >=1){
            System.out.println("El número tiene 4 cifras " );

        }else if (numero / 100 >=1 || numero*-1 /100 >=1){
            System.out.println("El número tiene 3 cifras " );

        }else if (numero / 10 >=1 || numero*-1 /10 >=1){
            System.out.println("El número tiene 2 cifras ");

        }else {
            System.out.println("El número tiene 1 cifras " );
        }
    }
}
