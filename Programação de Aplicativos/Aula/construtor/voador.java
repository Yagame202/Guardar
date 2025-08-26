package Aula.construtor;

public interface voador {
    void voar(); // Método abstrato que deve ser implementado por classes que implementarem esta interface

    default void pousar() { // Método padrão com implementação
        System.out.println("A aeronave está pousando.");
    }

    static void verificarCombustivel() { // Método estático com implementação
        System.out.println("Verificando o nível de combustível.");
    }
}
