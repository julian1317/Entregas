package Principal;
import Principal.Persona;
public class Principal {
    static class Main {

        public static void main(String args[]) {

            Persona a = new Persona("Don lalo");
            Persona b = new Persona("Doña Ligia");

            a.setEdad(63);
            b.setEdad(64);

            b = a;
            a.setEstatura(1.65);

            System.out.println(a.getEdad());
            System.out.println(b.getNombre());
            System.out.println(b.getEstatura());

        }
    }


}
