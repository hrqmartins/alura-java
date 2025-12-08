package desafios;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.exibirMensagem();
    }


}

// Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
class Principal2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

       int resultado = calculadora.dobrarNumero(9);
        System.out.println(resultado);
    }
}

//Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica,
// avaliar a música e calcular a média de avaliações
class Princiapl3 {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}


class Principal4 {
    public static void main(String[] args) {
        Carros meuCarro = new Carros();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}

class Principal5 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.idade = 18;
        aluno.nome = "Henrique Martins";

        aluno.exibeInformacoes();
    }
}