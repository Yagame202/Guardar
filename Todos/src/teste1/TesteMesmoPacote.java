package teste1;   

public class TesteMesmoPacote {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.nome = "Ana Banana";
		f.cargo = "Analista";
		f.setor = "TI";
		//f.salario = 2000; erro pq e privado
		f.mostrarDados();
	}

}
