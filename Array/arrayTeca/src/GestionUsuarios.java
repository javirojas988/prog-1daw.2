public class GestionUsuarios {
    public static final int MAXIMO_SOCIOS = 3;
    private Socio listaSocios[] = new Socio[MAXIMO_SOCIOS];
    public static int numeroActualSocio = 0;

    public void aniadirSocio() {
        numeroActualSocio++;
        if (numeroActualSocio < MAXIMO_SOCIOS) {
            System.out.print("nombre: ");
            String nombre = App.sc.nextLine();
            System.out.print("apellido: ");
            String apellido = App.sc.nextLine();
            Socio socio = new Socio(nombre, apellido);
            for (int i = 0; i < MAXIMO_SOCIOS; i++) {
                if (listaSocios[i] != null) {
                    listaSocios[i] = socio;
                    i = MAXIMO_SOCIOS;
                }
            }
        } else {
            System.out.println("no se pueden añadir mas socios ahora mismo");
        }
    }

    public void eliminarSocio(int numeroSocio) {
        if (listaSocios[numeroSocio - 1] == null) {
            System.out.println("Este socio no existe");
        } else {
            if (listaSocios[numeroSocio - 1].getPrestamosActuales() == 0) {
                listaSocios[numeroSocio - 1] = null;
                numeroActualSocio--;
            } else {
                System.out.println("Este usuario tiene algun prestamo pendiente");
            }
        }

    }

    public void printearSocio(){
        for (int i = 0; i < MAXIMO_SOCIOS; i++) {
            if( listaSocios[i] != null){
                System.out.println((i+1)+". "+ listaSocios[i].getNombre() );
            }
            
        }
    }

    public void buscar(String apedillo){
        int contador = 0 ; 
        for (int i = 0; i < listaSocios.length; i++) {
            if (listaSocios[i]!= null && listaSocios[i].getApellido() == apedillo) {
                contador++;
                System.out.println( contador + " * * * * *");
               System.out.println(listaSocios[i].toString());
               
            }
        }
    }

    public Socio getSocio(int opcion){
        if (listaSocios[opcion-1] != null){
            return listaSocios[opcion-1];
        }else return null;
    }

    // pasa cada nuevo dia, coge los sancionado y les reduce la pena
    public void reducirPena(){
        for (int i = 0; i < listaSocios.length; i++) {
            if ( listaSocios[i] != null && listaSocios[i].isSancionado()){
                listaSocios[i].setSancion(listaSocios[i].getSancion()-1);
            }
        }
    }
}
