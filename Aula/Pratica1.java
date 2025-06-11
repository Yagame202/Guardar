package Todos;
import java.util.*;
public class Pratica1 {
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<>();
		
		int numero1 = 0;
		
		 do {
			System.out.println("Digite (0) se quiser sair");
			    numero1 = Integer.parseInt(entrada.nextLine());
			    if(numero1 != 0) {
			    	numero.add(numero1);
			    	System.out.println("Numero ADD");
			    	
			    }
			    
			}while(numero1 != 0);
		 
		 	int soma = 0;
		 	for(int n : numero) {
		 		soma += n;
		 		System.out.println("Soma:" + soma);
		 	}
			    entrada.close();
				}
			}	