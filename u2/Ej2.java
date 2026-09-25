package u2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre:");
        String nombre = sc.nextLine() ;
        System.out.print("Primer apellido:");
        String ape1 = sc.nextLine(); 
        System.out.print("Segundo apellido:");
        String ape2 = sc.nextLine(); 

        System.out.println("nombre:"+ nombre);        
        System.out.println("ape1:"+ ape1);        
        System.out.println("ape2 :"+ ape2);        
        System.out.println("" + nombre+" " + ape1+ " " + ape2 );
    }
}
