package entities;

public class Produto {
	
	//ATRIBUTOS
	public boolean tensao;
	public String marca;
	public String tipo;
	public boolean botao;	
	public boolean tela;
	public boolean ligado;
	
	//M�TODOS
	public void tensao127() {
		this.tensao = false;
		System.out.println("Tens�o 127V");
	}
	public void tensao220() {
		this.tensao = true;
		System.out.println("Tens�o 220V");
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
