package maquinaDeMecato.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaDispensadora {
    private String marca;
    private int capacidad;
    private String nombre;
    private List<Productos> productos;
    private int total;
    private int cantidad;


    public MaquinaDispensadora(String marca,int capacidad, String nombre, List productos){
        this.marca= marca;
        this.capacidad=capacidad;
        this.nombre=nombre;
        this.productos=productos;

    }

    public void MostrarProductos() {
        productos.forEach(productos -> {
            System.out.println(productos.getNombre()+" --> "+ productos.getSerial()+" --> "+productos.getPrecio());
        });

    }
    public void consultaEspecifica(String nombreProducto ){

        productos.forEach(productos -> {
            if(nombreProducto.equals(productos.getNombre())){

                System.out.println(nombreProducto);
                System.out.println(productos.getCantidad());

            }

        });

    }

    public void sacar(String nombreProducto, int cantidadProducto) {
        productos.forEach(productos -> {

            if (nombreProducto.equals(productos.getNombre())){
                cantidad=productos.getCantidad();
                if(cantidad - cantidadProducto>=0){
                    productos.setCantidad(cantidad - cantidadProducto);
                    System.out.println("retirada con exíto"+productos.getCantidad() );

                }
                else{
                    System.out.println("no hay suficiente productos");
                }
            }
        });
    }

    public void aumentar(String nombreProducto) {
        Scanner leer = new Scanner(System.in);
        int cantidad2;
        System.out.println("ingrese la cantidad a aumentar: ");
        cantidad2= leer.nextInt();
        productos.forEach(productos -> {
            cantidad=productos.getCantidad();
            if (nombreProducto.equals(productos.getNombre())){

                if(cantidad + cantidad2<=8){
                    productos.setCantidad(cantidad + cantidad2);
                    System.out.println("aumentada con exito"+" --> "+productos.getCantidad() );

                }
                else{
                    System.out.println("excede la capacidad maxima de la maquina");
                }
            }
        });



    }




    public void cantidadtotal() {

        productos.forEach(productos -> {


            total += productos.getCantidad();
            System.out.println(productos.getNombre()+" hay "+productos.getCantidad());
        });


    }
    public void  agotados(){
        productos.forEach(productos -> {
            if(productos.getCantidad()!=0){

            }
            else {

                System.out.println(productos.getNombre());
            }
        });

    }





    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

