package soma;
import java.util.*;

public class Pag1 {
    Scanner entrada = new Scanner(System.in);
    public ArrayList<Integer> ArmazSoma = new ArrayList<>();
    public ArrayList<Integer> ImparPar = new ArrayList<>();

    public void Escolha() {
        System.out.println("Escolha o numero A");
        int a = entrada.nextInt();
        ArmazSoma.add(a);

        System.out.println("Escolha o numero B");
        int b = entrada.nextInt();
        ArmazSoma.add(b);

        System.out.println("Escolha 1 para Subtrair, 2 para Somar, 3 para Multiplicar, 4 para Dividir");
        int esco = entrada.nextInt();

        int resultado;
        switch (esco) {
            case 1:
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = a / b;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void Numeroimparopar() {
        System.out.println("Digite o numero");
        int numero = entrada.nextInt();
        ImparPar.add(numero);

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }
}
