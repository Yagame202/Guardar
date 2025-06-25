package SA;
import java.util.*;
public class Na {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	ArrayList<Integer> Arm = new ArrayList<Integer>();
	System.out.println("Digite o primeiro numero:");
	int numero1 = entrada.nextInt();
	Arm.add(numero1);
	System.out.println("Digite o primeiro numero:");
	int  numero2 = entrada.nextInt();
	Arm.add(numero2);
	
System.out.println("Soma = " +  Arm.get(0) + Arm.get(1));
	}

}
