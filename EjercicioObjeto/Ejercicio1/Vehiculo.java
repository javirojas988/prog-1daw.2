public class Vehiculo {

    //Atributo de clase, un atributo  global para todo, no que al construirlo, le pongo cualquier cosa
    public static  int vehiculosCreados ;
    public static int kilometrosTotales ; 

    // atr de instancia 
    public int kilometrosRecorridos  ; 

    //vehi
    public Vehiculo() {
        vehiculosCreados++;
    }
    
    //vehiculo 2nd mano
    public Vehiculo(int kilometrosRecorridos){
        //referencia al constructor ()
        this();

        //this a mi atributo
        this.kilometrosRecorridos = kilometrosRecorridos;
        
        // += le suma a tot
        kilometrosTotales += kilometrosRecorridos;
    }

    //metodo andar
    public void andar(int kilometros){
        //no this, porque es atr de clase
        kilometrosRecorridos += kilometros;
        
    }

    public static int verKilometrosTotales() {
        return kilometrosTotales;
    }
}

//this es para llamar metodo, constructores