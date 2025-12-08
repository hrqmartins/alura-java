public class Main {

    public static void main(String[] args) {
        // Instanciar a classe
        Filme favorito = new Filme();

        // Atribuir dados
        favorito.nome = "The Matrix";
        favorito.anoDeLancamento = 1999;
        favorito.duracaoEmMinutos = 135;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica(); // Exibir a ficha tecnica
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " + favorito.pegaMedia());
    }

}