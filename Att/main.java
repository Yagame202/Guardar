package soma;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria o Scanner

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt(); // lê o número digitado

        Soma somarnumeros = new Soma(); // cria objeto da classe Verificador
        somarnumeros.verificarParOuImpar(numero);     // chama o método com o número informado

        entrada.close(); // fecha o Scanner (boa prática)
    }
}
