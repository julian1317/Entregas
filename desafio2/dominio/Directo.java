package desafio2.dominio;

public class Directo extends Empleado {

    private  long salario;

    public Directo(String nombre,long salario) {
        super(nombre);
        this.salario=salario;
    }

    @Override
    public long calcularSalario() {
        return this.salario-calcularSalud()-calcularPension();
    }

    public long calcularSalud(){
         return (long) (this.salario * 0.07);

    }

    public long calcularPension(){
        return (long) (this.salario * 0.065);
    }

}
