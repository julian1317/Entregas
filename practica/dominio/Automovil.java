package practica.dominio;

public class Automovil extends Vehiculo {


    public Automovil(String placa, boolean motorBueno) {
        super(placa, motorBueno);

    }

    @Override
    public String toString() {
        return "Automovil "+getPlaca();
    }

    @Override
    public void reparar() {
        super.setMotorBueno(true);
    }
}
