package Produto;

public class CorrecaoProduto {
    
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
       if ( preco > 0 ) {
    	   this.preco = preco;
       }else {
    	  System.out.println("Preço invalido ");
       }
    }
       public String toString() {
           return "Produto: " + nome + " | Preço: R$" + preco + " | ";
    }
}