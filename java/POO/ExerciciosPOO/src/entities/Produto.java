package entities;

public class Produto {
	
	//ATRIBUTOS
	public boolean tensao;
	public String marca;
	public String tipo;
	public boolean botao;	
	public boolean tela;
	public boolean ligado;
	
	//MÉTODOS
	public void tensao127() {
		this.tensao = false;
		System.out.println("Tensão 127V");
	}
	public void tensao220() {
		this.tensao = true;
		System.out.println("Tensão 220V");
	}
	public void ligar() {
		this.ligado = true;
		System.out.println("Produto ligado");
	}
	public void desligar() {
		this.ligado = false;
		System.out.println("Produto desligado");
	}
	
}
