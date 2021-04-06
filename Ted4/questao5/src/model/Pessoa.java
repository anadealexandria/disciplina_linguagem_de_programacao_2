package model;

public class Pessoa {
	private String nome;
	private int cadastro;
	
	public Pessoa(String nome, int cadastro) {
		this.nome = nome;
		this.cadastro = cadastro;
	}
	
	@Override
	public String toString() {
		return String.format("\nNome da Pessoa: %s \nNúmero do Cadastro: %d", nome, cadastro);
	}
}
