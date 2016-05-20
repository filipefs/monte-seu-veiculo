package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class ArCondicionado implements ICarro{

	private ICarro carro; 

	public ArCondicionado(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " e Ar-condicionado";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 2840;
	}

	@Override
	public String getNome() {
		return "Ar-condicionado";
	}
	
}
