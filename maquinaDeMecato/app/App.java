package maquinaDeMecato.app;


import maquinaDeMecato.dominio.MaquinaDispensadora;
import maquinaDeMecato.dominio.Productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        List<Productos> maquinaProducto= new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String nombreProducto,codigo;
        int cantidad;

        Productos chocolate= new Productos("f12","Chocolate",3,1200);
        Productos fanta= new Productos("f10","Fanta",5,1800);
        Productos agua= new Productos("f16","Agua",8,800);
        Productos barraSeral= new Productos("f15","BarraTosh",0,700);
        Productos jugoHit=new Productos("b1","JugoHit",6,1800);
        Productos choclitos=new Productos("b12","Choclitos",3,900);
        Productos festivales= new Productos("b7","Festivales",0,600);
        Productos bonyurt=new Productos("b14","Bonyurt",0,2500);
        Productos doritos=new Productos("c07","Doritos",0,2000);
        Productos cocacola= new Productos("c11","CocaCola",8,1700);
        MaquinaDispensadora dispensadoraDeMecato=new MaquinaDispensadora("stronger",10,"yusoto",maquinaProducto);


        maquinaProducto.add(chocolate);
        maquinaProducto.add(fanta);
        maquinaProducto.add(agua);
        maquinaProducto.add(barraSeral);
        maquinaProducto.add(jugoHit);
        maquinaProducto.add(choclitos);
        maquinaProducto.add(festivales);
        maquinaProducto.add(bonyurt);
        maquinaProducto.add(doritos);
        maquinaProducto.add(cocacola);


        dispensadoraDeMecato.MostrarProductos();
        dispensadoraDeMecato.cantidadtotal();

        System.out.println("los siguientes productos estan agotados");
        dispensadoraDeMecato.agotados();

        System.out.println("ingrese que producto desea saber su cantidad");
        nombreProducto= leer.nextLine();
        System.out.println("la cantidad del producto es: " );
        dispensadoraDeMecato.consultaEspecifica(nombreProducto);

        String nombreProducto3;/*para evitar bugs*/
        int cantidad2;

        System.out.println("ingrese el nombre del producto que desea aumentar: ");
        nombreProducto3= leer.nextLine();

        dispensadoraDeMecato.aumentar(nombreProducto3);

        String nombreProducto2;/*para evitar bugs*/

        System.out.println("ingrese el nombre del producto que desea retirar: ");
        nombreProducto2= leer.nextLine();
        System.out.println("ingrese la cantidad a retirar: ");
        cantidad= leer.nextInt();
        dispensadoraDeMecato.sacar(nombreProducto2,cantidad);

        System.out.println("Los productos restantes son: ");

        dispensadoraDeMecato.MostrarProductos();
        dispensadoraDeMecato.cantidadtotal();
























    }
}
