package Aula.construtor;

public class Aviao implements voador {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing 747", 416);
        aviao.voar();
        aviao.pousar();
        voador.verificarCombustivel();
        System.out.println(aviao);
    }
    private String modelo;
    private int capacidade;

    public Aviao(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    @Override
    public void voar() {
        System.out.println("O avião " + modelo + " está voando com capacidade para " + capacidade + " passageiros.");
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Capacidade: " + capacidade;
    }
}