import java.util.Scanner;

public class LoopFOR {
    public static void main(String[] args) {
        // Instanciar a classe
        Scanner leitura = new Scanner(System.in);
        // Atributos
        double mediaAvaliacao = 0;
        double nota = 0;

        // Laço de Repetição ForI
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        // Output
        System.out.println("Média de avaliações " + mediaAvaliacao/3);


    }
}
