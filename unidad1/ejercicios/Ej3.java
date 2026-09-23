package unidad1.ejercicios;

public class Ej3 {
    public static void main(String[] args) {
        
        String nombre = "elenanito del bosque";
        String direccion = "calle marco ardido Num67 - Guarrroman(Ceuta)-España";
        int telefono = 676767676;

        System.out.println("\033[31m"+ nombre);
        System.out.println("\033[32m"+ direccion);
        System.out.println("\033[33m"+ telefono);
        System.out.println("\033[0m");
    }
}
