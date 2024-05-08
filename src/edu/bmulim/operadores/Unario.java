package edu.bmulim.operadores;

public class Unario {
    public static void main(String[] args) {
        int numero = 5;

            //Operador de valor negativo

            numero = - numero;

            System.out.println(- numero);

            //imprimir da forma acima NÃO ALTERA O VALOR, APENAS ACRESCE O -

            System.out.println(numero);
        
            //voltando para valor positivo

            numero = numero * (-1);

            //o sinal de + vai ser lido com operador de adição em JAVA, tendo entao que realizar uma operação matemática


        //booleanos

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);
        
    }
}
