package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class CorVermelha implements ICarro{

	private ICarro anterior; 
	
	public CorVermelha(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " vermelha ";
	}

	@Override
	public double getPreco() {
		return anterior.getPreco() + 8000;
	}

	@Override
	public String getNome() {
		return "Vermelha";
	}

	@Override
	public ICarro removerDecorador() {
		return anterior;
	}
	
}
