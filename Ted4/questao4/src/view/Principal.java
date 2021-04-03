package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.DadosDoProduto;
import model.Produto;
import model.TipoDePagamento;

public class Principal {

	public static void main(String[] args) {
		ArrayList <Produto> produtos = new ArrayList<>();
		ArrayList <Double> pagamento = new ArrayList<>();
		
		try(Scanner entrada = new Scanner(System.in)){
			int cont = 0;
			double total = 0;
					
				for(int i = 0 ; i < 10 ; i++) {
					System.out.print("Qual o nome do produto que deseja comprar? ");
					String nome = entrada.next();
					
					System.out.print("Qual o preço do produto? ");
					double preco = entrada.nextDouble();
					
					System.out.print("Qual a quantidade? ");
					int quant = entrada.nextInt();
				
					DadosDoProduto produt = new DadosDoProduto(nome, preco, quant);
					
					Produto produto = new Produto(produt);
					produtos.add(produto);
					
					pagamento.add(produt.aPagar());
					
					System.out.print("Deseja continuar adicionando itens?s/n ");
					char escolha = entrada.next().charAt(0);
					
					if(escolha == 's' || escolha == 'S') {
						cont += 1;
						
					}else {
						break;
					}
				}
				System.out.print("Qual o tipo de pagamento? (cartão, dinheiro ou cheque)");
				String pague = entrada.next();
				
				TipoDePagamento pag = new TipoDePagamento(pague);
				
				for(int i = 0; i < pagamento.size(); i++) {
					total += pagamento.get(i);
				}
				System.out.println();
				System.out.print("Dados:\n");
				for(int i = 0; i < produtos.size(); i++) {
					System.out.print("Produto " + i + " :" + produtos.get(i));
					System.out.println();
				}
				System.out.println();
				System.out.print("O total a ser pago é: " + total + "\n");
				System.out.print(pag);
			}
		}

	}


