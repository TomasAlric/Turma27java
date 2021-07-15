package Exercicios;

public class Animal {
	// ATRIBUTOS
	public String nome;
	public int idade;

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// MÉTODOS
	public void correr() {
		System.out.println("O animal corre");
	}

	public void EmitirSom() {
		System.out.println("O animal emite som");
	}

}
