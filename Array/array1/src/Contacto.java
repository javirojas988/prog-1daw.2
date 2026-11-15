public class Contacto {
    private String nombre;
    private String ape1;
    private String ape2;
    private int tlf; 
    private String gmail;

    public int getTlf() {
        return tlf;
    }
    
    public Contacto(String nombre, String ape1, String ape2, int tlf, String gmail) {
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.tlf = tlf;
        this.gmail = gmail;
    }
    @Override
    public String toString() {
        return ("nombre: " + nombre + " " + ape1 + " " + ape2 + "\nTelf: " + tlf + "\n@: " + gmail);
    }
}
