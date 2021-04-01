package view;

import java.util.Scanner;

import model.DadosFuncionario;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o nome do funcion�rio? ");
		String nome = entrada.next();
		
		System.out.print("Qual o departamento do funcion�rio? ");
		String departamento = entrada.next();
		
		System.out.print("Qual o sal�rio do funcion�rio? ");
		double salario = entrada.nextDouble();
		
		System.out.print("Qual a data de entrada? ");
		String dataEntrada = entrada.next();
		
		System.out.print("Qual o RG do funcion�rio? ");
		String rg = entrada.next();
		System.out.println();
		DadosFuncionario d1 = new DadosFuncionario(nome, departamento, salario, dataEntrada, rg);
		
		Funcionario f1 = new Funcionario(d1);
		
		System.out.println(f1);
		System.out.println();
		System.out.println("Qual o aumento recebido? ");
		double aumento = entrada.nextDouble();
		System.out.println();
		d1.recebeAumento(aumento);
		
		System.out.println(f1);
		
		System.out.println("O sal�rio anual � de: " + d1.recebeAnual());
		
		entrada.close();
	}

}
