package edu.bmulim.operadores;

public class Logicos {
    public static void main(String[] args) {
      /*
       * Operadores logicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
       * 
       * && - operador lógico "e"
       * || - operador lógico "ou"
       * 
       * o resultado será conforme a tabela verdade da matemática:
       * 
       *    Conectivo       Símbolo         Operação Lógica         Valor Lógico
       *     não               ~               negação              Terá valor falso quando a proposição for verdadeira e vice-versa.
       *     e                 ^               conjunção            Será verdadeira somente quando todas as proposições forem verdadeiras.
       *     ou                \/              disjunção            Será verdadeira quando pelo menos uma das proposições for verdadeira.
       *  se ... então         ->              condicional          Será falsa quando a proposição antecedente for verdadeira e a consequente for falsa.
       * ...se somente se ..   <->             bicondicional        Será verdadeira quando ambas as proposições forem verdadeira ou ambas falsas.
       * 
       * Vale ressaltar que a simbologia acima é matemática e nao referente a presente linguagem.
       */

       boolean condicao1 = true;
       boolean condicao2 = false;
        
       if (condicao1 && condicao2) {
            System.out.println("As duas condições sao verdadeiras.");
       } 
       
       if (condicao1 && (7 > 2)) {
            System.out.println("As duas condições sao verdadeiras.");
       } 
       
       if (condicao1 || condicao2) {
            System.out.println("Uma das condições sao verdadeiras.");
       }
       
       if (condicao1 || (7 < 2)) {
            System.out.println("Uma das condições sao verdadeiras.");
        }

       System.out.println("Fim");

    }
}
