package parcial.domino;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public int capacidad =15;
    private List<Material> materiales;

    public Pooflix (){
    this.materiales=new ArrayList<>();
    }

    public boolean agregar(Material material){


        if (this.materiales.size() < capacidad ) {

                this.materiales.add(material);
                return true;

        }

        return false;

    }

    public boolean retirar(int codigo){
        if(materiales != null) {
            Material materialRetirar = buscar(codigo);
            materiales.remove(materialRetirar);
            return true;
        }
        else {
            return false;
        }

    }

    public Material buscar(String nombre){

        Material material = null;

        for (Material pelicula: this.materiales) {
            if (pelicula.getNombre().equalsIgnoreCase(nombre)) {
                material = pelicula;
                break;
            }
        }

        return material;

    }
    public Material buscar (int codigo) {
        Material material = this.materiales.stream()
                .filter(code -> code.getCodigo() == codigo)
                .findFirst()
                .orElse(null);

        return material;
    }
    public List<String> buscarPorTipo(){
        List<String> pelicula = new ArrayList<>();
        this.materiales.forEach(material -> {
            if(material.getTipo().equalsIgnoreCase("pelicula")){
            pelicula.add(material.getNombre());
            }
        });
        List<String> serie = new ArrayList<>();
        this.materiales.forEach(material -> {
            if(material.getTipo().equalsIgnoreCase("serie")){
                serie.add(material.getNombre());
            }
        });
        List<String> documental = new ArrayList<>();
        this.materiales.forEach(material -> {
            if(material.getTipo().equalsIgnoreCase("documental")){
                documental.add(material.getNombre());

            }
        });
        List<String> animacion = new ArrayList<>();
        this.materiales.forEach(material -> {
            if(material.getTipo().equalsIgnoreCase("animacion")){
                pelicula.add(material.getNombre());
          }
        });
        List<String> cortoAnimado = new ArrayList<>();
        this.materiales.forEach(material -> {
            if(material.getTipo().equalsIgnoreCase("corto animado")){
                cortoAnimado.add(material.getNombre());
            }

        });


        return  null;

    }
    public int calcularDuracionTotal () {
        int total;
        total=0;
        total += materiales.stream().mapToInt(Material::getDuracion).sum();
        return total;
    }

    public List<String> ordenarPorCodigo(){


    return null;

    }
    public void mostrar(){

        materiales.forEach(material -> {

            System.out.println(material.getNombre()+" tipo "+material.getTipo());
        });
    }



}
