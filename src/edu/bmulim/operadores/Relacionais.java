package edu.bmulim.operadores;

public class Relacionais {
    public static void main(String[] args) {
        
        /*
         * Operadores relacionais avaliam a relação entre duas ou mais variáveis ou expressões. Definem se o operando à esquerda é igual (==), diferente (!=), menor (<), menor ou igual (<=), maior (>), maior ou igual (>=) ao operando da esquerda, retornando um valor booleano como resultado.
         * 
         * Ex.:
         */

         int numero1 = 1;
         int numero2 = 2;

         boolean simNao;

        simNao = numero1 == numero2;
            System.out.println("numero1 é igual a numero2? " + simNao);
        
        simNao = numero1 != numero2;
            System.out.println("numero1 é diferente a numero2? " + simNao);

        simNao = numero1 < numero2;
            System.out.println("numero1 é menor que numero2? " + simNao);

        simNao = numero1 <= numero2;
            System.out.println("numero1 é menor ou igual ao numero2? " + simNao);

        simNao = numero1 > numero2;
            System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 >= numero2;
            System.out.println("numero1 é maior ou igual ao numero2? " + simNao);

        /*
         * Observe que a posição das variáveis ou expressões importam para a relação. 1<2 é diferente de 2<1.
         * 
         * Operadores relacionais normalmente são utilizadas para realizaçao de validações.
         * 
         * Ex2.:
         */

         String nomeUm = "BRUNO";
         String nomeDois = "Bruno";

            System.out.println(nomeUm == nomeDois);
        
        nomeDois = "BRUNO";
            
            System.out.println(nomeUm == nomeDois);

            /*
             * Observe que possivel também relacionar conteúdo, e que há a diferenciação entre caracteres maiúsculos e minusculos.
             * 
             * Quando se relaciona objetos existe uma expressão diferente.
             * 
             * vejamos:
             */
        
        nomeDois = new String("BRUNO");

            boolean compara;

            compara = nomeUm == nomeDois;

            System.out.println(compara + ". Sem equals");
        
            System.out.println(nomeUm.equals(nomeDois) + ". Com equals");
    
    }
}
