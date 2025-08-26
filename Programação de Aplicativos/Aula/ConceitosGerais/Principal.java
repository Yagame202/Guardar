package Aula.ConceitosGerais;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Principal {
    public static void main(String[] args) {
        // Usando Integer para números pequenos
        // que cabem dentro do limite de Integer
        Integer numeroPequeno = 123456789;
        System.out.println(numeroPequeno);

        // Usando Long para números maiores que Integer
        // mas ainda dentro do limite de Long
        Long numeroMedio = 1234567890123456789L;
        System.out.println(numeroMedio);

        // Usando BigInteger para números muito grandes
        // que excedem o limite de Long
        BigInteger numeroGrande = new BigInteger("1234567890123456789012345678901234567890");
        System.out.println(numeroGrande);

        BigInteger numeroGrandeComVirgula = new BigDecimal("1234567.89012345678901234567890")
                .toBigInteger(); // Converte BigDecimal para BigInteger
        System.out.println(numeroGrandeComVirgula);
    }
}
