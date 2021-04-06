package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Emprestimo> emprestimos = new ArrayList<>();
		boolean flag = true;
		
		try(Scanner entrada = new Scanner(System.in)){
			
			while(flag) {
				System.out.print("Você deseja inserir um novo cadastro? (s/n)");
				char escolha = entrada.next().charAt(0);
			
				if(escolha == 's') {
					System.out.print("Insira o nome da pessoa (1 nome apenas): ");
					String nome = entrada.next();
					
					
					System.out.print("Insira o número de cadastro da pessoa: ");
					
					int cadastro = entrada.nextInt();
				
					Pessoa pessoa = new Pessoa(nome, cadastro);
				
					System.out.print("Qual o nome do livro? (1 nome apenas) ");
					String nomeLivro = entrada.next();
					
					
					System.out.print("Qual o nome do autor do livro? (1 nome apenas) ");					
					String nomeAutor = entrada.next();
					
					
					Livro livro = new Livro(nomeLivro, nomeAutor);
					
					Emprestimo emprestimo = new Emprestimo(pessoa, livro);
					emprestimos.add(emprestimo);
				}else {
					flag = false;
					System.out.print("Até a próxima!!");
				}
			}
			System.out.println("\n");
			System.out.print("Cadastro de empréstimos:");
			for(int i = 0; i < emprestimos.size(); i++) {
				System.out.print(emprestimos.get(i));
			}
		}

	}

}
