package Aula.BoasPraticas;
import java.time.LocalDate;

public class Pratica {
  public static void main(String[] args) {
    ProdutoMercado p1 = new ProdutoMercado("Arroz", 10.0, 100, LocalDate.of(2025, 12, 31));
    System.out.println(" HASH 1: " +p1.hashCode());
    ProdutoMercado p2 = new ProdutoMercado("Arroz", 10.0, 100, LocalDate.of(2025, 12, 31));
    System.out.println(" HASH 2: " + p2.hashCode());

    System.out.println("Comparação: " + p1.equals(p2));
  }
  /*public static void verificarParouImpar(int numero){ // metodo vazio para fzr a verificação de um numero par ou impar.
    if (numero % 2 == 0){
        System.out.println("\nO numero " + numero + " é par");
    }else {
        System.out.println("\nO numero " + numero + " é impar");
    }
  }*/
  
}
