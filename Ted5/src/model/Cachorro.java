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
		if (cachorro.getEnergia() <= 50) {
			if(c =='R' || c == 'r') {
				energia = cachorro.getEnergia() + 50;
			}else if(c == 'C' || c == 'c') {
				energia = cachorro.getEnergia() + 40;
			}else if(c == 'L' || c == 'l') {
				energia = cachorro.getEnergia() + 30;
			}
		}
		return energia;
	}
	
	public int brincar (char b) {
		int energia = cachorro.getEnergia();
		if (cachorro.getEnergia() >= 40) {
			if (b == 'B') {
				energia = cachorro.getEnergia() - 30;
			}else if (b == 'S') {
				energia = cachorro.getEnergia() - 20;
			}else if (b == 'G') {
				energia = cachorro.getEnergia() - 10;
			}
		}
		return energia;
	}
	
	public boolean podeCruzar(DadosCachorro parceiro) {
		boolean idadesParaCruzar = false;
		boolean mesmaRaca = false;
		boolean possuiEnergia = false;
		boolean sexoDiferente = false;
		
		if ((cachorro.getIdade() >= 1 && cachorro.getIdade() <= 9) &&
				(parceiro.getIdade() >= 1 && parceiro.getIdade() <=9)) {
			idadesParaCruzar = true;
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
		return idadesParaCruzar && mesmaRaca && possuiEnergia && sexoDiferente; 
						
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
		return numeroGerado;
	}
	 
}
