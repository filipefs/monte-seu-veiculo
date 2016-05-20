package br.edu.ifba.mobile.wmobile.montagem;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.montagem.decorador.ArCondicionado;
import br.edu.ifba.mobile.wmobile.montagem.decorador.Comfortline;
import br.edu.ifba.mobile.wmobile.montagem.decorador.CorBranca;
import br.edu.ifba.mobile.wmobile.montagem.decorador.CorPreta;
import br.edu.ifba.mobile.wmobile.montagem.decorador.CorVermelha;
import br.edu.ifba.mobile.wmobile.montagem.decorador.Highline;
import br.edu.ifba.mobile.wmobile.montagem.decorador.ICarro;
import br.edu.ifba.mobile.wmobile.montagem.decorador.InteratividadeTouch;
import br.edu.ifba.mobile.wmobile.montagem.decorador.InteriorCouro;
import br.edu.ifba.mobile.wmobile.montagem.decorador.Jetta;
import br.edu.ifba.mobile.wmobile.montagem.decorador.NovoGol;
import br.edu.ifba.mobile.wmobile.montagem.decorador.PinturaMetalica;
import br.edu.ifba.mobile.wmobile.montagem.decorador.PinturaPerolizada;
import br.edu.ifba.mobile.wmobile.montagem.decorador.PinturaSolida;
import br.edu.ifba.mobile.wmobile.montagem.decorador.SpaceFox;
import br.edu.ifba.mobile.wmobile.montagem.decorador.Trendline;

@ManagedBean(name="monte")
@SessionScoped
public class Montagem {
	
	private String email = "";
	private ICarro modelo;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String removerDecorador(String pagina){
		modelo = modelo.removerDecorador();
		return mudarPagina(pagina);
	}
	
	private String mudarPagina(String pageId){
		if(pageId.equals("versao")){
			return "modelo.ifba";
		}else if(pageId.equals("pintura")){
			return "versao.ifba";
		}else if(pageId.equals("cor")){
			return "pintura.ifba";
		}else if(pageId.equals("opcionais")){
			return "cor.ifba";
		}else{
			return "home.ifba";
		}
	}
	
	public String getImagem(){
		if(modelo.getDescricao().contains("Novo Gol")){
			return "/imgs/novogol.png";
		}else if(modelo.getDescricao().contains("SpaceFox")){
			return "/imgs/spacefox.png";
		}else if(modelo.getDescricao().contains("Jetta")){
			return "/imgs/jetta.png";
		}else{
			return "";
		}
	}
	
	public List<String> getTipoModelos(){
		List<String> listaModelos = new ArrayList<String>();
		listaModelos.add("Novo Gol");
		listaModelos.add("SpaceFox");
		listaModelos.add("Jetta");
		
		return listaModelos;
	}
	 
	public List<ICarro> getTiposModelos(){
		List<ICarro> listaModelos = new ArrayList<ICarro>();
		ICarro gol = new NovoGol();
		listaModelos.add(gol);
		
		listaModelos.get(0).getPreco();
		
		return listaModelos;
	}
	
	public List<String> getTiposVersoes(){
		List<String> listaVersoes = new ArrayList<String>();
		listaVersoes.add("Comfortline");
		listaVersoes.add("Trendline");
		listaVersoes.add("Highline");
		
		return listaVersoes;
	}
	
	public List<String> getTiposPinturas(){
		List<String> listaPinturas = new ArrayList<String>();
		listaPinturas.add("Sólida");
		listaPinturas.add("Metálica");
		listaPinturas.add("Perolizada");
		
		return listaPinturas;
	}
	
	public List<String> getOpcionais(){
		List<String> listaOpcionais = new ArrayList<String>();
		listaOpcionais.add("Interatividade touch");
		listaOpcionais.add("Ar-condicionado");
		listaOpcionais.add("Acabamento em couro");
		
		return listaOpcionais;		
	}
	
	public List<String> getCor(){
		List<String> listaCor = new ArrayList<String>();
		listaCor.add("Branca");
		listaCor.add("Preta");
		listaCor.add("Vermelha");
		
		return listaCor;
	}
	
	public void setModeloEscolhido(String escolha){
		if(escolha.equals("Novo Gol")){
			modelo = new NovoGol();
		}
		if(escolha.equals("SpaceFox")){
			modelo = new SpaceFox();
		}
		if(escolha.equals("Jetta")){
			modelo = new Jetta();
		}
	}

	public void setVersaoEscolhida(String escolha){
		if(escolha.equals("Comfortline")){
			modelo = new Comfortline(modelo);
		}
		if(escolha.equals("Trendline")){
			modelo = new Trendline(modelo);
		}
		if(escolha.equals("Highline")){
			modelo = new Highline(modelo);

		}
	}
	
	public void setPinturaEscolhida(String escolha){
		if(escolha.equals("Metálica")){
			modelo = new PinturaMetalica(modelo);
		}
		if(escolha.equals("Perolizada")){
			modelo = new PinturaPerolizada(modelo);
		}
		if(escolha.equals("Sólida")){
			modelo = new PinturaSolida(modelo);

		}
	}
	
	public void setOpcionaisEscolhidos(String escolha){
		if(escolha.equals("Interatividade touch")){
			modelo = new InteratividadeTouch(modelo);
		}
		if(escolha.equals("Ar-condicionado")){
			modelo = new ArCondicionado(modelo);
		}
		if(escolha.equals("Acabamento em couro")){
			modelo = new InteriorCouro(modelo);

		}
	}
	
	public void setCorEscolhida(String escolha){
		if(escolha.equals("Branca")){
			modelo = new CorBranca(modelo);
		}
		if(escolha.equals("Preta")){
			modelo = new CorPreta(modelo);
		}
		if(escolha.equals("Vermelha")){
			modelo = new CorVermelha(modelo);

		}
	}
		
	public ICarro getConfiguracao(){
		return modelo;
	}
	
}
