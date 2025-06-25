package OutroPacote;

import teste1.Funcionario;

public class TesteOutroPacote {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.nome = "José"; //ok public
		//f.cargo = "Suport"; //Erro protected
		//f.setor = "TI"; //Erro default
		//f.salario = 1500; //Erro private

	}

}
