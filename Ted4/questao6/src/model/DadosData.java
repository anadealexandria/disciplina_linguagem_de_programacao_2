package model;

public class DadosData {
	private int dia;
	private int mes;
	private int ano;
	
	public DadosData(int dia, int mes, int ano) {
		if(dia > 0 && mes > 0 && ano > 0) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public int avancarUmDia() {
		return this.dia += 1;
	}
	
	@Override
	public String toString() {
		return "A data é " + dia + "/" + mes + "/" + ano;
	}	
	
}
