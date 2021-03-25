package view;

import java.util.Scanner;

import model.Moldura;


public class Principal {
	public static void main(String args []) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a base do retângulo maior? ");
		int retM = entrada.nextInt();
		
		System.out.println("Qual a altura do retângulo maior? ");
		int altM = entrada.nextInt();
		
		System.out.println("Qual a base do retângulo menor? ");
		int retMe = entrada.nextInt();
		
		System.out.println("Qual a altura do retângulo menor? ");
		int altMe = entrada.nextInt();		
		
		
		Moldura m1 = new Moldura (retM, retMe, altM, altMe);
		
		System.out.println(m1);
		
		entrada.close();
	}
}
