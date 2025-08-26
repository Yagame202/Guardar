package Desafio;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataNacimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDate dataNacimento = null;

        do {
            System.out.println("Digite sua data de nascimento (dd/mm/aaaa): ");
            String data = entrada.nextLine();
            DateTimeFormatter dataBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataNacimento = LocalDate.parse(data, dataBR);

            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataNacimento, dataAtual);

            System.out.println("\nIdade: " + periodo.getYears() +
                " anos, " + periodo.getMonths() +
                " meses, " + periodo.getDays() +
                " dias");

        } while (Period.between(dataNacimento, LocalDate.now()).getYears() <= 18);
    }
}   