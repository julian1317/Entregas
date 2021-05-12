package desafio2.dominio;

public class Promotor extends Empleado{
    private int volantesReapartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesReapartidos, long valorVolante, int comprasVolante) {
        super(nombre);
        this.volantesReapartidos = volantesReapartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        return (this.valorVolante * volantesReapartidos)+(this.comprasVolante* 17000L);
    }
}
