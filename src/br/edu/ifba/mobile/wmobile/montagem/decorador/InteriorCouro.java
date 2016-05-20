package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class InteriorCouro implements ICarro {

	private ICarro anterior; 

	public InteriorCouro(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " e acabamento interior em couro sintético.";
	}

	@Override
	public double getPreco() {
		return this.anterior.getPreco() + 1000;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}

}
