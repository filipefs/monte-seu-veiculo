package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Comfortline implements ICarro{

	private ICarro anterior; 
	
	public Comfortline(ICarro anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + "modelo Comforline";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 8000;
	}

	@Override
	public String getNome() {	
		return "Comfortline";
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}

}
