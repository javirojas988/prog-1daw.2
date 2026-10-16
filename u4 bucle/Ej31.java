public class Ej31 {
    public static void main(String[] args) {
        int altura = 6 ; 

        for (int i = 0; i < altura; i++) {
            if (i==altura-1) {  
                if (altura<=3) {
                    System.out.print("* *");
                }else{
                    for (int j = 0; j < altura-2; j++) {
                    System.out.print("* ");
                    }
                }
                
            }else{
                System.out.println("*");
            }
        }
    }
}
