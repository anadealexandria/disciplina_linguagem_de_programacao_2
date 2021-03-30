package view;

import java.util.Scanner;

import model.Aluno;
import model.DadosAluno;
import model.Endereco;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o nome do aluno? ");
		String nome = entrada.next();
		entrada.nextLine();
		
		System.out.print("Qual o endereço do aluno?(Rua, cep, numero) ");
		String rua = entrada.nextLine();		
		String cep = entrada.next();
		String numero = entrada.next();
		
		Endereco e1 = new Endereco(rua, cep, numero);
				
		
		System.out.println("Qual o CPF do aluno? ");
		String cpf = entrada.next();
		
		DadosAluno d1 = new DadosAluno(nome, e1, cpf);
		
		Aluno a1 = new Aluno(d1);
		
		System.out.println(a1.infoAlunos());
		
		entrada.close();
	}
}