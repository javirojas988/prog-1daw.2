package unidad1;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.printf("\n|   lunes  |  martes  | miercoles|  jueves  |  viernes |\n");
        System.out.printf("========================================================\n");

        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "nada" , "nada","bdds","nada");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "prog" , "nada" , "prog","bdds","nada");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "prog" , "ipe2" , "prog","nada","nada");
        System.out.printf("|------------------------------------------------------|\n");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "bdds" , "prog","nada","prog");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "bdds" , "bdds","ipe2","prog");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "nada" , "bdds","ipe2","prog");
        System.out.printf("========================================================\n");
        
        //
        String prog = "\033[31mProg\033[0m";
        String bdd = "\033[32mbdds\033[0m";
        String ipe2 = "\033[33mipe2\033[0m";
        
        System.out.printf("\n|   lunes  |  martes  | miercoles|  jueves  |  viernes |\n");
        System.out.printf("========================================================\n");

        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "nada" , "nada",bdd,"nada");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", prog , "nada" , prog,bdd,"nada");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", prog , ipe2 , prog,"nada","nada");
        System.out.printf("|------------------------------------------------------|\n");
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , bdd , prog,"nada",prog);
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , bdd , bdd,ipe2,prog);
        System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", "nada" , "nada" , bdd,ipe2,prog);
        System.out.printf("========================================================\n");

        //
        int i = 1 ;
        int a = 0 ;
        System.out.printf("\n|   lunes  |  martes  | miercoles|  jueves  |  viernes |\n");
        System.out.printf("========================================================\n");
        String asignaturas[] = {};
        while ( i <= 7) {
            if ( i == 4){
                System.out.printf("|------------------------------------------------------|\n");
            } else {    
                System.out.printf("|   %s   |   %s   |   %s   |   %s   |   %s   |\n", asignaturas[a++], asignaturas[a++], asignaturas[a++], asignaturas[a++], asignaturas[a++] );
            }
            i++;
        }
    }

    
}
