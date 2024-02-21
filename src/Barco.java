public class Barco extends Acuatico{
    public Barco() {
    }
    public Barco(String nombreVehiculo, String nombreaquatico) {
        super(nombreVehiculo, nombreaquatico);
    }

    public String prenderMotor(){
        return "Encendiendo motor";
    }
}
