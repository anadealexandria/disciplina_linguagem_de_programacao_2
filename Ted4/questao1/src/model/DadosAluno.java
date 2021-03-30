package model;

public class DadosAluno {
	private String nome;
	private Endereco endereco;
	private String cpf;
	
	public DadosAluno(String x, Endereco y, String z) {
		this.nome = x;
		this.endereco = y;
		this.cpf = z;
	}
	
	@Override
	public String toString() {
		return nome + ", " + endereco + ", " + cpf;
	}
}
