package model;

public class Data {
	public DadosData data;
	
	public Data(DadosData data) {
		this.data = data;
	}
	
	public int avancar() {
		return this.data.avancarUmDia();
	}
	
	public String toString() {
		return "\n" + data;
	}
}
