package Produto;

public class Usuario {

	protected String nome;
	protected String login;
	protected int senha;
	
	public Usuario (String nome, String login, int senha) {
	this.nome = nome;
	this.login = login;
	this.senha = senha;
	}
	public void exibir(){
	System.out.println( "nome: " + nome + " | Login:" + login + " | " + "Senha: " + senha + "|");	
	}
}
