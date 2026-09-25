package u2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        System.out.print("CUANTO VALE TU EURO ???????? NO SABES CUANTAS PESETAS ????????? ADELANTE DIMELO Y Y OL HAG O OO!O!!\nEuros: ");
        Scanner sc = new Scanner(System.in);
        double euros = sc.nextInt() ;
        double pesetas ; 
        pesetas = euros * 166 ;
        System.out.printf("%.2f euros son %.2f pesetas \n", euros , pesetas  );
    }
}
