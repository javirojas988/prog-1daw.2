public class Ej67 {
    public static void main(String[] args) {
        // W 
        /*
        
*       *       *
 *     * *     * 
  *   *   *   *  
   * *     * *   
    *       *    
2 espacios menos por cada 7 5 3
1 espacio a la izquierda

- 2 1 t 
- 3 3 t 
- 4 5 t 15
- 5 6 t 17 
- 6 7 t  

        */
        int altura = 5 ; 
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((altura-i)*2)-1 ; j++) {

                if(j==0 || j== ((altura*2)-1)-1){
                    System.out.print("x");
                } else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();            
        }

    }
}
