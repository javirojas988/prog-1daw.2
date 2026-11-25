public class GestionaObras {
    private static final int OBRAS_ARRAY = 3;
    
    private Obra[][] listadoObras = new Obra[3][OBRAS_ARRAY];
    // 1 libro
    // 2 disco
    // 3 vinilo

    //añadir segun el tipo 
    public void anadirObra(int tipoDeObra) {
        if (revisarEspacio(tipoDeObra)) {
            
            System.out.print("codigo de la obra: ");
            String cod = App.sc.nextLine();
            System.out.print("titulo de la obra: ");
            String titulo = App.sc.nextLine();
            System.out.print("autor de la obra: ");
            String autor = App.sc.nextLine();
            switch (tipoDeObra) {
                case 1:
                    // li
                    System.out.print("editorial de la obra: ");
                    String editorial = App.sc.nextLine();
                    Libro libro = new Libro(cod, titulo, autor, editorial);
                    for (int i = 0; i < OBRAS_ARRAY; i++) {
                        if (listadoObras[tipoDeObra - 1][i] == null) {
                            listadoObras[tipoDeObra-1][i] = libro;
                            cambiarCodigo(i, libro);
                            i=OBRAS_ARRAY;
                        }
                    }
                    break;
                case 2:
                    System.out.print("productora de la obra: ");
                    String productora = App.sc.nextLine();
                    DVD dvd = new DVD(cod, titulo, autor, productora);
                    for (int i = 0; i < OBRAS_ARRAY; i++) {
                        if (listadoObras[tipoDeObra - 1][i] == null) {
                            listadoObras[tipoDeObra-1][i] = dvd;
                            cambiarCodigo(i, dvd);
                            i=OBRAS_ARRAY;
                        }
                    }
                    break;
                case 3:
                    System.out.print("discografia de la obra: ");
                    String discografia = App.sc.nextLine();
                    Vinilo vil = new Vinilo(cod, titulo, autor, discografia);
                    for (int i = 0; i < OBRAS_ARRAY; i++) {
                        if (listadoObras[tipoDeObra - 1][i] == null) {
                            listadoObras[tipoDeObra-1][i] = vil;
                            cambiarCodigo(i, vil);
                            i=OBRAS_ARRAY;
                            
                        }
                    }
                    break;
                default:
                    System.out.println("Introduce un tipo valido");
                    break;
            }
        } else {
            System.out.println("no queda espacio para añadir");
        }

    }
    //metodo para que sea mas facil todo
    

    // revisa espacio de cada tipo
    public boolean revisarEspacio(int tipoDeObra) {
        boolean re = false;
        if (tipoDeObra >= 1 && tipoDeObra <= 3) {
            for (int i = 0; i < OBRAS_ARRAY; i++) {
                if (listadoObras[tipoDeObra - 1][i] == null) {
                    re = true;
                }
            }
        } else {
            System.out.println("Introduce un número del 1 al 3 ");
        }

        return re;
    }

    // funciona
    public void  enseniarPrestadas(){
        int contador = 1 ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < OBRAS_ARRAY; j++) {

                if ( listadoObras[i][j] != null){
                    
                    // si el getter saca true es que esta prestada y enseña el to String correspondiente de esa obra
                    if(listadoObras[i][j].isPrestada() ){
                        
                        System.out.println("* * * * * * * *");
                        System.out.println(contador+ " "+ listadoObras[i][j].toString());
                        contador++ ;
                    }
                }

            }
        }
    }
    public void enseniarPorTipo(int tipoObra){
        if ( tipoObra <= 3 && tipoObra >=1){
            for (int i = 0; i < listadoObras.length; i++) {
                if ( listadoObras[tipoObra-1][i] != null){
                    System.out.println(listadoObras[tipoObra-1][i].toString());
                }
            }
        }else {
            System.out.println("Papico, del uno pls ");
        }
        
    }
    public void godModeAniadir(Obra obra, int tipoObra ){
        for (int i = 0; i < listadoObras.length; i++) {

            if ( listadoObras[tipoObra-1][i] != null){
                listadoObras[tipoObra-1][i] = obra ;
                i = listadoObras.length;
            }
        }
    }


    // no hay que rayarse por el tipo de obra porque recorrera todo
    // para la proxima arreglar q el codigo sea int y que sea unico 
    public Obra devolveObra(int codigo){
        String texto2 = Integer.toString(codigo);
        Obra obra = null ;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < listadoObras.length; j++) {
                if ( listadoObras[i][j].getCod().equals(texto2)){
                    obra = listadoObras[i][j];
                    
                }
            }
        }
        if ( obra == null ) {
            System.out.println("No existe");
            
        }
        return obra;
    }

    public void cambiarCodigo(int i , Obra obra){
        String codigo = Integer.toString(i);
        obra.setCod(codigo);
        
    }
}
