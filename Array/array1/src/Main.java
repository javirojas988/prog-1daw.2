import java.util.InputMismatchException;
import java.util.Scanner;

//==========================
//No va por el esaner
//==========================

public class Main {

    // esto es solo para alijerar el saber si esta llena o vacia
    public static int contactosAniadidos = 0 ;
    public static Scanner sc = new Scanner(System.in);

    public static int lecturaSegura(String frase){
        int respuesta = 0 ; 
        boolean repetir = false ;

        do {
            repetir = false ; 
            try {
                System.out.print(frase);
                respuesta = sc.nextInt();
                if ( respuesta < 0 ){
                    System.out.println("Introduce un número positivo");
                    repetir = true ; 
                }


            } catch (InputMismatchException e) {
                repetir = true;
                sc.next();
                System.out.println("Introduce un número entero");
            }
            
        } while (repetir);
        
        return respuesta; 
    }
    

    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        agenda1.limpiarAgenda();
        boolean repetir = true ; 
        

        while (repetir) {
            System.out.println("-----------------\n1. Añadir\n2. Imprimir\n3. Eliminar\n4. Limpiar\n5. Buscar\n6. Salir");
            switch (lecturaSegura("Elija una opción: ")) {
                case 1:
                    System.out.println("----------");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido1 = sc.nextLine();
                    System.out.print("Segundo Apellido: ");
                    String apellido2 = sc.nextLine();
                    int telefono = lecturaSegura("Introduce el telefono: ");
                    System.out.print("Introduce tu gmail: ");
                    String email = sc.nextLine();
                    Contacto contacto1 = new Contacto(nombre, apellido1, apellido2, telefono, email);
                    agenda1.anadirContacto(contacto1);
                    break;
                case 2:
                    agenda1.imprimirAgenda();
                    break;
                case 3:
                    agenda1.eliminarContacto(lecturaSegura("Introduzca Id contacto para eliminar: "));
                    break;
                case 4:
                    agenda1.limpiarAgenda();
                    System.out.println("Limpiada con exito");
                    break;
                case 5:
                    // metodo buscar
                    break;
                case 6:
                    repetir = false ; 
                    System.out.println("Chao chao chao");
                    break;
                default:
                    break;
            }
        }

    }
}
