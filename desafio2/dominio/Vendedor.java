package desafio2.dominio;

public class Vendedor extends  Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        if (super.calcularSalario() < 1000000){

            return (long) (this.ventasDelMes*0.05);

        }
        else{
            return (long) (this.ventasDelMes*0.045);

        }

    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + calcularComision();

    }
}
