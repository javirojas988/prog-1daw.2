public class App {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(302, 12);
        Monitor monitor2 = new Monitor(30,1);
        monitor1.encender();
        System.out.println("El tamanio del monitor grande es de" + monitor1.tamanio);

        // cuando cogemo objeto lleva puntoero a memoria 
        // con null eliminamo el punteor, y java, al no haber puntero, borra a lo que apuntaba la memoria 
        monitor2 = null ; 
    }
}