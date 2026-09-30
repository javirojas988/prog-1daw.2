import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        double a ; 
        double b ; 
        double x ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado ax+b = 0");
        System.out.print("Introduce valor de A: ");
        a = sc.nextDouble();
        System.out.print("Ahora valor de B: ");
        b = sc.nextDouble();

        x = (-b/a);
        System.out.printf("X es igual a %.2f", x );
        
    }
}
