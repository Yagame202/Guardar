package Atividade;

import java.math.BigInteger;
import java.time.LocalDate;

public class Cartao {
    private String titular;
    private String banco;
    private BigInteger numero;
    private LocalDate dataVencimento;
    private String tipo;

    public Cartao(String titular, String banco, String numero, String dataVencimento, String tipo) {
        this.titular = titular;
        this.banco = banco;
        this.numero = new BigInteger(numero);
        this.dataVencimento = LocalDate.parse(dataVencimento);
        this.tipo = tipo;
    }

    public String getTitular() {    
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public BigInteger getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = new BigInteger(numero);
    }
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = LocalDate.parse(dataVencimento);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "titular='" + titular + '\'' +
                ", banco='" + banco + '\'' +
                ", numero=" + numero +
                ", dataVencimento=" + dataVencimento +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}