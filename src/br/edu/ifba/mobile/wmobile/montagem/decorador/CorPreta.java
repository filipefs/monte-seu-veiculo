package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorPreta implements ICarro{

	private ICarro anterior; 
	
	public CorPreta(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " preta ";
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
