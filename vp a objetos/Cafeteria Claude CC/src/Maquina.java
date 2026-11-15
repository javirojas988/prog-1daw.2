import java.util.Random;

public class Maquina {
    private int stockCafe;
    private int stockTe;
    private int stockChocolate;
    private int recaudacion;

    public Maquina(int stockCafe, int stockTe, int stockChocolate, int recaudacion) {
        this.stockCafe = stockCafe;
        this.stockTe = stockTe;
        this.stockChocolate = stockChocolate;
        this.recaudacion = recaudacion;
    }

    public int obtenerTotalProductos() {
        return stockCafe + stockTe + stockChocolate;
    }

    public char servirBebida(char tipo) {
        int auxiliar;
        if ( seAtasca(15)){
            auxiliar = -1;   
        }else {
            auxiliar = 1 ; 
        } 

        if ( tipo == 'C'){
            stockCafe += auxiliar;
        } else if ( tipo == 'T') {
            stockTe += auxiliar;
        } else {
            stockChocolate += auxiliar;
        }
        return 'a';
    }

    

    private static boolean seAtasca(int probabilidad) {
        Random rand = new Random();
        // Número entre 0 y 99. Si es menor que la probabilidad, se atasca
        return rand.nextInt(100) < probabilidad;
    }
    
}