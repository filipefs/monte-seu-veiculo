package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Highline implements ICarro{

	private ICarro carro; 
	
	public Highline(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + "Modelo Highline";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 15000;
	}

	@Override
	public String getNome() {
		return "Highline";
	}
	
}
