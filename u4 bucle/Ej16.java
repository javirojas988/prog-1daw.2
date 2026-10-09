import java.util.Scanner;

public class Ej16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero ; 
        int divisor ; 
        boolean primo = true; 

        System.out.print("número y digo si es primo mio: ");
        numero = sc.nextInt();
        divisor = numero/2 ; 

        // bucle dividr hasta su mita 
        // cuando numero%divi = 0 acab
        if ( numero > 0){
            for(int i = 2 ; i < divisor ; i++ ) {
            
            if (  numero%i == 0 ){
                    primo = false; // no lo es
                } 
                
            }

            if ( primo == false) {
                System.out.println("no es");
            } else { 
                System.out.println("si es");
            }

        } else {
            System.out.println("Introduce un número entero ");
        }
        
        
    }
}
