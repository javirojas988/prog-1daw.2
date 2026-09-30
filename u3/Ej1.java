import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Escribe un programa que pida por teclado el número del día de la semana y que diga qué asignatura
        // toca a primera hora ese día.
        String lunes = "Ipe1";
        String mart = "E.D";
        String mierc = "E.D";
        String jueve = "BDd";
        String vierne = "S.I";
        int dia ; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un día de la semana: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println(lunes);
                break;
            case 2:
                System.out.println(mart);
                break;
            case 3:
                System.out.println(mierc);
                break;
            case 4:
                System.out.println(jueve);
                break;
            case 5:
                System.out.println(vierne);
                break;
            default:
                System.out.println("Introduce un número válido");
                break;
        }
    
    }
}
