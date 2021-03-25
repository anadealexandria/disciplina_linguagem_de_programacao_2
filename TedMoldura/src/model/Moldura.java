package model;

public class Moldura {
	private int baseRetanguloMaior;
	private int baseRetanguloMenor;
	private int altRetanguloMaior;
	private int altRetanguloMenor;
	
	
	public Moldura(int a, int b, int c, int d) {
		this.baseRetanguloMaior = a;
		this.baseRetanguloMenor = b;
		this.altRetanguloMaior = c;
		this.altRetanguloMenor = d;
	}
	
	private int areaRetangMaior() {
		return baseRetanguloMaior * altRetanguloMaior;
	}
	
	private int areaRetangMenor() {
		return baseRetanguloMenor * altRetanguloMenor;
	}
	
	public int areaMoldura() {
		return areaRetangMaior() - areaRetangMenor();
	}
	
	@Override
	public String toString() {
		return "O valor da moldura é igual a: " + areaMoldura();
	}
}
