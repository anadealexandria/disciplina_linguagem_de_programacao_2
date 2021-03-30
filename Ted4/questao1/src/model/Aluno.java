package model;

public class Aluno {
	private DadosAluno aluno;
	
	public Aluno(DadosAluno a) {
		this.aluno = a;
	}
	
	public String infoAlunos() {
		return "Os dados do aluno são: " + this.aluno;
	}
	
	
}
