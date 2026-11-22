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


    
}
