package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cachorro;
import model.DadosCachorro;

public class Casa {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
		ArrayList<Cachorro> cachorros = new ArrayList<>();
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("Bem-vindo ao cadastro de cães:\n1-Cadastrar cão;\n2-Listar cães;\nSair do programa;\n");
			int escolha = entrada.nextInt();
		
			switch (escolha) {
				case 1:
					System.out.print("Qual o primeiro nome do cãozinho?\n");
					String nome = entrada.next();
					System.out.print("Qual a raça do cãozinho?\n");
					String raca = entrada.next();
					System.out.print("Qual o sexo do cãozinho?\n");
					char sexo = entrada.next().charAt(0);
					System.out.print("Qual a idade do cãozinho?\n");
					int idade = entrada.nextInt();
				
					DadosCachorro dados = new DadosCachorro(nome, raca, sexo, idade );
					
					Cachorro cachorro = new Cachorro(dados);
					
					cachorros.add(cachorro);
					break;
					
				case 2:
					
				}
		
			}

		}
	}
	
	public void manipular_cachorro(Cachorro caoAtual, ArrayList<Cachorro> cachorros) {
		try(Scanner entrada = new Scanner(System.in)){
		
		System.out.print("\n1- Ver dados do cãozinho;\n2- Alimentar;\n3- Brincar\n4- Cruzar\n5- Menu Inicial");
		int escolha = entrada.nextInt();
		switch (escolha) {
			case 1:
		}
		
		}
	}

}











