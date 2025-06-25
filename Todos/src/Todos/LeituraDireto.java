package Todos;
import java.util.*;
public class LeituraDireto {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
	
		System.out.println("Digite sua idade");
		String leitura = entrada.nextLine();
		int idade = Integer.parseInt(leitura);
		
		System.out.println("Digite sua nome");
		String nome = entrada.nextLine(); // Problema!
		
		System.out.println("Idade:" + idade);
		System.out.println("Nome:" + nome);
	}

}
