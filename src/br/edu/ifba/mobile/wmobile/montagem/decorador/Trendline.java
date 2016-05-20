package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Trendline implements ICarro{

	private ICarro anterior; 
	
	public Trendline(ICarro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + "modelo Trendline";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 2000;
	}

	@Override
	public String getNome() {
		return "Trendline";
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}

}
