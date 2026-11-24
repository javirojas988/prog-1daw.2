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
    public Prestamo(Obra obra, Socio socio, int fechaPrestamo) {
        this.obra = obra;
        this.socio = socio;
        this.fechaPrestamo = fechaPrestamo;
    }
    public Prestamo() {
        //TODO Auto-generated constructor stub
    }

    public void  realizarPrestamo ( Socio socio , Obra obra ){
        if ( obra.isPrestada()){
            //Reserva
        } else {
            Prestamo prestamo = new Prestamo(obra, socio,App.CONTADOR_DE_DIAS );
            for (int i = 0; i < liPrestamos.length; i++) {
                if ( liPrestamos[i] == null){
                    liPrestamos[i] = prestamo ; 
                    i = liPrestamos.length;
                }
            }
        }
         // ELSE ; INSTANCIA PRESTAMO Y LO AÑADE AL ARRAY  ;
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

    // revisamo array y si la fecha es menor que la fecha actual entonces sancionamos al usuario con 3 dias
    // como esta funcion pasa cada dia, se le ira sumando tres cada dia 
    // cuando entregue debera quitarse el prestamo y esto deberia parar por ende
    public void revisarFecha(){
        for (int i = 0; i < liPrestamos.length; i++) {
            if (liPrestamos != null && liPrestamos[i].fechaLimite < App.CONTADOR_DE_DIAS){
                Socio socio = liPrestamos[i].getSocio();
                socio.setSancionado(true);
                socio.setSancion(socio.getSancion()+3);
            }
        }
    }
    public Socio getSocio() {
        return socio;
    }
}