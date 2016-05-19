package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorVermelha implements ICarro{

	private ICarro carro; 
	
	public CorVermelha(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " vermelha ";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 8000;
	}
	
}
