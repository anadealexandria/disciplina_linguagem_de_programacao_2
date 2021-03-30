package model;

//Criei a classe Endereço pelo fato desse atributo ser multivalorado

public class Endereco {
	private String rua;
	private String cep;
	private String numero;
	
	public Endereco(String x, String y, String z) {
		this.rua = x;
		this.cep = y;
		this.numero = z;
	}
	
	@Override
	public String toString() {
		return "Rua: " + rua + ", " + cep + ", " + numero ;
	}
}
