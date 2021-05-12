package desafio2.dominio;

public class Freelance extends  Empleado{
    private long valorHora;
    private  int horasTrabajadas;

    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return this.horasTrabajadas * this.valorHora;
    }
}
