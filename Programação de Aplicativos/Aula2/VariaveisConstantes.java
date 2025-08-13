package Aula2;
public class VariaveisConstantes {
    public static void main(String[] args) {
    String nome = "Vitor";
    System.out.println("Meu nome é: " + nome);
    nome = "João";
    System.out.println("O nome foi alterado para: " + nome);
    final double PI = 3.14;
    /*PI = 20; Não pode ser alterada pois é Final(Costante) */
    System.out.println("O valor de PI é: " + PI);
    
    //Tipo de dados
    int idade = 12;
    double nota = 8.5;
    float outroNumero = 10.5f;
    char letra = 'A';
    byte numero1 = 1;
    short numero2 = 2;
    }
}
