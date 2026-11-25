import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static int lecturaSegura(String frase ){
        boolean repetir = false  ;
        int respuesta = 0  ;

        do {
            repetir = false ; 
            try {
                System.out.print(frase);
                respuesta = sc.nextInt();

            } catch (InputMismatchException e) {
                sc.next();
                repetir = true;
                System.out.println("Introduce un número entero");
            }    
        } while (repetir);
        return  respuesta;
    }

    public static int CONTADOR_DE_DIAS = 1 ;

    public static void main(String[] args) throws Exception {
        boolean repetir = true ; 
        int opcion ; 
        
        Prestamo gPrestamo = new Prestamo();
        Reserva gReserva = new Reserva();
        
        GestionUsuarios gUsuarios = new GestionUsuarios();
        GestionaObras g1 = new GestionaObras();

        Socio socio = new Socio("javier", "vergal");
        Libro libro = new Libro("Lioko", "las tempestalidad", "McTominay", "Anaya canaya");
        g1.godModeAniadir(libro, 1);
        
        System.out.println("Hola, simulador de teca con dias. Tenemos 100 obras jojojo");
        do {
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println("DIA "+CONTADOR_DE_DIAS);
            System.out.println("1. Dar de alta obra \n2. Obras prestada.");
            System.out.println("3. Dar de alta socios\n4. Baja socio\n5. Localiza socio ");
            System.out.println("6. Realizar prestamo");
            System.out.println("7. Pasar dia ");
            System.out.println("8. Salir");
            
            opcion = lecturaSegura("Elije una opción: ");
            switch (opcion) {
                case 1:
                    
                    lecturaSegura("Tipo de obra:\n1.libro, 2.disco, 3.vinilo: ");
                    sc.nextLine();
                    g1.anadirObra(opcion);
                    break;
                case 2:
                    g1.enseniarPrestadas();
                    break;
                case 3:
                    sc.nextLine();
                    gUsuarios.aniadirSocio();
                    break;
                case 4:
                    gUsuarios.printearSocio();
                    opcion = lecturaSegura("Elije un socio pa eliminar, su número: ");
                    if ( opcion <= GestionUsuarios.MAXIMO_SOCIOS && opcion>= 1){
                        gUsuarios.eliminarSocio(opcion);
                    } else {
                        System.out.println("Elije un número de socio posible jjojoojoj que si no nuestra bdd de arrais peta ");
                    }
                    
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("introduce el apedillo: ");
                    String apedillo = sc.nextLine();
                    gUsuarios.buscar(apedillo);
                    break;
                case 6:

                    //Mostramo la obra dispo 

                    //Decimos usuarios
                    gUsuarios.printearSocio();
                    opcion = lecturaSegura("Elija un socio: ");
                    int auxiliar = opcion; 
                    if (gUsuarios.getSocio(opcion) != null ){

                        if ( gPrestamo.puedeRecibirPrestamo( gUsuarios.getSocio(opcion) ) ){
                            sc.nextLine();
                            System.out.println("libro, dvd, vinilo");
                            opcion = lecturaSegura("Elije tipo de obra 1, 2, 3: ");
                            g1.enseniarPorTipo(opcion);
                            
                            opcion = lecturaSegura("elija uno por su código: ");
                            Obra obra = g1.devolveObra(auxiliar);
                            gPrestamo.realizarPrestamo(gUsuarios.getSocio(auxiliar),obra );
                            
                        } 
                    }
                    
                    
                    break;
                case 7:
                    System.out.println("dando la vuelta al mundo...  | /  | /");
                    CONTADOR_DE_DIAS++;
                    gPrestamo.revisarFecha();
                    gUsuarios.reducirPena();
                    gReserva.chequearReservas(gPrestamo);

                    break;
                case 8 :
                    repetir = false ; 
                    break;
                default:
                    System.out.println("elije una opcion disponible mi g ");
                    break;
            }    
        } while (repetir);
    }
}
