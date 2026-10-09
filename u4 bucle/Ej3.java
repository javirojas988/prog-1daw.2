import java.util.Scanner;
 
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("HAY UNA CAJA FUERTE , TIENES 4 INTENTOS y 4 digitos");
        int contrasenia = 6776 ; 
        int respuesta = 0 ;
        int index = 0  ;  
        Scanner sc = new Scanner(System.in);

        // for ( int i = 0 ; i != 4 ; i++){
        //     System.out.println("1er intento");
            
        //     if ( respuesta == contrasenia ){
        //         i = 4 ;
        //         System.out.println("El papu ha hacertado");
        //     }
        // }

        while (index != 4 && contrasenia != respuesta ) {
            
            System.out.print((index+1)+" intento: ");
            respuesta = sc.nextInt();
            if (contrasenia != respuesta) {
                System.out.println("q tonto");
            }else{
                System.out.println("q pro");
            }
            index++ ;
        }

    }
}
