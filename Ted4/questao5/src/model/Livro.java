package model;

public class Livro {
	private String nome;
	private String autor;
	
	public Livro(String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return String.format("\nNome do Livro: %s \nAutor: %s", nome, autor);
	}
}
