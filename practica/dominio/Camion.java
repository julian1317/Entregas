package practica.dominio;

public class Camion extends Vehiculo{
    public Camion(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }


    @Override
    public String toString() {
        return "camion "+ getPlaca();
    }

    @Override
    public void reparar() {
        super.setMotorBueno(true);
    }
}
