package EjercicioObjeto.Ej1;

public class App {
    public static void main(String[] args) {
        // Bicicleta bici = new Vehiculo(55);
        Vehiculo biciQuechua = new Bicicleta(55);
        Vehiculo coche1 = new Coche(323);


        System.out.println(Vehiculo.vehiculosCreados);
        System.out.println(Vehiculo.kilometrosTotales);
    }
}
