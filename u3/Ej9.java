import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        double b;
        double a; 
        double c;
        double x1;
        double x2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame valor de a: ");
        a = sc.nextDouble();
        System.out.print("Dame valor de b: ");
        b = sc.nextDouble();
        System.out.print("Dame valor de c: ");
        c = sc.nextDouble();

        if ((Math.pow(b, 2)-4*a*c) > 0 && a!=0 ){
            x1 = (  (-b - Math.sqrt(Math.pow(b, 2)  -4 * a * c)) / (2*a) ) ;
            x2 = (  (-b + Math.sqrt(Math.pow(b, 2)  -4 * a * c)) / (2*a) ) ;
            System.out.println(x1);
            System.out.println(x2);

        } else if ((Math.pow(b, 2)-4*a*c) > 0 && a!=0 ){
            x1 = (  (-b - Math.sqrt(Math.pow(b, 2)  -4 * a * c)) / (2*a) ) ;
            x2 = (  (-b + Math.sqrt(Math.pow(b, 2)  -4 * a * c)) / (2*a) ) ;
            System.out.println("x1=x2="+x1);

        } else {
            System.out.println("no tiene solución");
        }
        

        

        
    }
}
