package quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable {

    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public boolean arrendar() {
        if(!super.isArrendado()){
            super.setArrendado(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if(super.isArrendado()){
            super.setArrendado(false);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "apartamento en "+ getDireccion() + " valor venta "+ getValorVenta() + " valor arriendo " + getValorArriendo();
    }
}
