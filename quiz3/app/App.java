package quiz3.app;

import quiz3.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Inmueble> inmuebles= new ArrayList<>();
        Agencia inmueblesDelOriente=new Agencia("inmuebles del oriente");

        Inmueble casa= new Casa("Cocorna",150000000,700000,false);
        Inmueble lote= new Lote("Guarne",600000000);
        Inmueble apartamento = new Apartamento("Rionegro",25000000,500000,true);
        Inmueble apartamentox2 = new Apartamento("valledupar",30000111,1000000,false);
        Inmueble apartamentox3 = new Apartamento("almeja",23412311,650000,true);

        inmuebles= Arrays.asList(casa,lote,apartamento,apartamentox2,apartamentox3);
        inmuebles.forEach(inmueblesDelOriente::agregarInmbueble);
        System.out.println("arrendados ");
        System.out.println(inmueblesDelOriente.getArrendados());
        System.out.println("disponibles ");
        System.out.println(inmueblesDelOriente.getArrendablesDisponibles());
        inmueblesDelOriente.vender(apartamentox3);
        System.out.println("disponibles ");
        System.out.println(inmueblesDelOriente.getArrendablesDisponibles());
        System.out.println("arrendados ");
        System.out.println(inmueblesDelOriente.getArrendados());






    }
}
