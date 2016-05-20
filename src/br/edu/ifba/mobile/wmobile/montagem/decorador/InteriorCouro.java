package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class InteriorCouro implements ICarro {

	private ICarro anterior; 

	public InteriorCouro(ICarro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String getNome() {
		return "Interior em couro";
	}

	@Override
	public String getDescricao() {
		return " e acabamento interior em couro sintético.";
	}

	@Override
	public double getPreco() {
		return 1000;
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}

}
