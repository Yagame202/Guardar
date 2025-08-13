package Desafio;
import java.util.*;

/*Felipe Cardoso guaresi
 *Gustavo Cardoso guaresi
 */
public class Drone  {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
ArrayList<String> historico = new ArrayList<>();

int opcao1 = 0;
int opcao = 0;
int X = 0, Y = 0;

do{
    System.out.println("----Menu-----");
    System.out.println("1 - Decolar:");
    System.out.println("2 - Sair:");
    System.out.println("-------------");
    System.out.println("");
    opcao1 = entrada.nextInt();

switch (opcao1) {
    case 1:
        do{
    System.out.println("");
    System.out.println("----MENU DE COMANDOS----");
    System.out.println("1 - Comando de movimentação para frente: Y = Y + 1\r\n" + //
                "2 - Comando de movimentação para trás: Y = Y - 1\r\n" + //
                "3 - Comando de movimentação para direita: X = X + 1\r\n" + //
                "4 - Comando de movimentação para esquerda: X = X - 1");
    System.out.println("| Digite 5 - Pousar |");
    System.out.println("-------------------------");
    System.out.println("");
    opcao = entrada.nextInt();

    switch (opcao) {
        case 1: 
          Y += 1;  
          historico.add("Frente");
          break;

        case 2:
          Y -= 1;  
          historico.add("Trás");
          break;
        case 3:
         X += 1;
         historico.add("Direita");
         break;

        case 4:
         X -= 1;
         historico.add("Esquerda");
         break;

    }

}while(opcao != 5);
 System.out.println("X  " + X + "  Y  " + Y);
 System.out.println("Historico" + historico);
        break;

        case 2:
        System.out.println("Saindo...");break;
    default: System.out.println("Opção invalida");
        break;
}
   }
   while(opcao1 != 2); }
}

