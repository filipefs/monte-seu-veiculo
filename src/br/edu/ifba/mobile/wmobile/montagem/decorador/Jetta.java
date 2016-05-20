package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class Jetta implements ICarro {

	@Override
	public String getNome() {
		return "Jetta";
	}

	@Override
	public String getDescricao() {
		return "Jetta ";
	}

	@Override
	public double getPreco() {
		return 80000;
	}

	@Override
	public ICarro removerDecorador() {
		return this;
	}

}
