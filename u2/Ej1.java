package u2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce número: ");
        int x = sc.nextInt();
        System.out.print("introduce segundo número: ");
        int y = sc.nextInt();
        System.out.println("a = "+x);
        System.out.println("b = "+y);
        System.out.println("suma = " + (x+y));
        System.out.println("resta = "+ (x-y));
        double division = (double)x/ (double) y ; 
        System.out.println("division = "+ division);
        System.out.println("multiplicación = "+ x*y);

    }
}