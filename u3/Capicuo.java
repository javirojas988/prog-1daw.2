import java.util.Scanner;

public class Capicuo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt(); 
        
        int cifra1 ; 
        int cifra2 ;
        int capicuo ; 

        if (numero >= 100_000){
            System.out.println("Introduce un número de cinco cifras máximo");
        } else 
        if (numero / 10_000 >=1 || numero*-1 /10000 >=1){
            System.out.println("El número tiene 5 cifras " );
            cifra1 = numero%10; // 6
            cifra1 = cifra1*10; // 60 
            cifra2 = numero/1000;// 67
            cifra2 = cifra2%10 ; // 7 
            cifra1 = cifra1 + cifra2 ; // 67

            cifra2 = numero/1000; //67 
            if ( cifra1 == cifra2){
                System.out.println("hola, eres capicuo");
            }

        }else if (numero / 1000 >=1 || numero*-1 /1000 >=1){
            System.out.println("El número tiene 4 cifras " );
            cifra1 = numero%10; // 6
            cifra1 = cifra1*10; // 60 
            cifra2 = numero/100;// 67
            cifra2 = cifra2%10 ; // 7 
            cifra1 = cifra1 + cifra2 ; // 67 

            cifra2 = numero/100; //6
            if ( cifra1 == cifra2){
                System.out.println("hola, eres capicuo");
            }

        }else if (numero / 100 >=1 || numero*-1 /100 >=1){
            System.out.println("El número tiene 3 cifras " );
            cifra1 = numero%10;
            cifra2 = numero/100;
            if ( cifra1 == cifra2){
                System.out.println("hola, eres capicuo");
            }

        }else if (numero / 10 >=1 || numero*-1 /10 >=1){
            System.out.println("El número tiene 2 cifras ");
            cifra1 = numero%10;
            cifra2 = numero/10;
            if ( cifra1 == cifra2){
                System.out.println("hola, eres capicuo");
            }

        }else {
            System.out.println("El número tiene 1 cifras " );
            
        }
    }
}
