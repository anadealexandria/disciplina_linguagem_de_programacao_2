package model;

public class Funcionario {
	private DadosFuncionario funcionario;
	
	public Funcionario(DadosFuncionario x) {
		this.funcionario = x;
	}
	
	@Override
	public String toString() {
		return"Os dados do funcionário são:\n" + this.funcionario;
	}
}
