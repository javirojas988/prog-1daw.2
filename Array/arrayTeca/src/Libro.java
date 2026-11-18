public class Libro extends Obra {
    private String editorial ;

    public Libro(String cod, String titulo, String autor, String editorial) {
        super(cod, titulo, autor);
        this.editorial = editorial ; 
    }

    
    
}
