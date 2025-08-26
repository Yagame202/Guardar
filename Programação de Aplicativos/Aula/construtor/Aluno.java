package Aula.construtor;

public class Aluno extends Pessoa { // Atributos específicos de Aluno | Herança da classe Pessoa
    private String matricula;

    public Aluno() {
        super(); // Chama o construtor vazio da classe Pessoa
    } // Construtor vazio

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // Chama o construtor com parâmetros da classe Pessoa
        this.matricula = matricula;
    } // Construtor com parâmetros

    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + matricula + " " + super.toString(); // Chama o toString da classe Pessoa e adiciona a matrícula
    }
}
