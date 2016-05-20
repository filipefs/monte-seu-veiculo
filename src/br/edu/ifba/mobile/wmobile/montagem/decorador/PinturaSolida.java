package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaSolida implements ICarro{

	private ICarro anterior; 
	
	public PinturaSolida(ICarro anterior) {
		this.anterior = anterior;
	}

	@Override
	public String getDescricao() {
		return this.anterior.getDescricao() + " com pintura sólida";
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
