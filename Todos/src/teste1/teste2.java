package teste1; 

import java.util.*;

public class teste2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, Integer> pessoa = new HashMap<>();
        
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();  

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();     

        
        pessoa.put(nome, idade);

        System.out.println("Dados inseridos:");
        for (String chave : pessoa.keySet()) {
            System.out.println("Nome: " + chave + ", Idade: " + pessoa.get(chave));
        }
        entrada.close();
    }
}
