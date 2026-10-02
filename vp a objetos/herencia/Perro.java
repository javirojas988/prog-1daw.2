package herencia;

public class Perro extends Animal {
    public Perro( String nombre , String familia ){
        super(familia, nombre);
    }

    public void hazSonido(){
        System.out.println("guau guau");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "soy pero";
    }
}
