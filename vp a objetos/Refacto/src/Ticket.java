public class Ticket {
    private int entradasAdulto;
    private int entradasNinio ; 
    private int audioguias    ;
     
    private final double PRECIOADULTO    = 9.60 ; // si le ponemos static mejor
    private final double PRECIONINIO     = 4.95 ; 
    private final double PRECIOaUDIOGUIA = 3.50 ;
    private final double DESCUENTO = 0.17 ; 


    public Ticket(int entradasAdulto, int entradasNinio, int audioguias){
        this.entradasAdulto = entradasAdulto;
        this.entradasNinio  = entradasNinio ; 
        this.audioguias = audioguias ;

    }

    public double calcularSubtotal(){
        double subtotal = (entradasAdulto*PRECIOADULTO)+(audioguias*PRECIOaUDIOGUIA)+(PRECIONINIO*entradasNinio);
        return subtotal ;
    }
    public double descuentoAudioguias(){
        double descuento = (audioguias*PRECIOaUDIOGUIA)*DESCUENTO;
        return descuento; 
    }
    public double calcularTotal(){
        double total = calcularSubtotal()-descuentoAudioguias();
        return total ; 
    }

    public void imprimirTicker(){
       
        System.out.println("\n============================================");
        System.out.println("              Cueva de Nerja");
        System.out.println("============================================");
        System.out.println("Cliente: \n");
        System.out.println("Producto                   Cant.    Importe");
        System.out.println("--------------------------------------------");
        System.out.printf("Adultos                     %d        %.2f € \n", entradasAdulto, PRECIOADULTO);
        System.out.printf("Niños                       %d        %.2f € \n", entradasNinio, PRECIONINIO);
        System.out.printf("Guías                       %d        %.2f € \n", audioguias, PRECIOaUDIOGUIA);
        System.out.println("--------------------------------------------\n");
        System.out.printf("Subtotal:                            %.2f € \n",calcularSubtotal());
        System.out.printf("Descuento guías:                     %.2f € \n",descuentoAudioguias());
        System.out.printf("\033[31m\033[47m\033[1mTOTAL A PAGAR:                        %.2f € \033[0m \n",(calcularTotal()));
        System.out.println("============================================");
    }

    public int getAudioguias() {
        return audioguias;
    }
    public int getEntradasAdulto() {
        return entradasAdulto;
    }
    public int getEntradasNinio() {
        return entradasNinio;
    }
}
