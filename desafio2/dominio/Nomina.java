package desafio2.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public  void calcularNomina(){
        this.empleados.forEach(empleado1 -> {
            System.out.println(empleado1.getNombre() + " salario:  "+ empleado1.calcularSalario());

        });
        long total =this.empleados.stream().mapToLong(Empleado::calcularSalario).sum();
        System.out.println("total a pagar: "+total);


    }
    public  void listarDirectos(){
        this.empleados.forEach(directos->{
            if(directos instanceof Directo){
                System.out.println(directos.getNombre()+" Directo");
            }
        });


    }
    public  void listarFreelacers(){
        this.empleados.forEach(Freelace->{
            if(Freelace instanceof Freelance){
                System.out.println(Freelace.getNombre()+" Freelance ");
            }
        });


    }
     public void  listarPromotores(){
        this.empleados.forEach(promotores->{
            if(promotores instanceof Promotor){
                System.out.println(promotores.getNombre()+" Promotor ");
            }
        });


    }



}
