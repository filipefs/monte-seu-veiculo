package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class SpaceFox implements ICarro {

	@Override
	public String getNome() {
		return "Space Fox";
	}

	@Override
	public String getDescricao() {
		return "Space Fox ";
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
