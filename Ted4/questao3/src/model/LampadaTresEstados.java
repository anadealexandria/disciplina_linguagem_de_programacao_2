package model;

public class LampadaTresEstados {
	private Lampada lampada;
	
	public LampadaTresEstados(Lampada a) {
		this.lampada = a;
	}
	
	@Override
	public String toString() {
		return "O estado da l�mpada �: " + this.lampada;
	}
}
