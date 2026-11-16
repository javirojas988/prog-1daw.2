import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static int lecturaSegura(String frase){
        boolean repetir = false ; 
        int respuesta = 0 ;
        do {
            repetir = false;
            try {
                
                System.out.print(frase);
                respuesta = sc.nextInt();

            } catch (InputMismatchException e) {
                repetir = true;
                sc.next();
                System.out.println("Introduce un número");
            }
            
        } while (repetir);
        
        return respuesta ; 
    }
    public static void main(String[] args) throws Exception {

        // int [][] felipeVi = new int[1][2];
        // [f][c] 2 , 5
        // x x x x x 
        // x x x x x 
        
        Tabla ta1 = new Tabla();
        ta1.rellenarTabla();
        int opcion; 
        boolean repetir = true ;

        while (repetir ) {
            System.out.println("==================================================================================");
            System.out.println("Bienvenido a AEMET Turing, tenemos registrado la temperatura diaria de todo el año");
            System.out.println("1.Mostrar tabla\n2.Temperatura media mes\n3.Dia caluroso y helado del año\n4.Dias de +30 grado\n5.Compara estaciones\n6.salir");
            opcion =  lecturaSegura("Elija una opción:");

            switch (opcion) {
                
                case 1:
                    ta1.imprimirTabla();
                    break;
                case 2:
                    opcion = lecturaSegura("Elije un mes: ");
                    if ( opcion < 13 && opcion > 0 ){
                        ta1.mediaMes(opcion);
                    } else {
                        System.out.println("en que planetas vives mi g ");
                    }
                    
                    break;
                case 3:
                    ta1.maxYmin();               
                    break;
                case 4:
                    ta1.calorExtremo();
                    break;
                case 5:
                    //media 6, 7, 8 vs 12, 1 ,2 
                    break;
                case 6:
                    repetir = false;
                    break;
                default:
                    System.out.println("Elija una opción válida");
                    break;
            }
        }
    }
}
