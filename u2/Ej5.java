package u2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.print("DAME TU PESETA ; TE DIGO TU ERO !!\nPESETa: ");
        Scanner sc = new Scanner(System.in);
        double pesetas = sc.nextInt() ;
        double euros ; 
        euros = pesetas / 166 ;
        System.out.printf("%.2f euros son %.2f pesetas \n", euros , pesetas  );
    }
}
