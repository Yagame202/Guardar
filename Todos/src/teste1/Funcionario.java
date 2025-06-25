package teste1;

public class Funcionario {
	public String nome; //acessivel de qqr lugar
	protected String cargo; //no mesmo pacote e subclasses
	String setor; //acessivel dentro do mesmo pacote
	private double salario;
	
	public void mostrarDados() {
		System.out.println("Nome:" + nome);
		System.out.println("Cargo:" + cargo);
		System.out.println("Setor" + setor);
		System.out.println("Salario"+ salario);
	}
	
}
