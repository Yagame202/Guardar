package Produto;

public class Pessoa {
	String nome; //variavel do objeto
	int idade;
	static String total;
	static int totalPessoa; // variavel da classe (esta dento da classe)
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		totalPessoa++;
		
	}
	void mostranome() {
		System.out.println("Nome:" + nome);
	}

static void mostrarTotal() {
	
	System.out.println("Total de pessoas" + total);
	}
}