public class Vinilo extends Obra {
    private String discografia ;

    public Vinilo(String cod, String titulo, String autor, String discografia) {
        super(cod, titulo, autor);
        this.discografia = discografia ;
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\nDiscografia: "+discografia;
    }
}
