package desafio2.app;

import desafio2.dominio.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Empleado juan = new Directo("juan",5360000);
        Empleado julian = new Vendedor("julian",2450000,55510000);
        Empleado johanna=new Freelance("Jhoanna",76000,85);
        Empleado carolina = new Vendedor("Carolina",990000,62487000);
        Empleado pedro= new Promotor("Pedro",1500,250,48);
        Empleado david= new Directo("David",2895000);
        Empleado gustavo = new Freelance("Gustabo",52500,60);
        List<Empleado> empleado = new ArrayList<>(Arrays.asList(juan, julian, johanna,carolina,pedro,david,gustavo));
        Nomina nomina = new Nomina(empleado);

        System.out.println("total a pagar");
        nomina.calcularNomina();
        System.out.println("son freelancers");
        nomina.listarFreelacers();
        System.out.println("son promotores");
        nomina.listarPromotores();
        System.out.println("son directos");
        nomina.listarDirectos();

        empleado.forEach(empleado1 -> {
            System.out.println(empleado1.getNombre() + " pago  "+ empleado1.calcularSalario());

        });





    }



}
