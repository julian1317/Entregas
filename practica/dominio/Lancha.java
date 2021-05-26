package practica.dominio;

public class Lancha extends Vehiculo{

    public Lancha(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }


    @Override
    public String toString() {
        return "Lancha "+ getPlaca();
    }

    @Override
    public void reparar() {
        super.setMotorBueno(true);
    }
}
