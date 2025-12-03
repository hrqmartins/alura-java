import java.util.Scanner;

public class LoopWHILE {
    public static void main(String[] args) {
        // Instanciar a classe
        Scanner leitura = new Scanner(System.in);
        // Atributos, usa o 0 para inicializar ja que vai acumular
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        // Laço de Repetição While
        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            // Condição para o -1 nao somar junto com a avaliacao
            if (nota != -1) {
                mediaAvaliacao += nota;
            totalDeNotas++;
        }
    }
        // Output
        System.out.println("Média de avaliações " + mediaAvaliacao/totalDeNotas );

    }
}
