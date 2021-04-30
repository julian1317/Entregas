package PiendraPapelOTIjera.app;

import PiendraPapelOTIjera.dominio.Funcionamiento;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;



public  class Jugar {

    public static final int INSTRUCCIONES = 0;
    public static final int JUGAR = 1;
    public static final int RESULTADOS = 2;
    public static final int CERRAR = -1;



    public static void main(String[] args) {
        int seleccion;
        boolean seguirEjecutando= true;
        int ganadasTotalesUsuario=0, ganadasTotalesComputador=0, empatesTotales=0;

        while (seguirEjecutando){
            List <String> seleccionar = Arrays.asList("instrucciones","jugar", "registro");

            seleccion= JOptionPane.showOptionDialog(null,"Bienvenido al Piedra Papel o Tijera","POO - Piedra, Papel o Tijera",0,JOptionPane.QUESTION_MESSAGE,null,seleccionar.toArray(),null);

            switch (seleccion){
                case INSTRUCCIONES:{

                    JOptionPane.showMessageDialog(null,Funcionamiento.instrucciones());


                    break;
                }

                case JUGAR:{
                    String jugada,jugada2;

                    List<Object> jugadas = Arrays.asList("Piedra", "Papel", "Tijera");

                    jugada = (String) JOptionPane.showInputDialog(null,"selecciona tu jugada","jugada",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"piedra","papel", "tijera"},null);
                    int jugadaUsuario = Funcionamiento.jugada(jugada);
                    jugada2 = Funcionamiento.jugadaComputador();
                    int jugadaComputador = Funcionamiento.jugada(jugada2);
                    int resultado = Funcionamiento.ganador(jugadaUsuario, jugadaComputador);

                    if (resultado==Funcionamiento.GANAELUSUARIO){
                        ganadasTotalesUsuario= ganadasTotalesUsuario +1;
                        JOptionPane.showMessageDialog(null,"Tu seleccionaste: "+jugada+"\n La maquina selecciono: "+ jugada2+"\n \n GANASTE!");

                    }
                    if (resultado==Funcionamiento.GANAELCOMPUTADOR){
                        ganadasTotalesComputador=ganadasTotalesComputador +1;
                        JOptionPane.showMessageDialog(null,"Tu seleccionaste: "+jugada+"\n La maquina selecciono: "+ jugada2+"\n \n PERDISTE!");
                    }
                    if(resultado==Funcionamiento.EMPATE){
                        empatesTotales=empatesTotales +1;
                        JOptionPane.showMessageDialog(null,"Tu seleccionaste: "+jugada+"\n La maquina selecciono: "+ jugada2+"\n \n EMPATE!");
                    }
                    break;

                }
                case RESULTADOS:{

                    JOptionPane.showMessageDialog(null,"TU:  "+ganadasTotalesUsuario+" partidas ganadas"+"\n La computadora: "+ ganadasTotalesComputador+" partidas gandas"+
                            "\n Empates: "+ empatesTotales+ " partidas");

                    break;
                }
                case CERRAR:{
                    seguirEjecutando=false;
                    break;

                }
            }




            }







    }

}
