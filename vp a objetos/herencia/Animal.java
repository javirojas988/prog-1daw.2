package herencia;
public class Animal {
    private String nombre ; 
    private String familia ; 
    
    public Animal ( String familia, String nombre ){
        this.familia = familia;
        this.nombre  = nombre;
    }

    public Animal ( String nombre ){
        this.nombre =nombre ; 
    }
    
    public String getNombre(){
        return this.nombre; 
    }
    public void hazSonido(){
        System.out.println("no se mi sonido");
    }
}
