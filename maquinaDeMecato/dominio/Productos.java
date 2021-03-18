package maquinaDeMecato.dominio;
import java.util.Scanner;

public class Productos {
    private String serial;
    private String nombre;
    private int cantidad;
    private double precio;


    public  Productos (String serial, String nombre, int cantidad, double precio){
        this.serial= serial;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio= precio;


    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSerial() {
        return serial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}

