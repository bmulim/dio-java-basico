package edu.bmulim.anatomiadeclasses;
public class MinhaClasse {
    public static void main(String[] args) {
       
        //padrões de  nomeação de variáveis

        String meuNome = "Bruno";

       int anoFabricacao = 2022;

       boolean simNao; //True ou False

       anoFabricacao = 2018; //apenas uma atribuição de uma variável

       String prmeiroNome = "Bruno";
       String segundoNome = "Mulim";

       String nomeCompleto = nomeCompleto(prmeiroNome, segundoNome);

       System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String prmeiroNome, String segundoNome){
        return "Resultado do método: " + prmeiroNome.concat(" ").concat(segundoNome);

        /* no return acima é possivel ver duas formade concatenação */
    }
}
