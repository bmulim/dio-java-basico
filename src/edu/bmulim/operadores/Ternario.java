package edu.bmulim.operadores;

public class Ternario {
    public static void main(String[] args) {
        
        //Rata-se de uma forma resumida do if

        int a, b;

        a = 6;
        b = 7;

        String resultado = "";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        

        System.out.println(resultado);

        /*---------------------- */

        String acertiva = a==b ? "verdadeiro" : "falso";

        System.out.println(acertiva);

    }

}
