package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaMetalica implements ICarro{

	private ICarro anterior; 
	
	public PinturaMetalica(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " com pintura metálica";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 1384;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
