package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class PinturaSolida implements ICarro{

	private ICarro carro; 
	
	public PinturaSolida(ICarro carro) {
		this.carro = carro;
	}

	@Override
	public String getDescricao() {
		return this.carro.getDescricao() + " com pintura sólida";
	}

	@Override
	public double getPreco() {
		return carro.getPreco();
	}

	@Override
	public String getNome() {
		return "Sólida";
	}
	
}
