import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        
        System.out.print("media de numeros, para indicar que paras introduce un numero negativo: ");
        boolean stop = false; 
        int numero ;    
        int sumaTotal = 0 ; 
        int media ; 
        int divide = 0 ;
        Scanner sc = new Scanner(System.in);
        while ( stop == false ) {
            numero = sc.nextInt();

            if ( numero < 0 ){
                stop = true; 
            }else {
                
                sumaTotal += numero ; 
                divide++; 
            }
            
        }
        media = sumaTotal/divide;
        System.out.println("media de : "+media);
    }
}
