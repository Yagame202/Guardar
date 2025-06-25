package Todos;
import java.util.*;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite um numero");
		String leitura = entrada.nextLine();
		
		int numero = Integer.parseInt(leitura);
		
		if(numero % 2 == 0) {
			System.out.println("É par");
		}
		else {
			System.out.println("É impar");
		}
	
	}
}
