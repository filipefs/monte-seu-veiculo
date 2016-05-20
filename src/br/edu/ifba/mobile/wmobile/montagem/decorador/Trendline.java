package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Trendline implements ICarro{

	private ICarro carro; 
	
	public Trendline(ICarro carro) {
		this.carro = carro;
	}
	
	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + "Modelo Trendline";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 2000;
	}

	@Override
	public String getNome() {
		return "Trendline";
	}

}
