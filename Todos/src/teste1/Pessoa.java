package teste1;

public class Pessoa {
	private String nome;
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String novonome) {
		if (novonome != null && !novonome.isEmpty()) {
			nome = novonome;
		}
	}
}

