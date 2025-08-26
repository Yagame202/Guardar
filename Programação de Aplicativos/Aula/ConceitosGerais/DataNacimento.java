package Aula.ConceitosGerais;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class DataNacimento {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);  
      System.out.println("Digite sua data de nascimento (dd/mm/aaaa): "); 
      String data = entrada.nextLine();
      System.out.println("Data de Nascimento: " + data);

        DateTimeFormatter dataBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNacimento = LocalDate.parse(data, dataBR);
        System.out.println("Data de Nascimento: " + dataNacimento);

        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNacimento, dataAtual);

        System.out.println("Idade: " + periodo.getYears() + 
        " anos, " + periodo.getMonths() + 
        " meses, " + periodo.getDays() + 
        " dias");

    }
}
