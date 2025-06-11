package EstudosGerais;
import java.util.Scanner;

public class Funcao {

    Scanner entrada = new Scanner(System.in);

    public void escolha() {
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        System.out.println("Soma = " + soma);

        if (soma % 2 == 0) {
            System.out.println("A soma é par.");
        } else {
            System.out.println("A soma é ímpar.");
        }
    }

    public void calculadora() {
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        int op = entrada.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));break;
            case 3:
                    System.out.println("Resultado: " + ( numero1 / numero2));break;
            case 4:
                System.out.println("Resultado: " + (numero1 * numero2));break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
