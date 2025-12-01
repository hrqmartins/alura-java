/*
Em Java, a manipulação eficiente de variáveis é crucial para armazenar dados em memória. Os tipos primitivos, como inteiros, ponto flutuante,
char e boolean, desempenham papéis específicos. A classe String é essencial para operações com textos. O casting resolve conflitos de tipos,
permitindo conversões explícitas.
Essas habilidades formam a base para o desenvolvimento eficaz de programas em Java, por isso criamos atividades práticas (não obrigatórias) para
você praticar. Vamos praticar?
*/

package challenge;

// 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
public class Modulo2 {
    public static void main(String[] args) {
        // Atributos
        double nota1 = 8.75;
        double nota2 = 6.50;
        double media = (nota1 + nota2) / 2;
        // Output
        System.out.println("Media : " + media);
    }

    // 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
    public static class Casting {
        public static void main(String[] args) {
            // Atributos
            double numeroDouble = 15.7;
            int numeroInteiro = (int) numeroDouble;
            // Output
            System.out.println("2. Casting de double para int: " + numeroInteiro);
        }
    }

    // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
    public static class Palavras {
        public static void main(String[] args) {
            // Atributos
            char letra = 'A';
            String palavra = " Dra. Anelise";
            String mensagem = (letra + palavra + " é uma excelente advogada.");
            // Output
            System.out.println(mensagem);


        }
    }

    /* 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o
    preço do produto pela quantidade e apresente o resultado em uma mensagem. */
    public static class Produto{
            public static void main(String[] args) {
                // Atributos
                double precoProduto = 100.99;
                int quantidade = 4;
                double total = (precoProduto * quantidade);
                String mensagem = ("O valor total do produto é R$: " + total);
                // Output
                System.out.println(mensagem);
            }
        }

        /* 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é
        equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/
        public static class ConversaoDolaresReais{
            public static void main(String[] args) {
                // Atributos
                double valorEmDolares = 54.75;
                double conversaoReais = (valorEmDolares * 4.94);
                String mensagem = "O valor da conversão de (USD para R$) é de R$: " + String.format("%.2f", conversaoReais);
                // Output
                System.out.println(mensagem);
            }
        }

        /* Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
         Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
         Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto. */
        public static class CalculoDesconto {
            public static void main(String[] args) {
                // Atributos
                double precoOriginal = 699.79;
                double percentualDesconto = 25;
                double desconto = (precoOriginal * percentualDesconto)/100;
                double precoDesconto = precoOriginal - desconto;
                String mensagem = "Desconto aplicado com sucesso! agora o preço final ficou em R$: " + String.format("%.2f", precoDesconto);
                // Output
                System.out.println(mensagem);
            }
        }

/*
A trabalhar com variáveis: recurso utilizado para armazenar valores em memória;

Sobre tipos primitivos:
inteiros (byte, short, int, long);
ponto flutuante (double e float);
char: contém um único caractere;
boolean: recebe 2 valores, true ou false;
Como representar textos em Java, utilizando a classe String;

A realizar casting de valores, para resolver situações de tipos incompatíveis no momento de realizar um cálculo ou atribuição de uma variável */


}
