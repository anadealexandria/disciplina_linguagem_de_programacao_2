package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Cachorro;
import model.DadosCachorro;

public class Casa {

	public static void main(String[] args) {
	
		try(Scanner entrada = new Scanner(System.in)){
		
		ArrayList<Cachorro> cachorros = new ArrayList<>();
		
		
		boolean flag = true;
		
		while(flag) {
			try {
				System.out.print("Bem-vindo ao cadastro de cães:\n1-Cadastrar cão;\n2-Listar cães;\n3- Sair do programa;"
					+ "\n(SÓ SERÁ ACEITO UMA DAS OPÇÕES ACIMA)\n");
				int escolha = entrada.nextInt();
			
				if (escolha != 1 && escolha != 2 && escolha != 3) {
					System.out.println("Escolha uma opção dentro do menu!!");
					System.out.println();
					continue;
					}			 
			
			
			switch (escolha) {
				case 1:
					System.out.print("Qual o primeiro nome do cãozinho?\n");
					String nome = entrada.next();
					System.out.print("Qual o primeiro nome da raça do cãozinho?(SE FOR 'VIRA-LATA' USE A "
							+ "SIGLA SRD)\n");
					String raca = entrada.next().toLowerCase();
					System.out.print("Qual o sexo do cãozinho?(F/M)\n");
					char sexo = entrada.next().charAt(0);
					System.out.print("Qual a idade do cãozinho?\n");
					int idade = entrada.nextInt();
				
					DadosCachorro dados = new DadosCachorro(nome, raca, sexo, idade );
					
					Cachorro cachorro = new Cachorro(dados);
					
					cachorros.add(cachorro);
					break;
					
				case 2:
					
					for(int i = 0 ; i < cachorros.size(); i++) {
						System.out.print("\nÍndice " + i + " " + cachorros.get(i));
						System.out.println();
					}
					if(cachorros.size() == 0) {
						System.out.println("Não há cães cadastrados!!");
						System.out.println();
						main(args);
					}else {
						System.out.println("\nSelecione um cãozinho da lista através do índice: ");
						int caoEscolhido = entrada.nextInt();					
					
						manipularCachorro(cachorros.get(caoEscolhido), cachorros );
						break;
					}
				case 3:
					System.out.println("Até a próxima!!");
					System.exit(0);
					}
				} catch(InputMismatchException e) {
					System.out.println("Digite um número!!\n Este número tem de estar dentro do menu!!");
					System.out.println();
					main(args);
					
				}
		
			}

		}
	
}
	
	public static void manipularCachorro(Cachorro caoAtual, ArrayList<Cachorro> cachorros) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Cachorro> parceiros = new ArrayList<>();
		
				
		while(true) {
		
		System.out.print("\n1- Ver dados do cãozinho;\n2- Alimentar;\n3- Brincar\n4- Cruzar\n5- Menu Inicial"
				+ "\n(SÓ SERÁ ACEITO UMA DAS OPÇÕES ACIMA)\n");
		int escolha = entrada.nextInt();
		switch (escolha) {
			case 1:
				System.out.println("\n" + caoAtual);
				break;			
				
			case 2:
				if (caoAtual.getCachorro().getEnergia() <= 50) {
					System.out.print("\nSeu cãozinho precisa comer.\nEscolha o tipo de comida:\n"
							+ "R- Ração\nC- Carne\nL- Legumes\n(SÓ SERÁ ACEITO UMA DAS OPÇÕES ACIMA)\n");
					char escolhaComida = entrada.next().charAt(0);
				
					System.out.println("A energia do seu cãozinho é: " + caoAtual.comer(escolhaComida));
				}else {
					System.out.println("\nSeu cãozinho não precisa comer!!");
				}
				break;
				
			case 3:
				if (caoAtual.getCachorro().getEnergia() >= 40) {
					System.out.print("\nEscolhas uma das opções abaixo:\nB- Buscar bolinha\nS- Saltar\nG- Girar"
							+ "\n(SÓ SERÁ ACEITO UMA DAS OPÇÕES ACIMA)\n");
					char escolhaBrincadeira = entrada.next().charAt(0);
					
					System.out.println("A energia do seu cãozinho é: " + caoAtual.brincar(escolhaBrincadeira));
				}else {
					System.out.println("\nSeu cãozinho não tem energia para brincar!");
				}
				break;
				
			case 4:
				
				for (int i = 0 ; i < cachorros.size() ; i++) {
					boolean parceirosPossiveis = caoAtual.podeCruzar(cachorros.get(i).getCachorro());
					System.out.println(parceirosPossiveis);
					if(parceirosPossiveis) {
						parceiros.add(cachorros.get(i));
					}
				}
				if (parceiros.size() == 0) {
					System.out.println("Não há parceiros disponíveis!!");
					return;
				}
				
				for (int i = 0 ; i < parceiros.size() ; i++){
					System.out.println("\nOs parceiros disponíveis para cruzar são:\n\n"
							+ "Índice " + i + " " + parceiros.get(i));
				}
				
				System.out.println("\nQual cãozinho você quer cruzar com o cão atual? (Escolha o índice) ");
				int caoParaCruzar = entrada.nextInt();
				
				caoAtual.cruzar(parceiros.get(caoParaCruzar).getCachorro());
				
				break;
		
			case 5:
				return;
				}
			
			}
		}
	}
	













