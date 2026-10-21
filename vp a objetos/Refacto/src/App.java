import java.util.InputMismatchException;
import java.util.Scanner;



public class App {
    // metodo de lectura libre de errores
    public static int lecturaSegura(String frase){
        int entrada1 = 0 ; 
        boolean repetir; 
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print(frase);
            repetir = false;
            try {
                entrada1 = sc.nextInt();

                if ( entrada1 < 0 ){
                    System.out.println("Introduce un valor positivo");
                    repetir = true;
                } 
            } catch (InputMismatchException ex ) {
                System.out.println("Error! No es un entero!");
                repetir =true ;
                //
                sc.next();
                //
            }
        } while (repetir);
        
        return entrada1 ; 
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        int opcion ; 
        String frase = ""; 
        boolean hayTicket = false; 
        Caja caja1 = new Caja();

        System.out.println("Bienvenido");

       
            
        do {
            
            System.out.println("---------------------------------\nElija una opción \n1.Crear nuevo ticket\n2.Imprimir resumen de ventas\n3.Salir");
            opcion = lecturaSegura("Elija una opción: ");

            switch (opcion) {
                case 1:
                    frase = "Introduzca el número de adultos: " ;
                    int numeroAdulto = lecturaSegura(frase);
                    
                    frase = "Introduzca el número de niños: ";
                    int numeroNinio = lecturaSegura(frase) ; 

                    frase = "Introduzca número de audioguías: ";
                    int numeroAudio = lecturaSegura(frase); 

                    if(numeroNinio == 0 && numeroAdulto == 0 ){
                        System.out.println("Introduzca una entrada adulto o niño");
                    } else {
                        Ticket ticket1 = new Ticket(numeroAdulto, numeroNinio, numeroAudio);
                        hayTicket = true ; 
                        ticket1.imprimirTicker();
                        caja1.registrarTicket(ticket1);
                    }
                    
                    break;
                case 2:
                    if ( hayTicket == true ){
                        caja1.mostrarResumenDia();
                        System.out.println("Introduzca un 0 para continuar: ");
                        lecturaSegura(frase);
                    } else {
                        System.out.println("\nTodavía no hubo ninguna compra ");
                    }
                    
                    break;
                case 3:
                    System.out.println("Adios");
                    repetir = false ; 
                default:
                    break;
            }
        } while (repetir);
        
    }
}
