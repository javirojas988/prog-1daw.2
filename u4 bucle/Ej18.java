public class Ej18 {
    public static void main(String[] args) {
        //piramide
        int altura = 5 ;
        int numPint = 1 ; 
        String simbolo = "W";

        for ( int i = 0 ; i < altura ; i ++){
            for ( int j = 0 ; j < altura-i; j++){
                System.out.print(" ");
            }
            for ( int y = 0 ; y < numPint ; y++ ){
                System.out.print(simbolo);
            }
            numPint += 2;
            System.out.println();
        }                    
    }
}
