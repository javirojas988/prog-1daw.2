import java.util.Scanner;

public class Ej7 {
    
    public static void main(String[] args) {
         
        int base ; 
        int potencia ; 
        int resultado=0 ; 
        Scanner sc = new Scanner(System.in);


        System.out.println("soy calculapapu , dame un numero y una potencia y te lo hago");
        System.out.print("base: ");
        base = sc.nextInt();
        System.out.print("potencia: ");
        potencia = sc.nextInt();
        resultado= base ; 
        for ( int i = 1  ; i < potencia ; i++){
            
            resultado *= base ;
        }
        System.out.println(base + "^"+ potencia + " = "+ resultado);
    }
}
