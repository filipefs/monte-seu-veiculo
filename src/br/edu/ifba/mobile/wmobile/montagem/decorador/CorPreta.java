package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorPreta implements ICarro{

	private ICarro carro; 
	
	public CorPreta(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " preta ";
	}

	@Override
	public double getPreco() {
		return carro.getPreco();
	}

	@Override
	public String getNome() {
		return "Preta";
	}
	
}
