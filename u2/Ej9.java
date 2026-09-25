package u2;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("dime tus kb y te los paso a mb:");
        double kb = sc.nextDouble();

        System.out.printf("eso son %.2f", kb/1000);
    }
}
