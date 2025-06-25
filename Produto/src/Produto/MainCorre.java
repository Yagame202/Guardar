package Produto;
import java.util.*;
public class MainCorre {

	public static void main(String[] args) {
		String texto = "Dados de produto:";
		CorrecaoProduto co = new CorrecaoProduto();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		co.setNome(entrada.nextLine());
		
		System.out.println("Digite o preço:");
		co.setPreco(entrada.nextDouble());
		
		System.out.println("|" + texto.toUpperCase() + "|" );
		System.out.println(co);
	}
}
