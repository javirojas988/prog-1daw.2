import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        final double g = 9.8; 
        double h ;
        double t ;
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        h = sc.nextDouble();
        if ( h < 0 ){
            System.out.println("introduce un valor válido");
        }
        t = Math.sqrt((2* h) / g);
        System.out.printf("El objeto tarda %.2f en caer", t);

    }
}
