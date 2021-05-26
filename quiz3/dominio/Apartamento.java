package quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable {

    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {
        if(!super.isArrendado()){
            super.setArrendado(true);
        }

    }

    @Override
    public void devolver() {
        if(super.isArrendado()){
            super.setArrendado(false);

        }

    }

    @Override
    public String toString() {
        return "apartamento "+ getDireccion() + "valor venta "+ getValorVenta() + " valor arriendo " + getValorArriendo();
    }
}
