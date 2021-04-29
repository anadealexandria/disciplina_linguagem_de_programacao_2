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
				energia += 50;
			}else if(c == 'C' || c == 'c') {
				energia += 40;
			}else if(c == 'L' || c == 'l') {
				energia += 30;
			}
		
		return energia;
	}
	
	public int brincar (char b) {
		int energia = cachorro.getEnergia();
		
			if (b == 'B' || b == 'b') {
				energia -= 30;
			}else if (b == 'S' || b == 's') {
				energia -= 20;
			}else if (b == 'G' || b == 'g') {
				energia -= 10;
			}
		
		return energia;
	}
	
	public boolean podeCruzar(Cachorro parceiro) {
		boolean idadesParaCruzar = false;
		boolean mesmaRaca = false;
		boolean possuiEnergia = false;
		boolean sexoDiferente = false;
		
		if ((cachorro.getIdade() >= 1 && cachorro.getIdade() <= 9) &&
				(parceiro.getCachorro().getIdade() >= 1 && parceiro.getCachorro().getIdade() <=9)) {
			idadesParaCruzar = true;
		}
		if (cachorro.getRaca().equals(parceiro.getCachorro().getRaca())) {
			mesmaRaca = true;
		}
		if (cachorro.getEnergia() >= 80 && parceiro.getCachorro().getEnergia() >= 80) {
			possuiEnergia = true;
		}
		if (cachorro.getSexo() != (parceiro.getCachorro().getSexo())) {
			sexoDiferente = true;
		}
		return idadesParaCruzar && mesmaRaca && possuiEnergia && sexoDiferente; 
						
	}
	
	public int cruzar(Cachorro parceiro) {
		int energiaTotalUm = cachorro.getEnergia();
		int energiaTotalDois = parceiro.getCachorro().getEnergia();
		
		if (podeCruzar(parceiro)) {
			energiaTotalUm -= 50;
			energiaTotalDois -= 50;
			cachorro.setEnergia(energiaTotalUm);
			parceiro.getCachorro().setEnergia(energiaTotalDois);
		}
		Random numeroAleatorio = new Random();
		int numeroGerado = numeroAleatorio.nextInt(9) + 1;
		return numeroGerado;
	}
	 
}
