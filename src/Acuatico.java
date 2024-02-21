public class Acuatico extends Vehiculo{
    private String nombreaquatico;

    public Acuatico() {
    }
    public Acuatico(String nombreVehiculo, String nombreaquatico) {
        super(nombreVehiculo);
        this.nombreaquatico = nombreaquatico;
    }

    public String navegar(){
        return "Navegando";
    }
}
