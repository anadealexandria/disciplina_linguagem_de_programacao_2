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
			System.out.print("Bem-vindo ao cadastro de c�es:\n1-Cadastrar c�o;\n2-Listar c�es;\n3- Sair do programa;"
					+ "\n(S� SER� ACEITO UMA DAS OP��ES ACIMA)\n");
			int escolha = entrada.nextInt();
		
			switch (escolha) {
				case 1:
					System.out.print("Qual o primeiro nome do c�ozinho?\n");
					String nome = entrada.next();
					System.out.print("Qual o primeiro nome da ra�a do c�ozinho?(SE FOR 'VIRA-LATA' USE A "
							+ "SIGLA SRD)\n");
					String raca = entrada.next().toLowerCase();
					System.out.print("Qual o sexo do c�ozinho?(F/M)\n");
					char sexo = entrada.next().charAt(0);
					System.out.print("Qual a idade do c�ozinho?\n");
					int idade = entrada.nextInt();
				
					DadosCachorro dados = new DadosCachorro(nome, raca, sexo, idade );
					
					Cachorro cachorro = new Cachorro(dados);
					
					cachorros.add(cachorro);
					break;
					
				case 2:
					for(int i = 0 ; i < cachorros.size(); i++) {
						System.out.print("\n�ndice " + i + " " + cachorros.get(i));
						System.out.println();
					}
					
					System.out.println("\nSelecione um c�ozinho da lista atrav�s do �ndice: ");
					int caoEscolhido = entrada.nextInt();					
					
					manipularCachorro(cachorros.get(caoEscolhido), cachorros );
					break;
					
				case 3:
					System.exit(0);
					}
				}
		
			}

		}
	

	
	public static void manipularCachorro(Cachorro caoAtual, ArrayList<Cachorro> cachorros) {
		try(Scanner entrada = new Scanner(System.in)){
		ArrayList<Cachorro> parceiros = new ArrayList<>();
		
				
		while(true) {
		
		System.out.print("\n1- Ver dados do c�ozinho;\n2- Alimentar;\n3- Brincar\n4- Cruzar\n5- Menu Inicial"
				+ "\n(S� SER� ACEITO UMA DAS OP��ES ACIMA)\n");
		int escolha = entrada.nextInt();
		switch (escolha) {
			case 1:
				System.out.println("\n" + caoAtual);
				break;			
				
			case 2:
				if (caoAtual.getCachorro().getEnergia() <= 50) {
					System.out.print("\nSeu c�ozinho precisa comer.\nEscolha o tipo de comida:\n"
							+ "R- Ra��o\nC- Carne\nL- Legumes\n(S� SER� ACEITO UMA DAS OP��ES ACIMA)\n");
					char escolhaComida = entrada.next().charAt(0);
				
					System.out.println("A energia do seu c�ozinho �: " + caoAtual.comer(escolhaComida));
				}else {
					System.out.println("\nSeu c�ozinho n�o precisa comer!!");
				}
				break;
				
			case 3:
				if (caoAtual.getCachorro().getEnergia() >= 40) {
					System.out.print("\nEscolhas uma das op��es abaixo:\nB- Buscar bolinha\nS- Saltar\nG- Girar"
							+ "\n(S� SER� ACEITO UMA DAS OP��ES ACIMA)\n");
					char escolhaBrincadeira = entrada.next().charAt(0);
					
					System.out.println("A energia do seu c�ozinho �: " + caoAtual.brincar(escolhaBrincadeira));
				}else {
					System.out.println("\nSeu c�ozinho n�o tem energia para brincar!");
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
				
				for (int i = 0 ; i < parceiros.size() ; i++){
					System.out.println("\nOs parceiros dispon�veis para cruzar s�o:\n\n"
							+ "�ndice " + i + " " + parceiros.get(i));
				}
				
				System.out.println("\nQual c�ozinho voc� quer cruzar com o c�o atual? (Escolha o �ndice) ");
				int caoParaCruzar = entrada.nextInt();
				
				caoAtual.cruzar(parceiros.get(caoParaCruzar).getCachorro());
				
				break;
		
			case 5:
				return;
				}
			
			}
		}
	}
	
	public static String obterDados(Cachorro cachorro) {
		return cachorro.toString();
	}

}












