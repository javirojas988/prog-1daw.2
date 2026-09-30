import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int hora ; 
        System.out.println("me puede decir que hora es ? (0 - 23) ");
        System.out.print("Son las: ");
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();
        if (hora>= 6 && hora <= 12){
            System.out.println("bueno dia");
        }
        if (hora>= 13 && hora <= 20){
            System.out.println("bueno tardes");
        }
        if ( hora >23){
            System.out.println("Error, introduce un número en ese intervalo");
        }else if (hora> 21 || hora <= 5){
            System.out.println("buenas noches");
        } 
        

    }
}
