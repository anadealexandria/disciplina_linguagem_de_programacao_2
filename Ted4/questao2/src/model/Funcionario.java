package model;

public class Funcionario {
	private DadosFuncionario funcionario;
	
	public Funcionario(DadosFuncionario x) {
		this.funcionario = x;
	}
	
	@Override
	public String toString() {
		return"Os dados do funcion�rio s�o:\n" + this.funcionario;
	}
}
