package practica.dominio;

public class Moto extends Vehiculo{


    public Moto(String placa, boolean motorBueno) {
        super(placa, motorBueno);
    }



    @Override
    public String toString() {
        return "Moto "+ getPlaca();
    }

    @Override
    public void reparar() {
        super.setMotorBueno(true);
    }
}
