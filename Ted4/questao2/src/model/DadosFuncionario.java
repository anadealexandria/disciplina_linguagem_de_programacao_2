package model;

public class DadosFuncionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String rg;
	
	public DadosFuncionario(String a, String b, double c, String d, String e) {
		this.nome = a;
		this.departamento = b;
		this.salario = c;
		this.dataDeEntrada = d;
		this.rg = e;
	}
	
	public double recebeAumento(double x) {
		salario += x;
		return salario;
	}
	
	public double recebeAnual() {
		double total = salario * 12;
		return total;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nDepartamento: " + departamento + "\nSalário: " + salario +
				"\nData de entrada: " + dataDeEntrada + "\nRG: " + rg;
	}
}
