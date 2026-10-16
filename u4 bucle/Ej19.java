public class Ej19 {
    public static void main(String[] args) {
        //piramide
        int altura = 7 ;
        int numPint = 1 ; 

        for ( int i = 0 ; i < altura ; i ++){
            for ( int j = 0 ; j < altura-i; j++){
                System.out.print(" ");
            }
            for ( int y = 0 ; y < numPint ; y++ ){
                if(y==0 || y==numPint-1 || i==altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            numPint += 2;
            System.out.println();
        }                    
    }
}
