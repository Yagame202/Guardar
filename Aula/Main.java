package EstudosGerais;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Funcao Classe = new Funcao();
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("\n ---- MENU ---- ");
			System.out.println("1- Ver se numero e Par ou Impar: ");
			System.out.println("2- Calculadora: " );
			System.out.println("3- Atividade 2: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			case 1: Classe.escolha(); break;
			case 2: Classe.calculadora(); break;
			case 3:
			}
		}while (opcao !=5);
		System.exit(opcao);
	}

}
