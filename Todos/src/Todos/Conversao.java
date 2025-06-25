package Todos;

public class Conversao {
	// Conversão String para Int
	public static void main(String[] args) {
		String texto = "123";
		int numero = Integer.parseInt(texto);

		System.out.println(texto + 10);    // imprime "12310"
		System.out.println(numero + 10);   // imprime 133

		// String -> double
		String outrotexto = "45,99";
		double valor = Double.parseDouble(outrotexto.replace(",", "."));
		System.out.println(valor + 10.0);  // imprime 55.99

		// Int -> String
		int num = 25;
		String numtexto = String.valueOf(num);
		System.out.println(numtexto + " é número");  // imprime "25 é número"
	
		// int -> double
		int num1 = 5;
		double resultado = (double) num1;
		System.out.println(resultado);
		
		// double -> int
		double valor1 = 9.9;
		int inteiro = (int) Math.round(valor1);
		System.out.println(inteiro);
		
	}

}