package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaPerolizada implements ICarro{

	private ICarro carro; 
	
	public PinturaPerolizada(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " com pintura perolizada";
	}

	@Override
	public double getPreco() {
		return carro.getPreco() + 1988;
	}

	@Override
	public String getNome() {
		return "Perolizada";
	}
	
}
