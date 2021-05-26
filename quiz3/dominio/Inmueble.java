package quiz3.dominio;

public abstract class Inmueble {

    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

    public Inmueble(String direccion, long valorVenta, long valorArriendo, boolean arrendo) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendo;
    }

    public Inmueble(String direccion, long valorVenta) {
        this.direccion= direccion;
        this.valorVenta=valorVenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
