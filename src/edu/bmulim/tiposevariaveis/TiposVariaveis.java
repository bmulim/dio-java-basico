package edu.bmulim.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        /* tipos primitivos
        * int
        * byte
        * short
        * long
        * float
        * double
        * boolean
        * char
        * 
        * Esses tipos nao sao considerados objetos.
        */

        byte idade  = 36;
        short ano = 2024;
        int cep = 21070333;
        long cpf = 12345678900L;
        float pi = 3.14F;
        double salarioMinimo = 1400.25;
        
            short numeroCurto = 1;
            int numeroNormal = numeroCurto; 
        // short numeroCurto2 = numeroNormal;
            short numeroCurto2 = (short) numeroNormal;

        /* No caso acima a mudança de tipo short >> int e apos int >>> short, apresentou erro já que o int consegue comportar o short, mas o inverso não é possivel pela ausencia de espaço. 
        * 
        * na linha 27 tem o exemplo do casting, que auxilia na correção desse erro, por´me tal técnica não é muito comum.
        */
    }
}
