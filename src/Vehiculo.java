public class Vehiculo {
    public String nombreVehiculo;

    public Vehiculo() {
    }
    public Vehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String transportar(){
        return "Transportando";
    }
}
