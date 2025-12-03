package desafios;

import java.util.Random;
import java.util.Scanner;


/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado. */
public class Modulo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/* Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo" */
class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("O seu número é positivo!");
        } else {
            System.out.println("Seu número é negativo");
        }
    }
}


/* Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou
o segundo é maior. */
class Comparacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o PRIMERIO numero inteiro");
        int primeiroNumero = leitor.nextInt();

        System.out.println("Digite o SEGUNDO numero inteiro");
        int segundoNumero = leitor.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O seu primeiro número " + primeiroNumero + " é MAIOR do que o segundo número " + segundoNumero);
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("O seu primerio número " + primeiroNumero + " é MENOR do que seu segundo número " + segundoNumero);
        } else {
            System.out.println("O seu primeiro número é IGUAL ao segundo número.");
        }

    }
}


/* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário]
 e realize o cálculo da área com base na opção selecionada. */
class CalculadoraArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                
                MENU DA CALCULADORA\n
                1. Calcular área do quadrado
                2. Calcular área do circulo
                Escolha uma opção: 
                """);
        int escolhaUsuario =  leitor.nextInt();

        if (escolhaUsuario == 1) {
            System.out.println("CALCULO DA AREA DO QUADRADO\n");
            System.out.println("Digite o primeiro valor do lado do quadrado");
            double primerioQuadrado = leitor.nextDouble();

            System.out.println("Digite o segundo valor do lado do quadrado");
            double segundoQuadrado = leitor.nextDouble();

            double resultadoQuadrado = (primerioQuadrado * segundoQuadrado);

            System.out.println("A área do quadrado é: " + resultadoQuadrado);
        } else if (escolhaUsuario == 2) {
            System.out.println("CALCULO DA AREA DO CIRCULO\n");
            System.out.println("Digite o valor do raio");
            double valorRaio = leitor.nextDouble();

            double resultadoCirculo = (valorRaio * valorRaio) * 3.14;
            System.out.println("A área do circulo é: " + resultadoCirculo);
        } else {
            System.out.println("Digite uma opção valida do menu");
        }
    }
}


/* Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */
class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}


/* Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente. */
class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se ele é par ou impar");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else{
            System.out.println("IMPAR"
            );
        }
    }
}


/* Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */
class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}