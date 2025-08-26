package Atividade;
import java.util.*;

public class ListaContatos {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        Integer opcao;

        do {
            System.out.println("\n|== MENU DE CONTATOS ==");
            System.out.println("  |1 - Listar");
            System.out.println("  |2 - Cadastrar");
            System.out.println("  |3 - Alterar");
            System.out.println("  |4 - Remover");
            System.out.println("  |0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine(); // limpa o buffer
            System.out.println("Você selecionou a opção: -->  " + opcao);

            switch (opcao) {

                case 1:
                    if (lista.isEmpty()) {
                        System.out.println("\nNenhum contato cadastrado.");
                    } else {
                        System.out.println("\nLista de contatos:");
                        for (String contato : lista) {
                            System.out.println("| - " + contato + " | ");
                        }
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o nome do contato: ");
                    String nome = entrada.nextLine();
                    lista.add(nome);
                    System.out.println("Contato cadastrado com sucesso!!");
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("\nNenhum contato para alterar.");
                        break;
                    }
                    System.out.print("Digite o nome do contato que deseja alterar: ");
                    String antigoNome = entrada.nextLine();

                    if (lista.contains(antigoNome)) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = entrada.nextLine();

                        int index = lista.indexOf(antigoNome); 
                        lista.set(index, novoNome); 

                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("\nNenhum contato para remover.");
                        break;
                    }
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    String nomeRemover = entrada.nextLine();
                    if (lista.remove(nomeRemover)) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Você saiu...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals(0));

        entrada.close();
    }
}