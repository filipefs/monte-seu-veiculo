package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class InteratividadeTouch implements ICarro{

	private ICarro anterior; 
	
	public InteratividadeTouch(ICarro anterior) {
		this.anterior = anterior;
	}
	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " e interatividade 'touch'";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 1780;
	}
	
	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
