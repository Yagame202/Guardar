package Aula.ConceitosGerais;
import java.time.LocalDate;
import java.util.Scanner;

public class TipoDATA {
    public static void main(String[] args) {
        LocalDate dataNacimento = LocalDate.of(1994, 02, 25);
        System.out.println("Data de Nascimento: " + dataNacimento);

        LocalDate dataAtual =  LocalDate.now();
        System.out.println("Data Atual: " + dataAtual);

        System.out.println(dataNacimento.isBefore(dataAtual));
        System.out.println(dataNacimento.isAfter(dataAtual));
        
        if(dataNacimento.isBefore(dataAtual)) {
            System.out.println("Data de Nascimento é anterior à Data Atual");
        } else if (dataNacimento.isAfter(dataAtual)) {
            System.out.println("Data de Nascimento é posterior à Data Atual");
        } else {
            System.out.println("Data de Nascimento é igual à Data Atual");
        }
    }
}
