public class Avion extends Aereo{
    public Avion() {
    }
    public Avion(String nombreVehiculo, String nombreaereo) {
        super(nombreVehiculo, nombreaereo);
    }

    public String bajarTrenDeAterrizaje(){
        return "Bajando tren de aterrizaje";
    }
}
