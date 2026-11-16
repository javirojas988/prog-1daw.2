public class Tabla {
    private static  int MESES = 12 ; 
    private static  int MAX_DIAS = 31;
    private static  int [] DIAS_MES = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static  int [] MINIMA = {7,8,10,11,14,18,20,21,18,15,11,8};
    private static  int [] MAX = {17,18,20,21,24,28,31,31,28,24,20,17};
    private static  String [] NOM_MESES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private double[][] tablaAnio = new double[MESES][MAX_DIAS];

    public Tabla(){
    }

    public void rellenarTabla(){
        
        for (int i = 0; i < MESES; i++) {

            for (int j = 0; j < MAX_DIAS; j++) {
                if (DIAS_MES[i] < j+1){
                    
                    tablaAnio[i][j] = Double.MIN_VALUE;
                } else {
                    tablaAnio[i][j] = App.rand.nextInt(MAX[i] - MINIMA[i] + 1) + MINIMA[i];

                }
                
            }
        }
    }

    public void imprimirTabla(){
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < MESES; i++) {
            System.out.printf("\033[32m%s\033[0m | ",NOM_MESES[i]);
            for (int j = 0; j < MAX_DIAS; j++) {
                System.out.printf("%.1f | ", tablaAnio[i][j]);
            }
            System.out.println("\n---------------------------------------------------------------------------------");
        }
    }


    public void mediaMes(int mes){
        int media = 0  ; 
        for (int i = 0; i < DIAS_MES[mes+1]; i++) {
            media += tablaAnio[mes+1][i] ;
        }
        media /= DIAS_MES[mes+1];
        System.out.println("La media de ese mes fue de: "+media);
    }

    public void maxYmin(){
        double maxima = -10000;
        double minima = 10000;
        for (int i = 0; i < MESES; i++) {

            for (int j = 0; j < MAX_DIAS; j++) {
                if (DIAS_MES[i] < j+1){
                    //no hace na en los no valor
                    
                } else {
                    if ( tablaAnio[i][j] > maxima){
                        maxima =  tablaAnio[i][j] ;
                    }
                    if ( tablaAnio[i][j] < minima){
                        minima =  tablaAnio[i][j] ;
                    }
                }
                
            }
        }
        System.out.println("minima: "+minima+"\nmaxima: "+maxima );
    }

    public void calorExtremo(){
        for (int i = 0; i < MESES; i++) {

            for (int j = 0; j < MAX_DIAS; j++) {
                if(tablaAnio[i][j] >= 30){
                    System.out.printf("El %d de %s\n",j ,NOM_MESES[i]);
                }
                
            }
        }
    }
}
