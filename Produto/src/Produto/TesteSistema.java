package Produto;

public class TesteSistema {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("José","Jose123",12345);
		Comprador c2 = new Comprador ("Marcos","Mac29482",12345, "Rua das flores - Bloco (B)");
		Vendedor c3 = new  Vendedor ("Kaio","kaop12830",12345, "93.755.187/0001-14");
		
		u1.exibir();
		c2.exibir();
		c3.exibir();

	}

}
