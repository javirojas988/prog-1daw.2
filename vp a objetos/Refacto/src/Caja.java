public class Caja {
    private static int totalEntradaAdulto =0 ;
    private static int totalEntradaNinio =0 ;
    private static int totalAudioguia    =0 ; 
    private static double ingresoAcumulado  =0  ; 
    private static double descuentoAcumulados = 0;

    // actualiza los atributos
    public void registrarTicket(Ticket ticket){
        totalEntradaAdulto += ticket.getEntradasAdulto();
        totalEntradaNinio  += ticket.getEntradasNinio() ;
        totalAudioguia     += ticket.getAudioguias()    ; 
        ingresoAcumulado    += ticket.calcularTotal() ;
        descuentoAcumulados += ticket.descuentoAudioguias(); 
    }
    // imprime informe
    public void mostrarResumenDia(){
        System.out.println("------------------------------------------");
        System.out.printf("Total de entradas de adultos vendidas: %d \n",totalEntradaAdulto);
        System.out.printf("Total de entradas de niño vendidas: %d \n", totalEntradaNinio);
        System.out.printf("Total de audioguias vendidas: %d \n\n" , totalAudioguia );

        System.out.printf("Total ahorrado por los clientes %.2f \n" , descuentoAcumulados);
        System.out.printf("Recaudación total %.2f \n" , ingresoAcumulado);
        System.out.println("------------------------------------------");
        
    }
}
