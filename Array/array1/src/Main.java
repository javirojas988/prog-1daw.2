public class Main {

    // esto es solo para alijerar el saber si esta llena o vacia
    public static int contactosAniadidos = 0 ;

    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        agenda1.limpiarAgenda();
        Contacto contacto1 = new Contacto("marco", "caras", "co", 66666666, "marcoelpapu@gmail.com");
        agenda1.anadirContacto(contacto1);
        agenda1.imprimirAgenda();
    }
}
