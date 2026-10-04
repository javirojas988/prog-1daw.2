package herencia;

public class Perro extends Animal {
    public Perro( String nombre , String familia ){
        super(familia, nombre);
    }

    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "soy pero";
    }

    @Override 
    public void hazSonido(){
        System.out.println("guau");
    }
}
