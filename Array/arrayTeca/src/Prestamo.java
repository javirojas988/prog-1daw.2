public class Prestamo {
    private Obra obra; 
    private Socio socio ; 
    private int fechaLimite ;  // 15 a la fecha registro
    private static int MAXIMO_OBRAS = 5 ; 
    private int fechaPrestamo;
    // no se si deberia ir aqui el array
    private static Prestamo liPrestamos[] = new Prestamo [GestionUsuarios.MAXIMO_SOCIOS*MAXIMO_OBRAS];

    public void calcularLimite(){
        fechaLimite = fechaPrestamo + 15 ; 
        
    }
    
    // mostamo 
    public void  realizarPrestamo ( Socio socio , Obra obra ){
        if ( obra.isPrestada()){
            //Reserva
        } // ELSE ; INSTANCIA PRESTAMO Y LO AÑADE AL ARRAY  ;
    }
    public boolean puedeRecibirPrestamo( Socio socio ){
        if ( socio.getPrestamosActuales() >= MAXIMO_OBRAS ){
            System.out.println("No puedes realizar mas prestamos ");
            return  false ; 
        } else if ( socio.isSancionado() ){
            System.out.println("Estas sancionado");
            return  false ;
        } else {
            return  true ; 
        }
    }
}