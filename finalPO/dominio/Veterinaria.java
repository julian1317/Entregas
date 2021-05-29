package finalPO.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static  java.util.stream.Collector.*;

public class Veterinaria {
    private String nombre;
    private List<Mascota> pacientes;


    public Veterinaria(String nombre, List<Mascota> pacientes) {
        this.nombre = nombre;
        this.pacientes = pacientes;
    }



    public Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado){
        if((sexo.equalsIgnoreCase("macho")&& edad >12 && !esterilizado)|| (sexo.equalsIgnoreCase("hembra") && edad > 18 && !esterilizado))   {
            return new MascotaApta(nombre,sexo,edad,esterilizado);


        }
        if(esterilizado){
            return new MascotaEsterilizada(nombre,sexo,edad,esterilizado);
        }
        return new MascotaNoApta(nombre,sexo,edad,esterilizado);

    }

    public List<MascotaApta> getPacientesAoperar(){
        List<MascotaApta> getpacienteAoperar = new ArrayList<>();

        /*getpacienteAoperar= Collections.singletonList((MascotaApta) pacientes.stream().filter(Mascota::isEsterilizado).collect(Collectors.toList()));*/


       this.pacientes.forEach(paciente->{
            if (paciente instanceof MascotaApta ){
                getPacientesAoperar().add((MascotaApta) paciente);
            }
        });
        return getpacienteAoperar;

    }
    public void operar(){
        pacientes.forEach(paciente -> {
            if(paciente instanceof Operable){
               ((Operable) paciente).operar();
            }
        });
    }
}
