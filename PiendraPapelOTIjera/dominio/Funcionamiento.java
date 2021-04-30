package PiendraPapelOTIjera.dominio;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Funcionamiento {
    public static final int PIEDRA=1;
    public static final int PAPEL=2;
    public static final int TIJERA=3;
    public static final int GANAELUSUARIO= 1;
    public static final int GANAELCOMPUTADOR =2;
    public static final int EMPATE = 0;

    public static int jugada(String jugada){

        int opcion=0;
        if ( jugada.equalsIgnoreCase("piedra")){
            opcion=PIEDRA;
        }
        if ( jugada.equalsIgnoreCase("papel")){
            opcion=PAPEL;
        }
        if ( jugada.equalsIgnoreCase("tijera")){
            opcion=TIJERA;
        }

        return  opcion;
    }

    public static String jugadaComputador(){


        int i= (int) (Math.random()*3);
        String jugada;

        List<String> jugadaComputador=Arrays.asList("piedra", "papel","tijera");

        return jugada = jugadaComputador.get(i);


    }

    public static int ganador(int jugadaUsuario, int jugadaComputador){

        if ((jugadaUsuario == 1 && jugadaComputador == 3) || (jugadaUsuario == 2 && jugadaComputador == 1) || (jugadaUsuario == 3 && jugadaComputador == 2)) {
            return GANAELUSUARIO;
        }

        if ((jugadaUsuario == 3 && jugadaComputador == 1) || (jugadaUsuario == 1 && jugadaComputador == 2) || (jugadaUsuario == 2 && jugadaComputador == 3)){
            return GANAELCOMPUTADOR;
        }
        else {

            return EMPATE;

        }

    }

    public  static String instrucciones(){
        String instrucciones;
         return  instrucciones=
                 "\n                                       Hola bienvenid@ a mi Juego de Piedra, Papel o TIjera" +
                 "\n\n\n En el apartado Principal encontraras la opcion para jugar! o ver el registro de tus partidas!" +
                 "\n Al dar click en jugar se desplegara un menu con las 3 opciones Piedra, Papel o Tijera" +
                 "\n\n\n                                                                      ¿PERO COMO SE JUEGA?       " +
                 "\n\n\n es muy simple: la piedra gana a las tijeras, pero es debil contra el papel y contra otra piedra empatan"  +
                 "\n El papel gana a la piedra, pero pierde contra las tijeras y contra otro papel empatan" +
                 "\n las tijeras ganan contra el papel pero pierden contra la piedra y contra otras tijeras empatan";

    }
}
