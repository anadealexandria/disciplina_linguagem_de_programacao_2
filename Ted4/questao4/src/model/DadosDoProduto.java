package model;

public class DadosDoProduto {
	private String nome;
	private double preco;
	private int quant;
	
	public DadosDoProduto(String a, double b, int c) {
		 this.nome = a;
		 this.preco = b;
		 this.quant = c;		 
		 
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quant + "\n";
	}
	
	public double aPagar() {
		return quant * preco;
	}
}
