package u2;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que notas quiere papusacar en el trimestre ?");
        double deseo = sc.nextDouble();
        System.out.println("Y que notas has sacado en este examen ? ");
        double nota = sc.nextDouble() ; 
        double notaNecesaria = deseo*2 - nota;
        if ( notaNecesaria > 10 ){
            System.out.println("imposible imposible imposible");
        }
        System.out.printf("La nota que deberas sacar, es ni más ni menos que un %.2f", notaNecesaria);
        // deseo = (nota + notadeseada) / 2        
        //  8  = 7 + x / 2
        // 8*2 - 7 = x
    }
}
