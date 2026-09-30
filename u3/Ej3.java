import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int dia ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero de la semana: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println( "Lunes" ); 
                break;
            case 2:
                System.out.println( "Martes" ); 
                break;
            case 3:
                System.out.println( "Miercoles" ); 
                break;
            case 4:
                System.out.println( "Jueves" ); 
                break;
            case 5:
                System.out.println( "Viernes" ); 
                break;
            default:
                System.out.println("introduce un número válido");
                
                break;
        }
    }
}
