package Produto;
 
public class Comprador extends Usuario {
	protected String endereco;
	
	public Comprador( String nome, String login, int senha, String endereco) {
		super(nome, login, senha);
		this.endereco = endereco;
	}	
	@Override
	public void exibir(){
	super.toString();	
	System.out.println("nome: " + nome + " | Login:" + login + " | " + "Senha: " + senha + "|" +"Endereço" + "|" + endereco.toUpperCase() + "|");
	}
	
}
