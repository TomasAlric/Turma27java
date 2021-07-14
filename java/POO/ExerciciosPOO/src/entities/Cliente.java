package entities;

public class Cliente {

	// ATRIBUTOS
	public int idade;
	public String endereco;
	public String telefone;
	public String nome;
	public String sexo;
	public boolean atividade;

	// METÓDOS
	public void comprar() {
		System.out.println("Cliente comprando");
	}

	public void ativo() {
		this.atividade = true;
		System.out.println("Cliente ativo " + atividade);

	}

	public void inativo() {
		this.atividade = false;
		System.out.println("Cliente inativo " + atividade);

	}

	public int verificarIdade(int idade) {
		if (idade > 18) {
			System.out.println("Tem idade suficiente para realizar a compra");
		} else {
			System.out.println("Não pode efetuar a compra");
		}
		return idade;
	}
}
