package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class InteratividadeTouch implements ICarro{

	private ICarro carro; 
	
	public InteratividadeTouch(ICarro carro) {
		this.carro = carro;
	}
	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " e Interatividade 'Touch'";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 1780;
	}
	
}
