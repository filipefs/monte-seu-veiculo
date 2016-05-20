package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class SpaceFox implements ICarro {

	@Override
	public String getDescricao() {
		return "SpaceFox ";
	}

	@Override
	public double getPreco() {
		return 62000;
	}

	@Override
	public ICarro removerDecorador() {
		return this;
	}

}
