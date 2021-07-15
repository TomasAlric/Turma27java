package Exercicios;

public class ProgramaAnimal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex ", 5);

		Cavalo horse = new Cavalo("Mimosa ", 3);

		Preguica lazy = new Preguica("Mani ", 5);

		System.out.println(dog.nome + dog.idade);

		dog.correr();

		dog.EmitirSom();

		System.out.println("------------");

		System.out.println(horse.nome + horse.idade);

		horse.EmitirSom();

		horse.correr();

		System.out.println("------------");
		
		System.out.println(lazy.nome + lazy.idade);
		
		lazy.SubiremArvores();
		
		lazy.EmitirSom();
	}
}
