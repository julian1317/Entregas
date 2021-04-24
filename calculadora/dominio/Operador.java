package calculadora.dominio;

import calculadora.app.Calculadora;

public class Operador {

    public static double operacion (int ciclo, int operador){
        double resultado = Calculadora.leerNumero(); ;

       for ( int i = 1; i < ciclo; i ++){
           double numero = Calculadora.leerNumero();
           switch (operador){
               case Calculadora.SUMA:{
                   resultado =  resultado + numero;
                   break;
               }
               case Calculadora.RESTA:{
                   resultado = resultado - numero ;
                   break;
               }
               case Calculadora.MULTIPLICACION:{
                   resultado =resultado * numero ;
                   break;
               }
               case Calculadora.DIVISION:{
                   resultado =  resultado / numero ;
                   break;
               }
           }

       }




        return resultado;

    }
}
