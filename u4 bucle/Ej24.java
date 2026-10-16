public class Ej24 {
    public static void main(String[] args) {
        //piramide
        int altura = 5 ;
        int numPint = 1 ; 
        int numero = 0 ;

        for ( int i = 0 ; i < altura ; i ++){
            for ( int j = 0 ; j < altura-i; j++){
                System.out.print(" ");
            }
            for ( int y = 0 ; y < numPint ; y++ ){
                numero+=1;
                if (y <= numPint/2) {
                    System.out.print(numero);
                    
                }else{
                    numero-=2;
                    System.out.print(numero);
                }
            }
            numero=0;
            numPint += 2;
            System.out.println();
        }                    
    }  
}
