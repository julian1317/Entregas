package calculadora.app;


import calculadora.dominio.Operador;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Calculadora {
    public static final int SUMA=0;
    public static final int RESTA=1;
    public static final int MULTIPLICACION=2;
    public static final int DIVISION=3;
    public static final int CERRAR=-1;

    public static double leerNumero(){
        double numero = 0; boolean seguirEjecutando;

        seguirEjecutando = true;
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(null,"digite el numero"));
                seguirEjecutando = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"la entrada no es un numero valido","ERROR",JOptionPane.ERROR_MESSAGE);
                seguirEjecutando = true;

            }
            
        }while (seguirEjecutando);

        return numero;
    }
    public static  int ciclo (){
        int ciclo = 0; boolean seguirEjecutando;

        seguirEjecutando = true;
        do {
            try {
                 ciclo = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cantidad de numeros que desea "));

                seguirEjecutando = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"la entrada no es un numero valido","ERROR",JOptionPane.ERROR_MESSAGE);
                seguirEjecutando = true;

            }

        }while (seguirEjecutando);

        return ciclo;


    }



    public static void mostrar(double numero, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje+numero);
    }

    public  static  void mensajeError(){
        JOptionPane.showMessageDialog(null,"no se puede divir por cero","ERROR",JOptionPane.ERROR_MESSAGE);
    }



    public static void main(String[] args) {
        double numero1 = 0; int  operacion;
        boolean seguirEjecutando= true;
        JCheckBox checkbox = new JCheckBox("Redondear");
        List <Object> operar = Arrays.asList("Suma","Resta", "Multiplicacion", "Division", checkbox );


        while (seguirEjecutando){

           operacion= JOptionPane.showOptionDialog(null,"Seleccione la operacion deseada","calcular",0,JOptionPane.QUESTION_MESSAGE,null,operar.toArray(),null);




           if (operacion == CERRAR){ break;}
            int ciclo = ciclo();



           switch (operacion){
               case SUMA:{
                   numero1=Operador.operacion( ciclo , SUMA);
                   mostrar(numero1,"el resultado de su suma es ");

                   break;

               }
               case RESTA:{
                   numero1=Operador.operacion(ciclo , RESTA);
                   mostrar(numero1,"el resultado de su resta es ");
                   break;

               }
               case MULTIPLICACION:{
                   numero1=Operador.operacion(ciclo, MULTIPLICACION);
                   mostrar(numero1,"el resultado de se multiplicacion es ");
                   break;

               }
               case DIVISION:{
                   numero1=Operador.operacion(ciclo , DIVISION);
                   mostrar(numero1,"el resultado de se division es");
                   break;

               }
               case CERRAR:{
                   seguirEjecutando=false;
                   break;

               }





           }



            if(checkbox.isSelected()) {
                int redondeado = (int) Math.round(numero1);
                mostrar(redondeado,"numero redondeado");
            }

       }

    }


}
