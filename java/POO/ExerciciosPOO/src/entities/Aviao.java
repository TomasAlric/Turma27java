package entities;

public class Aviao {
	// ATRIBUTOS
	public String modelo;
	public String tipo;
	public int rodas;
	public double potenciaMotor;
	public boolean ligado;
	public int velocidade = 0;
	public boolean voando;

	// M�TODOS
	public void ligar() {
		ligado = true;
		System.out.println("Avi�o ligado");

	}

	public void desligar() {
		ligado = false;
		System.out.println("Avi�o desligado");

	}

	public void velocidade() {
		velocidade++;

	}

	public void decolando() {
		for (int i = 1; i < 300; i++) {
			velocidade();
		}
		voando = true;

	}

	public void diminuindoVelocidade() {
		this.velocidade--;
	}
	
	public void pousando() {
		for (int i = 1; i < 300; i++) {
			diminuindoVelocidade();
		}
		voando = false;

	}
}
