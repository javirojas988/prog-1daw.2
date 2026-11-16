public class Tabla {
    private static  int MESES = 12 ; 
    private static  int MAX_DIAS = 31;
    private static  int [] DIAS_MES = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static  int [] MINIMA = {7,8,10,11,14,18,20,21,18,15,11,8};
    private static  int [] MAX = {17,18,20,21,24,28,31,31,28,24,20,17};
    private double[][] tablaAnio = new double[MESES][MAX_DIAS];


    public void rellenarTabla(){
        
        for (int i = 0; i < MESES; i++) {
            for (int j = 0; j < MAX_DIAS; j++) {
                if (DIAS_MES[i] < MAX_DIAS){
                    tablaAnio[i][j] = App.rand.nextInt(MAX[i] - MINIMA[i] + 1) + MINIMA[i];

                } else{
                    tablaAnio[i][j] = Double.MIN_VALUE;

                }
                
            }
        }
    }

}
