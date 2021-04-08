package view;

import java.util.Scanner;



import model.DadosData;
import model.Data;

public class Principal {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){
			System.out.print("Digite o dia: ");
			int dia = entrada.nextInt();
			
			System.out.print("Digite o mês: ");
			int mes = entrada.nextInt();
			
			System.out.print("Digite o ano: ");
			int ano = entrada.nextInt();
			
			DadosData dado1 = new DadosData(dia, mes, ano);
			
			Data data1 = new Data(dado1);
			
			System.out.print(data1);
			System.out.println();
			System.out.print("Deseja avançar a data? (s/n)\n");
			int escolha = entrada.next().charAt(0);
			if(escolha == 's' || escolha == 'S') {
				data1.avancar();
				System.out.println(data1);
			}else {
				System.out.println(data1);
			}
		}

	}

}
