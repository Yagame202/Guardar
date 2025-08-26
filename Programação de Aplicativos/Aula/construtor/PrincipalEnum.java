package Aula.construtor;
import Aula.construtor.DiaSemana;
public class PrincipalEnum {
    public static void main(String[] args) {
        DiaSemana diaEscolhido = DiaSemana.DOMINGO;
        if (diaEscolhido.SABADO == diaEscolhido || diaEscolhido.DOMINGO == diaEscolhido) {
            System.out.println("Final de semana");
        } else {
            System.out.println("Dia útil");
        }
        
       Mes mesAtual = Mes.AGOSTO;
       switch (mesAtual) {
        case Mes.JANEIRO:
        System.out.println("Mês 1");
            break;
        case Mes.FEVEREIRO:
        System.out.println("Mês 2");
            break;
        case Mes.MARCO:
        System.out.println("Mês 3");
            break;
        case Mes.ABRIL:
        System.out.println("Mês 4");
            break;
        case Mes.MAIO:
        System.out.println("Mês 5");
            break;
        case Mes.JUNHO:
        System.out.println("Mês 6");
            break;
        case Mes.JULHO:
        System.out.println("Mês 7");
            break;
        case Mes.AGOSTO:
        System.out.println("Mês 8");
            break;
        case Mes.SETEMBRO:
        System.out.println("Mês 9");
            break;
        case Mes.OUTUBRO:
        System.out.println("Mês 10");
            break;
        case Mes.NOVEMBRO:
        System.out.println("Mês 11");
            break;
        case Mes.DEZEMBRO:
        System.out.println("Mês 12");
            break;
        default:
        System.out.println("Mês inválido");
            break;
       }
       TamanhoCalca tamanhoCalca = TamanhoCalca.Medio;
       System.out.println("Tamanho da calça: " + tamanhoCalca.getValor());
    }
 }
    

