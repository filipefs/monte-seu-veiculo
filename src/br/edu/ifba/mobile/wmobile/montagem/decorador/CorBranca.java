package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorBranca implements ICarro{

	private ICarro anterior; 
	
	public CorBranca(ICarro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " branca ";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco();
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}

}
