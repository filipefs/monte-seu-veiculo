package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Highline implements ICarro{

	private ICarro anterior; 
	
	public Highline(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + "modelo Highline";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 15000;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
