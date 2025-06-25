package teste1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) {
        // Exemplo String - manipulação de texto
        String texto = "Olá Mundo!";
        System.out.println("Texto original: " + texto);
        System.out.println("Texto maiúsculo: " + texto.toUpperCase());
        System.out.println("Contém 'Mundo'? " + texto.contains("Mundo"));
        System.out.println("Tamanho do texto: " + texto.length());
        System.out.println();

        // Exemplo Math - operações matemáticas
        double num = 9.0;
        System.out.println("Número: " + num);
        System.out.println("Raiz quadrada: " + Math.sqrt(num));
        System.out.println("Número aleatório entre 0 e 1: " + Math.random());
        System.out.println("Número 5.7 arredondado: " + Math.round(5.7));
        System.out.println();

        // Exemplo ArrayList - lista dinâmica
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        System.out.println("Lista de frutas: " + frutas);
        System.out.println("Primeira fruta: " + frutas.get(0));
        frutas.remove("Banana");
        System.out.println("Após remover Banana: " + frutas);
        System.out.println("Tamanho da lista: " + frutas.size());
        System.out.println();

        // Exemplo HashMap - mapa chave-valor
        HashMap<String, Integer> idadePessoas = new HashMap<>();
        idadePessoas.put("João", 25);
        idadePessoas.put("Maria", 30);
        idadePessoas.put("Pedro", 20);
        System.out.println("Idades: " + idadePessoas);
        System.out.println("Idade da Maria: " + idadePessoas.get("Maria"));
        idadePessoas.remove("Pedro");
        System.out.println("Após remover Pedro: " + idadePessoas);
        System.out.println();

        // Exemplo Scanner - entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá " + nome + "! Você tem " + idade + " anos.");
        
        scanner.close();
    }
}

