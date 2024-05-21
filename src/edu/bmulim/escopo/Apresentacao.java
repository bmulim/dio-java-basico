package edu.bmulim.escopo;

public class Apresentacao {
    /*
    Apresentação

    Objetivo

    Identificar a localização mais conveniente para a escrita de algoritmos necessário para o nosso programa.

    Assuntos

    - Escopo de classe
    - Escopo de método
    - Escopo de fluxo

     */

     /* O que é escopo?

    A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução, ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

    Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto, acessíveis por todos os métodos.

    Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

    Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos, seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.
     
    
    */
    public class Conta {
        //variavel da classe conta
        double saldo=10.0;
        
        public void sacar(Double valor) {
            //variavel local de método
            double novoSaldo = saldo - valor;
        }
        
        public void imprimirSaldo(){
            //disponível em toda classe
            System.out.println(saldo);
            //somente o método sacar conhece esta variavel
            System.out.println(novoSaldo);
        }

        public double calcularDividaExponencial(){
            //variável local de método
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variável com valor zero
            for(int x=1; x<=5; x++) {//x variável de escopo de fluxo
                //esta variável será reiniciada a cada execução for
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            //escopo de fluxo
            //x e valorCalculado nunca estarão disponíveis fora do for
            
            return valorMontante;
        }
    } 
    
}
