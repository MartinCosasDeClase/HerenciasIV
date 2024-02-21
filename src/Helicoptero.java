public class Helicoptero extends Aereo{
    public Helicoptero() {
    }
    public Helicoptero(String nombreVehiculo, String nombreaereo) {
        super(nombreVehiculo, nombreaereo);
    }

    public String encenderHelices(){
        return "Encendiendo helices";
    }
}
