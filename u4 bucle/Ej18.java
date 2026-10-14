public class Ej18 {
    public static void main(String[] args) {
        //piramide
        int altura = 5 ;
        int d = 1 ; 
        for ( int i = 0 ; i < altura ; i ++){
            for ( int j = 0 ; j < altura-i; j++){
                System.out.print(" ");
            }
            for ( int y = 0 ; y < d ; y++ ){
            System.out.print("*");
            }
            d += 2;
            System.out.println();
        }

        
                            
    }
}
