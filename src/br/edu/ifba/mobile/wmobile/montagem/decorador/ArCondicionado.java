package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class ArCondicionado implements ICarro{

	private ICarro anterior; 

	public ArCondicionado(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return anterior.getDescricao() + " e ar-condicionado";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 2840;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
