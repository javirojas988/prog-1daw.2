public class Monitor {
    public double peso ; 
    public double tamanio;
    public boolean isOn;
    // public String color ; 
    // public String marca; 


    // constructor
    public Monitor(double tamanio, double peso){
        this.tamanio = tamanio;
        this.peso = peso ; 
        //this significa yo
    
    } 

    public void encender(){
        this.isOn = true ;
    }
    public void off(){
        this.isOn = false ; 
    }
}