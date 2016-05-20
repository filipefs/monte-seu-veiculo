package br.edu.ifba.mobile.wmobile.montagem.decorador;

public class ModeloBasico implements ICarro {


	@Override
	public String getDescricao() {
		return "Novo Gol ";
	}

	@Override
	public double getPreco() {
		return 40000;
	}

	@Override
	public String getNome() {
		return "Novo Gol";
	}

}
