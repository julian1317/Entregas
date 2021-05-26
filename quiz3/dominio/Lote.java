package quiz3.dominio;

public class Lote extends Inmueble {

    public Lote(String direccion, long valorVenta ) {
        super(direccion, valorVenta);
    }

    @Override
    public String toString() {
        return "lote en "+ getDireccion() + " valor venta "+ getValorVenta();
    }
}
