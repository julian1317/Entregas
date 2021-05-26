package quiz3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    List<Inmueble> inmuebles = new ArrayList<>();

    public Agencia(String nombre) {
        this.nombre = nombre;

    }

    public void agregarInmbueble(Inmueble inmueble){
        inmuebles.add(inmueble);

    }
    public boolean arrendar(Arrendable inmueble){
        return inmueble.arrendar();


    }
    public boolean devolver(Arrendable inmueble){
        return inmueble.devolver();

    }
    public boolean vender(Inmueble inmueble){
       if( inmueble instanceof  Arrendable && !inmueble.isArrendado() || inmueble instanceof Lote){
           this.inmuebles.remove(inmueble);
           return true;
       }
        return false;
    }
    public List<Inmueble> getArrendablesDisponibles(){
        List<Inmueble> getArrendablesDisponibles=new ArrayList<>();
        this.inmuebles.forEach(inmueble -> {
            if (!inmueble.isArrendado() ){
                getArrendablesDisponibles.add(inmueble);
            }
        });
        return  getArrendablesDisponibles;
    }
    public List<Inmueble> getArrendados(){

        List<Inmueble> getArrendados=new ArrayList<>();
        this.inmuebles.forEach(inmueble -> {
            if(inmueble.isArrendado()){
                getArrendados.add(inmueble);
            }
        });
        return getArrendados;
    }

}
