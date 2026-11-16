public class Agenda {
    private Contacto[] listaContactos = new Contacto[20];

    // f 3 true si no hay tlf iguales
    public boolean revisarTelefeno(Contacto contacto){
        boolean respuesta = true;
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null && contacto.getTlf() == listaContactos[i].getTlf()){
                respuesta = false;
                System.out.println("Error, ese tlf ya esta registrado. ");
            } 
        }
        return respuesta;  
    }

    //
    public boolean sePuedeAniadir(){
        if (Main.contactosAniadidos != 20 ){
            return  true;
        }else{
            System.out.println("Ya esta el máximo de personas ");
            return  false;
        } 
    }

    // controlando que no haya ya uno creado 
    public void anadirContacto(Contacto contacto){

        if ( sePuedeAniadir() && revisarTelefeno(contacto) ){
            for (int i = 0; i < listaContactos.length; i++) {
                if ( listaContactos[i] == null){
                    listaContactos[i] = contacto;
                    i = listaContactos.length ; 
                    Main.contactosAniadidos++;
                }
                
            }
            System.out.println("Telefono guardado");
        } else System.out.println("No se pudo aniadir");
    }

    //
    public void imprimirAgenda(){
        for (int i = 0; i < listaContactos.length; i++) {
            if ( listaContactos[i]!= null ){
                System.out.print("Id "+(i+1)+": \n" + listaContactos[i].toString()+"\n-------------------------\n");
                
            }
        }
    }

    public void eliminarContacto(int opcion){
        if ( listaContactos[opcion-1] == null){
            System.out.println("Ese contacto no existe");
        } else {
            System.out.println("Borrado con exito");
            listaContactos[opcion-1] = null;
            Main.contactosAniadidos -- ;
        }
        
    }

    public void limpiarAgenda(){
        for (int i = 0; i < listaContactos.length; i++) {
            listaContactos[i]=null;
        }
    }

    public void buscar(String apedillo){
        boolean auxiliar = false ; 
        for (int i = 0; i < listaContactos.length; i++) {

            if ( apedillo.equals(listaContactos[i])){
                auxiliar = true ; 
                System.out.println(listaContactos[i].toString());
            }
        }
        if( auxiliar == false) System.out.println("No existe nadie que se apellide asi ");
    }
    
}
