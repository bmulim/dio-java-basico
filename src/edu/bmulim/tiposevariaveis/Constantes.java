package edu.bmulim.tiposevariaveis;

public class Constantes {
    public static void main(String[] args) {
        int numero = 5;
            System.out.println(numero);
        
        numero = 10;
            System.out.println(numero);

            /*Nesse primeiro bloco observe que mesmo atribuindo um valor a varável ´numero´ podemos mudar seu valor no decorrer do código */

            double VALOR_DE_PI = 3.14;

            VALOR_DE_PI = 3.1415;

                System.out.println(VALOR_DE_PI);

            final double VALOR_DE_PI = 3.14;

            VALOR_DE_PI = 3.1415;

                System.out.println(VALOR_DE_PI);

            /*
             * Ja nesse bloco, mostra que apenas usando a convenção nao torna VALOR_DE_PI em uma constante, somente após a incluirmos a palavra reservada ´final´, dessa forma nao podemos alterar seu valor original no decorrer do código, caso ocorra essa tentiva ocorrerá erro.
             */
        
    }
}
