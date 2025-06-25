package Produto;

public class Vendedor extends Usuario {

	private String CNPJ;
	
	public Vendedor( String nome, String login, int senha, String CNPJ) {
		super(nome, login, senha);
		this.CNPJ = CNPJ;
	}
	@Override
	public void exibir(){
	super.toString();	
	System.out.println("nome: " + nome + " | Login:" + login + " | " + "Senha: " + senha + "|" + "Endereço" + "|" + CNPJ.toUpperCase() + "|");
	}
	
}