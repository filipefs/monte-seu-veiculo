package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaMetalica implements ICarro{

	private ICarro carro; 
	
	public PinturaMetalica(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " com pintura metálica";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 1384;
	}

	@Override
	public String getNome() {
		return "Metálica";
	}
	
}
