import java.util.Scanner;

public class Ej0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso ; 
        Double altura ; 
        Double imc ; 

        System.out.print("Dime tu peso (kg): ");
        peso = sc.nextDouble();
        System.out.print("Dime tu altura en (m); ");
        altura = sc.nextDouble();
        imc = peso /(Math.pow(altura, 2));
        System.out.printf("tu imc es %.2f\n Eso indica :", imc ) ;
        if (imc <18.5){
            System.out.print("Bajo peso");
        } else if (imc>=18.5 && imc<=24.9) {    
            System.out.print("que estas saludable");
        } else if (imc >=25 && imc <=29.9){
            System.out.print("sobrepeso");
        } else if (imc >=30 ){
            System.out.print("papu, estas chungo, ve a un experto");
        }
    }
}
