package parcial.app;

import parcial.domino.Material;
import parcial.domino.Pooflix;

public class App {
    public static void main(String[] args) {

        Material seriex= new Material(12,"serix1",1,"serie");
        Material seriex2= new Material(2,"serix2",3,"documental");
        Material peliculax1= new Material(13,"peliculax1",2,"pelicula");
        Material peliculax2= new Material(23,"peliculax2",1,"pelicula");
        Pooflix pooflix=new Pooflix();

        pooflix.agregar(seriex);
        pooflix.agregar(seriex2);
        pooflix.agregar(peliculax1);
        pooflix.agregar(peliculax2);

        pooflix.mostrar();
        System.out.println(pooflix.calcularDuracionTotal());
        pooflix.retirar(12);
        System.out.println(pooflix.calcularDuracionTotal());
        pooflix.mostrar();
        pooflix.buscar("peliculax1");
        pooflix.buscar("13");



    }
}
