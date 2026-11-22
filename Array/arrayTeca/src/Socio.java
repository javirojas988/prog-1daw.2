public class Socio {
    private String nombre ; 
    private String apellido; 
    private int numObras ;
    private int prestamosActuales = 0 ; 
    
    
    public String getNombre() {
        return nombre;
    }
    
    public Socio(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    public int getNumObras() {
        return numObras;
    }
    public void setNumObras(int numObras) {
        this.numObras = numObras;
    
    } 
    public int getPrestamosActuales() {
        return prestamosActuales;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + " " + apellido + " ";
    }
}

    
