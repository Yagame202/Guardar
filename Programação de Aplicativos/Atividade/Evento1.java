package Atividade;
import java.util.*;
public class Evento1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String possuiIngresso = "";
        boolean entrarevento = false;
        String acompanhado = "";
        int idade = 0;
        do{ 
        System.out.println("Você possui ingresso (s/n)?");
        possuiIngresso = entrada.nextLine();

        if(possuiIngresso.equals("s")) {

            System.out.println("Qual sua idade?");
            idade = entrada.nextInt();
            entrada.nextLine();

            if(idade >= 18) {
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Está acompanhado de um maior de idade (s/n)?");
                acompanhado = entrada.nextLine();

                if(acompanhado.equals("s")) {
                    System.out.println("Acesso liberado!");
                } else {
                    System.out.println("Acesso negado!");
                }
            }
        } else {
            System.out.println("Acesso negado!");
        }
        entrarevento = possuiIngresso.equals("s") && (idade >= 18 || acompanhado.equals("s"));
    }while(entrarevento == true);

    }
}
