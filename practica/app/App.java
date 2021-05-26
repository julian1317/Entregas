package practica.app;

import practica.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Taller mcd = new Taller();
        List<Vehiculo> vehiculos= new ArrayList<>();
        Vehiculo carrox = new Camion("KAD421",false);
        Vehiculo motox = new Moto("KJS123",false);
        Vehiculo lancha = new Lancha("LPS123",false);
        Vehiculo automovil = new Automovil("GAD345",true);
        Vehiculo automovil2 = new Automovil("HGF894",false);
        Vehiculo automovil22 = new Automovil("LSK456",true);
        vehiculos= Arrays.asList(carrox,motox,lancha,automovil,automovil2,automovil22);
        vehiculos.forEach(vehiculo -> {
            if(mcd.ingresar(vehiculo)){
                System.out.println("ingreso "+ vehiculo.toString());
            }
            else {
                System.out.println("no ingresa "+ vehiculo.toString());
            }
        });

        System.out.println(mcd.listarVehiculos());
        mcd.repararVehiculo(carrox);
       if(mcd.retirar(carrox)){
           System.out.println("se retiro el vehiculo");
       }else{
           System.out.println("aun no se ha reparado el vehiculo");
       }
        System.out.println(mcd.listarVehiculos());

    }





}
