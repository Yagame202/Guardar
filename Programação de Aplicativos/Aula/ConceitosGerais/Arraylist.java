package Aula.ConceitosGerais;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>(); // Criação do ArrayList

        // Adicionando elementos à lista
        contatos.add("Vitor");
        contatos.add("João");
        contatos.add("Maria");

        // Impressão direta da lista
        System.out.println("| Lista normal |");
        System.out.println(contatos);

        // Impressão com for tradicional
        System.out.println("| Lista com o (for) |");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i));
        }

        // Impressão com foreach
        System.out.println("| Lista com o (Foreach) |");
        for (String contato : contatos) {
            System.out.println(contato);
        }

        // Alteração de nome
        System.out.println("| Alterando nome da lista |");
        contatos.set(0, "Vitor Freitas");
        System.out.println(contatos.get(0));

        // Remove elemento
        System.out.println("| Removendo elemento |");
        contatos.remove(0);
        System.out.println(contatos.get(0));

        // Busca no Array
        System.out.println("| Busca no Array |");
        System.out.println(contatos.contains("Maria"));
        System.out.println(contatos.indexOf("Maria"));
    }
}
