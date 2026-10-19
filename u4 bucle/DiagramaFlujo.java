import java.util.Scanner;

public class DiagramaFlujo {
    /*
    Bajo peso: Menos de 18,5

    Peso saludable: Entre 18,5 y 24,9

    Sobrepeso: Entre 25,0 y 29,9

    Obesidad: 30,0 o más 
    
    IMC = peso (kg) / (altura (m)²).
    */

    public static void main(String[] args) {
        double peso =0; 
        double altura =0;
        double IMC ;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Calculo tu IMC");
            
            while (peso <= 0 || altura >= 4) {
                System.out.print("Mide tu peso: Utiliza una báscula para obtener tu peso en kilogramos (kg): ");
                peso = sc.nextDouble();
                System.out.print("Mide tu altura: Mide tu altura con una cinta métrica y conviértela a metros (m): ");
                altura = sc.nextDouble();

                if (peso <= 0 || altura >= 4 || altura <= 0 ) {
                    System.out.println("Introduce valores realistas porfavor.");
                }
            }
            

            IMC = peso  / (Math.pow(altura, 2));
            System.out.printf("IMC de %.2f \n" , IMC);

            if ( IMC <= 18.5){
                System.out.println("Bajo peso, visita a un especialista");
            }
            if ( IMC > 18.5 && IMC < 25){
                System.out.println("Peso saludable, enhorabuena");
            }
            if ( IMC >= 25 && IMC <30 ){
                System.out.println("Sobre peso, visita a un especialista");
            }
            if ( IMC >= 30 ){
                System.out.println("Obesidad, visita a un especialista");
            }
                                                    

        } catch (Exception e) {
            System.out.println("Debe introducir números enteros, su altura y peso.");
        }
        



    }
}
