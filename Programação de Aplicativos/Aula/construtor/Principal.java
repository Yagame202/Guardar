package Aula.construtor;
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Kaio", 31);
        System.out.println("\nNome: " + p1.getNome() + " | Idade: "  +  p1.getIdade()); 

        System.out.println("--------------------");
        p1.setNome("Kaio Silva");
        p1.setIdade(22);
        System.out.println(p1); 
        System.out.println("--------------------");

        Pessoa p2 = new Pessoa("Vitor", 41);
        System.out.println(p2); 
        System.out.println("--------------------");

        Pessoa p3 = new Pessoa("João", 41);
        System.out.println(p3); 
        System.out.println("--------------------");

        Aluno a1 = new Aluno("Gustavo", 20, "123456");
        System.out.println(a1);
        System.out.println("--------------------");
    }
}