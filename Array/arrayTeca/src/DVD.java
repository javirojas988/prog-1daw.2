public class DVD extends Obra{
    private String productora;

    public DVD(String cod, String titulo, String autor , String productora) {
        super(cod, titulo, autor);
        this.productora = productora ; 
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nproductora: " + productora;
    }
}
