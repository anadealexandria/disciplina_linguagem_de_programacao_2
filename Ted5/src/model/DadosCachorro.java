package model;

public class DadosCachorro {
	private String nome;
	private String raca;
	private char sexo;
	private int idade;
	private int energia;
	private int numeroFilhotes;
	
	public DadosCachorro() {
		
	}
	
	public DadosCachorro(String nome, String raca, char sexo, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.sexo = sexo;
		this.idade = idade;
		this.energia = 100;
		this.numeroFilhotes = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getNumeroFilhotes() {
		return numeroFilhotes;
	}

	public void setNumeroFilhotes(int numeroFilhotes) {
		this.numeroFilhotes = numeroFilhotes;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\nRaça: " + raca + "\nSexo: " + sexo +
				"\nIdade: " + idade + "\nEnergia: " + this.energia + "\nNúmero de Filhotes: " + numeroFilhotes;
	}
	
	
}
