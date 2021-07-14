package program;

import entities.Aviao;

public class ProgramaAviao {
	public static void main(String[] args) {
		Aviao av = new Aviao();
		
		av.modelo = "TAM";
		av.rodas = 4;
		av.potenciaMotor = 1600;
		av.tipo = "Fuga";
		av.ligado = false;
		av.voando = false;
		av.velocidade = 0;
		
		System.out.println("velocimetro "+av.velocidade+" voando "
		+ av.voando+" ligado " +av.ligado);
		
		av.ligar();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
		
		av.velocidade();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
		
		av.decolando();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
		
		av.diminuindoVelocidade();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
		
		av.pousando();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
		
		av.desligar();
		System.out.println("velocimetro "+av.velocidade+" voando "
				+ av.voando+" ligado " +av.ligado);
	}
}
