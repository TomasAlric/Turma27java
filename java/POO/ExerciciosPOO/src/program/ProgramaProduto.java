package program;

import entities.Produto;

public class ProgramaProduto {
	public static void main(String[] args) {
		Produto prod = new Produto();
		
		prod.tensao = false;
		prod.marca = "Apple";
		prod.botao = false;
		prod.tipo = "Celular";
		prod.ligado = false;
		prod.tela = true;
		
		System.out.println("marca do produto - " + prod.marca);
		System.out.println("O tipo do produto "+ prod.tipo);
		System.out.println("O produto está ligado: "+prod.ligado);
		System.out.println("\nProduto ligando");
		prod.ligar();
		System.out.println("\nProduto desligando");
		prod.desligar();
	}
}
