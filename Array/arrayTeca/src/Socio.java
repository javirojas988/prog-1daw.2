public class Socio {
    
    private String nombre ; 
    private String apellido; 
    private boolean sancionado = false ;
    private int sancion = 0  ;
    private int prestamosActuales = 0 ; 
    
    
    public String getNombre() {
        return nombre;
    }
    public boolean isSancionado() {
        return sancionado;
    }
    public Socio(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }
   
    public int getPrestamosActuales() {
        return prestamosActuales;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  nombre + " " + apellido + " ";
    }
    public void setSancion(int sancion) {
        this.sancion = sancion;
    }
    public int getSancion() {
        return sancion;
    }
}

    
