package edu.bmulim.metodos;

public class Apresentacao {
    /*
     * Objetivo
     * 
     * Apresentar critérios para criaçao de métodos, parâmetrois e visibilidade.
     * 
     * Assuntos:
     * - Qual a proposta do método?
     * - Qual tipo e retorno esperado após executar o método?
     * - Quais parâmetros serão necessários para exercução do método?
     * - O méotdo possui o risco de apresentar alguima exceção?
     * - Qual a visibilidade do método?
     *
     */

     
    /*
     * Todas as ações das aplicações são consideradas métodos
     * 
     * Uma classe é definida por atributos e métodos. Os atributos são, em sua maioria, varáveis de diferentes tipos e valores. Já os métodos correspondem a funções ou sob-rotinas disponíveis de das classes.
     * 
     * Critérios de nomeação de Métodos
     * 
     * Vale lembrar que não são obrigatórios, mas sim recomendados para facilitação de outros programadores que possam vir a trabalhar no projeto em questão.
     * 
     * São eles:
     * 
     *  - Deve ser nomeado como verbo
     *  - Seguir o padrão camelCase(Todas as etras minúsculas com a excessão da primeira letra da segunda palavra Ex>: somarNotas, gerarPlaca)
     *  - Não usar as palavras reservadas
     *  - É bom usar em Inglês
     *  - Não usar dois verbos (ex.: calcularImprimir)
     *
     * NÃO EXISTE EM JAVA O CONCEITO DE MÉTODOS GLOBAIS, LOGO TODOS OS MÉTODOS DEVEM SEMPRE SER DEFINIDOS DENTRO DE UMA CLASSE.
     * 
     * Critérios de definiçao de métodos?
     * 
     * Existe uma convenção estrutural para todos os métodos, sendo ela determindada pelos seguintes aspectos:
     * 
     * - Qual a principal proposta do métodos?
     *  -- Deve se perguntar constantemente até compreender a real finalidade do método.
     * 
     * - Qual tipo de retorno esperado após executar o método?
     *  -- Deve analisar se o método será responsável por retornar algum valor ou não.
     *  *** Caso o método nao retorne nehum valor, ele será representado pela plavra-chave void.
     * 
     * - Quais os parâmetros serão necessários para a execução do métodos?
     *  -- Os métodos as vezes precisam de argumentos como critérios para execução.
     * 
     * - O método possui algum risco de apresentar alguma exceção?
     * -- Excessões são comuns na execuçao de métodos, as vezes é necessário prever e trata a possivel existência de uma exceção.
     * 
     * - Qual a visibilidade do método?
     *  -- Será necessário que o método seja visivel a toda aplicação, somente naquele pacote em questão, através de herança ou somente a nível da própria classe.
     * 
     * Alguns exemplos abaixo:
     */
    
     public double somar(int num1, int num2){
            //Lógica - finalidade do método

            return ... ;
     }

     public void imprimir(String texto){
        //Lógica - finalidade do método
        //Não precisa de um return (void), pois nao retor nenhum tipo de resultado.
     }

     public double dividir(int dividendo, int divisor) throws Exception{
         //Lógica - finalidade do método
         // throws significa que o método possui algum tipo de exceção
     }

     private void metodoPrivado(){
        //Esse método nao pode ser visto por outras classes
     }
        
}
