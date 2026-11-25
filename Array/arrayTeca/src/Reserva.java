public class Reserva {
    private Socio socio ; 
    private Obra obra ; 
    private static final int MAXIMAS_RESERVAS = 2 ; 
    private Reserva[] liReservas = new Reserva[MAXIMAS_RESERVAS*GestionUsuarios.MAXIMO_SOCIOS];

    public Reserva(){

    }

    public void reservar(Socio socio, Obra obra){
        Reserva r1 = new Reserva(socio, obra);
        for (int i = 0; i < liReservas.length; i++) {
            if ( liReservas[i] == null){
                liReservas[i] = r1 ;
                i = liReservas.length;
                
            }
        }
    }

    public Reserva(Socio socio, Obra obra) {
        this.socio = socio;
        this.obra = obra;
    }

    public void chequearReservas(Prestamo gPrestamo){
        for (int i = 0; i < liReservas.length; i++) {
            if (  liReservas[i] != null && liReservas[i].obra.isPrestada() == false){
                gPrestamo.realizarPrestamo(liReservas[i].socio, liReservas[i].obra);
                System.out.println("la reserva de "+liReservas[i].socio.getNombre()+ " "+liReservas[i].socio.getApellido());
                System.out.println("ya puede es de usted");
            }
        }
    }

    public Obra getObra() {
        return obra;
    }
    public Socio getSocio() {
        return socio;
    }
}
