package practica.dominio;

public abstract class Vehiculo implements Reparable {
    private String placa;
    private boolean motorBueno;

    public Vehiculo(String placa, boolean motorBueno) {
        this.placa = placa;
        this.motorBueno = motorBueno;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isMotorBueno() {
        return motorBueno;
    }

    public void setMotorBueno(boolean motorBueno) {
        this.motorBueno = motorBueno;
    }
}
