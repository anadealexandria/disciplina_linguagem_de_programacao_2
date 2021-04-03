package model;

public class Lampada {
	private int acesa;
	private int meiaLuz;
	private int apagada;
	private boolean situacao;
	
	public Lampada(int a, int b, int c) {
		this.acesa = a;
		this.meiaLuz = b;
		this.apagada = c;
	}
	
	public boolean estaLigada() {
		if (acesa == 1 || meiaLuz == 1) {
			situacao = true;
		}else if(apagada == 1) {
			situacao = false;
		}
		return situacao;
			
	}
	
	@Override
	public String toString() {
		return  estaLigada() + " (sendo True para Ligada ou Meio Ligada"
				+ " e False para Desligada)";
	}
}
