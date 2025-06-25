package Produto;

public class Admin extends Usuario {
	
	 static private boolean eAdmin;
		
	 public Admin( String nome, String login, int senha, boolean eAdmin ) {
			super(nome, login, senha);
			this.eAdmin = true;
	 }
}
