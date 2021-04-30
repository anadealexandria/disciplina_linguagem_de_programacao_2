package model;

import java.util.Random;

public class Cachorro {
	private DadosCachorro cachorro;
	
	public Cachorro() {
		
	}
	
	public Cachorro(DadosCachorro cachorro) {
		this.cachorro = cachorro;
	}

	public DadosCachorro getCachorro() {
		return cachorro;
	}

	public void setCachorro(DadosCachorro cachorro) {
		this.cachorro = cachorro;
	}
	
	public String toString() {
		return "\nOs dados do cachorro são: " + cachorro;
	}
	
	public int comer(char c) {
		int energia = cachorro.getEnergia();
		
			if(c =='R' || c == 'r') {
				cachorro.setEnergia(energia += 50);
			}else if(c == 'C' || c == 'c') {
				cachorro.setEnergia(energia += 40);
			}else if(c == 'L' || c == 'l') {
				cachorro.setEnergia(energia += 30);
			}
		
		return energia;
	}
	
	public int brincar (char b) {
		int energia = cachorro.getEnergia();
		
			if (b == 'B' || b == 'b') {
				cachorro.setEnergia(energia -= 30);
			}else if (b == 'S' || b == 's') {
				cachorro.setEnergia(energia -= 20);
			}else if (b == 'G' || b == 'g') {
				cachorro.setEnergia(energia -= 10);
			}
		
		return energia;
	}
	
	public boolean podeCruzar(DadosCachorro parceiro) {
		boolean idadeParaCruzarCachorro = false;
		boolean idadeParaCruzarParceiro = false;
		boolean mesmaRaca = false;
		boolean possuiEnergia = false;
		boolean sexoDiferente = false;
		
		if (cachorro.getIdade() > 0 && cachorro.getIdade() < 10) {
			idadeParaCruzarCachorro = true;
		}
		if (parceiro.getIdade() > 0 && parceiro.getIdade() < 10) {
			idadeParaCruzarParceiro = true;
		}
		if (cachorro.getRaca().equals(parceiro.getRaca())) {
			mesmaRaca = true;
		}
		if (cachorro.getEnergia() >= 80 && parceiro.getEnergia() >= 80) {
			possuiEnergia = true;
		}
		if (cachorro.getSexo() != (parceiro.getSexo())) {
			sexoDiferente = true;
		}
		return idadeParaCruzarCachorro && idadeParaCruzarParceiro && mesmaRaca 
				&& possuiEnergia && sexoDiferente; 
						
	}
	
	public int cruzar(DadosCachorro parceiro) {
		int energiaTotalUm = cachorro.getEnergia();
		int energiaTotalDois = parceiro.getEnergia();
		
		if (podeCruzar(parceiro)) {
			energiaTotalUm -= 50;
			energiaTotalDois -= 50;
			cachorro.setEnergia(energiaTotalUm);
			parceiro.setEnergia(energiaTotalDois);
		}
		Random numeroAleatorio = new Random();
		int numeroGerado = numeroAleatorio.nextInt(9) + 1;
		cachorro.setNumeroFilhotes(numeroGerado);
		return numeroGerado;
	}
	 
}
