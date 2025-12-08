// 1. Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
package desafios;

import java.sql.SQLOutput;

public class Pessoa {

    void exibirMensagem() {
        System.out.println("Olá mundo!");
    }
}


// 2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
class Calculadora {

    public int dobrarNumero(int numero) {
        return numero * 2;
    }
}

//3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
// para exibir a ficha técnica, avaliar a música e calcular a média de avaliações
class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;
    double somaDasAvaliacoes;

    void exibeFichaTecnica () {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("AnoLancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
        System.out.println("NumAvaliacoes: " + numAvaliacoes);
    }

    void avalia(double nota) {
         somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }

}

//4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
class Carros {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica () {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade (){
        return 2025 - ano;
    }
}

// 5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno,
//  atribua valores aos seus atributos e utilize o método para exibir as informações.

class Aluno {
    String nome;
    int idade;

    void exibeInformacoes (){
        System.out.println("Nome: " + nome);
        System.out.println("Idade " + idade);
    }
}
