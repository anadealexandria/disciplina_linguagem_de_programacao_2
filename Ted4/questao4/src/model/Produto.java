package model;

public class Produto {
	public DadosDoProduto produto;
	
	public Produto(DadosDoProduto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return "\n" + produto;
	}
	
}
