package practica.dominio;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private List<Vehiculo> vehiculos;

    public Taller() {
        this.vehiculos = new ArrayList<>();
    }

    public void repararVehiculo(Reparable vehiculo){
        vehiculo.reparar();

    }

    public boolean ingresar(Vehiculo vehiculo){
        if(!vehiculo.isMotorBueno()){
            vehiculos.add(vehiculo);
            return !vehiculo.isMotorBueno();
        };
        return false;
    }

    public boolean retirar(Vehiculo vehiculo){
        if(vehiculo.isMotorBueno()){
            vehiculos.remove(vehiculo);
            return true;
        }
        return false;
    }

    public String listarVehiculos(){

         return  vehiculos.toString();
    }
}
