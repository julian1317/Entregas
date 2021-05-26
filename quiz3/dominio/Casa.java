package quiz3.dominio;

public class Casa extends Inmueble implements  Arrendable{
    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
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
            System.out.println(" se ha regresado la casa");
        }
        else System.out.println(" la casa no estaba arrendada ");

    }

    @Override
    public String toString() {
        return "Casa "+ getDireccion() + "valor venta "+ getValorVenta() + " valor arriendo " + getValorArriendo();
    }
}
