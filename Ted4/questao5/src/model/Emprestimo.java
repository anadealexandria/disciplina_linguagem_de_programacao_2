package model;

public class Emprestimo {
	private Pessoa pessoa;
	private Livro livro;
	
	public Emprestimo(Pessoa pessoa, Livro livro) {
		this.pessoa = pessoa;
		this.livro = livro;
	}
	
	@Override
	public String toString() {
		return "\n" + pessoa + livro;
	}
}
