package br.edu.ifba.mobile.wmobile.montagem;

import br.edu.ifba.mobile.wmobile.montagem.decorador.Comfortline;
import br.edu.ifba.mobile.wmobile.montagem.decorador.ICarro;
import br.edu.ifba.mobile.wmobile.montagem.decorador.NovoGol;
import br.edu.ifba.mobile.wmobile.montagem.decorador.PinturaMetalica;

public class ExecutorTestes {

	public static void main(String[] args) {

		ICarro modelo = new NovoGol();
		modelo = new Comfortline(modelo);
		modelo = new PinturaMetalica(modelo);
		
		System.out.println(modelo.getDescricao());
		
		ICarro modelo2 = modelo.removerDecorador();
		
		System.out.println(modelo2.getDescricao());
		
	}

}
