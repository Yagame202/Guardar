package teste1;

import java.util.HashMap;
import java.util.Scanner;

public class TESTE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> pessoas = new HashMap<>();

        System.out.println("Cadastro de pessoas (nome e idade)");

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            pessoas.put(nome, idade);
            System.out.println("Pessoa cadastrada com sucesso!\n");
        }

        System.out.println("\nLista de pessoas cadastradas:");
        for (String chave : pessoas.keySet()) {
            System.out.println("Nome: " + chave + " | Idade: " + pessoas.get(chave));
        }

        scanner.close();
    }
}

