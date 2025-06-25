package Todos;
import java.util.*;
import java.util.Arrays;

public class VetorTemperatura {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] temperatura = new int [5];
		
		for(int i = 0; i < temperatura.length; i++) {
		System.out.println("Digite uma temperatura");
		temperatura[i] = entrada.nextInt();
		}
		System.out.println(Arrays.toString(temperatura));
	} 
}
