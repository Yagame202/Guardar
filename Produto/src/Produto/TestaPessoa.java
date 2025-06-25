package Produto;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Ana", 25);
		Pessoa p2 = new Pessoa ("José", 35);
		
		p2.mostranome();
		
		Pessoa.mostrarTotal();
	}

}
