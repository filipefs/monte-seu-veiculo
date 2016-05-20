package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorBranca implements ICarro{

	private ICarro carro; 
	
	public CorBranca(ICarro carro) {
		this.carro = carro;
	}
	
	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " branca ";
	}

	@Override
	public double getPreco() {
		return carro.getPreco();
	}

	@Override
	public String getNome() {
		return "Branca";
	}

}
