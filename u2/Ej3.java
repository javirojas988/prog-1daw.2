package u2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.print("Di tu name: ");
        String nombre = sc.nextLine();
        System.out.print("Donde tu vives: ");
        String direccion = sc.nextLine();
        System.out.print("dame tu telefono: ");
        int telefono = sc.nextInt();

        System.out.println("\033[31m"+ nombre);
        System.out.println("\033[32m"+ direccion);
        System.out.println("\033[33m"+ telefono);
        System.out.println("\033[0m");
    
    }
}
