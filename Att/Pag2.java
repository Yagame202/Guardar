package soma;
import java.util.*;
import java.util.Scanner;

public class Pag2 {
    public static void main(String[] args) {
        Pag1 Calculadora = new Pag1();
        Scanner  entrada = new Scanner(System.in);
		int opcao =0;
		do {
		System.out.println("\n ---- MENU ---- ");
		System.out.println("1- Calculadora: ");
		System.out.println("2- Ver se numero e impar ou par " );
		System.out.println("3- SAIR " );
		System.out.println("Escolha uma opção: ");
		
		 opcao = entrada.nextInt();
		 entrada.nextLine();
		 
		switch(opcao) {
		case 1:  Calculadora.Escolha(); break;
		case 2:  Calculadora.Numeroimparopar(); break;
		case 3: System.out.println("Voce saiu "); System.exit(1);
		default: System.out.println("Escolha uma Opção correta "); break;
		}
	}while(opcao != 3);
		entrada.close();
	}
}