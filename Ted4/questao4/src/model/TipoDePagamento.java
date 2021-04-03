package model;

public class TipoDePagamento {
	public String tipoDePagamento;
	
	public TipoDePagamento(String tipoDePagamento) {
		this.tipoDePagamento = tipoDePagamento;
	}
	
	@Override
	public String toString() {
		return "O tipo de pagamento será por " + tipoDePagamento + ".";
	}
}
