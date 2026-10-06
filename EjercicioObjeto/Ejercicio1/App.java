import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculo biciQuechua = new Bicicleta();
        Vehiculo coche1 = new Coche();


        System.out.println("1. anda bici\n2.Caballito\n3. Anda coche\n4. Quema rueda\55. Kilometros bici\n6.Kilometros coche\n7. kilometros total\nElige");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("cuantos kil quiere recorre: ");
                opcion = sc.nextInt();
                biciQuechua.andar(opcion);                
                break;
            case 2:
                biciQuechua.caballito();
                break;
            case 3:
                System.out.print("cuantos kil quiere recorrer: ");
                opcion = sc.nextInt();
                coche1.andar(opcion);
                break;
            case 4:
                coche1.quemarRueda();
                break;
            case 5:
                System.out.println(biciQuechua.kilometrosRecorridos);
                break;
            case 6:
                System.out.println(coche1.kilometrosRecorridos);
                break;
            case 7 : 
                System.out.println(Vehiculo.kilometrosTotales);
            default:
                break;
        }

        
        // System.out.println(Vehiculo.vehiculosCreados);
        // System.out.println(Vehiculo.kilometrosTotales);
    }
}























































