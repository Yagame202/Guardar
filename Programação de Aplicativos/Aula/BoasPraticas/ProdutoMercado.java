package Aula.BoasPraticas;
import java.time.LocalDate;
import java.util.Objects;

public class ProdutoMercado {
    private String nomeCompleto;
    private Double preco;
    private Integer quantidadeEstoque;
    private LocalDate dataDeValidade;
    private final Double PERCENTUAL_TAXA_PARCELAMENTO = 1.5;

    public ProdutoMercado(String nomeCompleto, Double preco, Integer quantidadeEstoque, LocalDate dataDeValidade) {
        this.nomeCompleto = nomeCompleto;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }
    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Produto Mercado{" +
                " | Nome Completo: " + nomeCompleto + '\'' +
                ",| Preço: " + preco +
                ",| Quantidade em estoque: " + quantidadeEstoque +
                ",| Data de Validade:" + dataDeValidade +
                '}';
    }
     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProdutoMercado that = (ProdutoMercado) obj;
        return Objects.equals(nomeCompleto, that.nomeCompleto) &&
               Objects.equals(preco, that.preco) &&
               Objects.equals(quantidadeEstoque, that.quantidadeEstoque) &&
               Objects.equals(dataDeValidade, that.dataDeValidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto, preco, quantidadeEstoque, dataDeValidade);
    }
}