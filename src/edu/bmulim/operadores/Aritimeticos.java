package edu.bmulim.operadores;

public class Aritimeticos {
    public static void main(String[] args) {
        //adição + -> realiza a operação de adição

        double soma;

        soma = 1 + 1;

            System.out.println(soma);
        
        soma = 1.75 + 2.5;
        
            System.out.println(soma);


        /*O operador de adição quando usado entre variaveis do tipo texto realizará a concatenação. */

        String concatenacao;

        concatenacao = "?";
            System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
            System.out.println(concatenacao);
        
        concatenacao = 1 + "1" + (1 + 1);
            System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);
        
        //Observe que ao atribuir um unico caractere ele concatena, para solucionar devemos colocar em evidencia - usar [{()}].
    }
}
