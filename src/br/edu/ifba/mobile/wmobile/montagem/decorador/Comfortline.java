package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Comfortline implements ICarro{

	private ICarro carro; 
	
	public Comfortline(ICarro carro) {
		this.carro = carro;
	}
	
	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + "modelo Comforline";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 8000;
	}

	@Override
	public String getNome() {
		
		return "Comfortline";
	}

}
