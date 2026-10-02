package herencia;

public class App {

    public static void main(String[] args) {
        Animal coyote = new Animal("ROEDORES", "papu");
        Animal cabalo1 = new Animal("cuadripedo", "misifu");
        System.out.println(coyote.getNombre());
        System.out.println(cabalo1.getNombre());

    }
    //coyote.name; // no se puede porque es private 
}
