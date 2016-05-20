package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaPerolizada implements ICarro{

	private ICarro anterior; 
	
	public PinturaPerolizada(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " com pintura perolizada";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 1988;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
