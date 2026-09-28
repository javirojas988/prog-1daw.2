import java.util.Scanner;

public class Swicth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = sc.nextInt() ;
        while (nota>10 || nota<0) {
            System.out.print("Dame una nota valida: ");
            nota = sc.nextInt() ;        
        }
        switch (nota) {
            case 5:
                System.out.println("parguelon");
                break;
            case 6,7,8,9,10: 
                System.out.println("papero");
                break;

            default: 
            //else
                System.out.println("noob");
                break;
        }
    }
}
