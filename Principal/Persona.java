package Principal;
import Principal.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public double getEstatura(){
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
}
