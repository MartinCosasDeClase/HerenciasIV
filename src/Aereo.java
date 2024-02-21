public class Aereo extends Vehiculo{
    private String nombreaereo;

    public Aereo() {
    }
    public Aereo(String nombreVehiculo, String nombreaereo) {
        super(nombreVehiculo);
        this.nombreaereo = nombreaereo;
    }

    public String volar(){
        return "Volando";
    }
}
