package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class NovoGol implements ICarro {


	@Override
	public String getDescricao() {
		return "Novo Gol ";
	}

	@Override
	public double getPreco() {
		return 40000;
	}


	@Override
	public ICarro removerDecorador() {
		return this;
	}

}
