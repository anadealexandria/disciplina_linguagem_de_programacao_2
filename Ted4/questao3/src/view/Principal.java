package view;

import java.util.Scanner;

import model.Lampada;
import model.LampadaTresEstados;

public class Principal {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			
			int escolha3;
			int escolha2;
			System.out.print("A lâmpada está acesa? 0-Não 1-Sim ");
			int escolha1 = entrada.nextInt();
			
			if(escolha1 == 0) {
				System.out.print("A lâmpada está meio acesa? 0- Não 1- Sim "); 
				escolha2 = entrada.nextInt();
				if(escolha2 == 0) {
					escolha3 = 1;
				}else {
					escolha3 = 0;
				}
			}else {
				escolha2 = 0;
				escolha3 = 0;
			}
			
			Lampada l1 = new Lampada(escolha1, escolha2, escolha3);
			
			LampadaTresEstados l2 = new LampadaTresEstados(l1);
			
			System.out.println(l2);
		}
		
	}

}
