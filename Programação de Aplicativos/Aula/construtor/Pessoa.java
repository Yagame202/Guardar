package Aula.construtor;

public class Pessoa { //atributos
    private String nome;
    private int idade;
    private static String escola = "Senai";

    public Pessoa(){
    } //construtor vazio

    public Pessoa(String nome, int idade){   //construtor com parametros
    this.nome = nome;
    this.idade = idade;
    }
    public String toString(){    //metodo do tipo String para exibir os dados atravez do return
       return "Nome: " + nome + " | Idade: " + idade + " | Escola: " + escola;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}