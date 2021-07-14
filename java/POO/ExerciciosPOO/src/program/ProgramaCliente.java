package program;

import entities.Cliente;

public class ProgramaCliente {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		
		cl1.nome = "Tomas";
		cl1.idade = 21;
		cl1.endereco = "Rua Belo";
		cl1.sexo = "Masculino";
		cl1.telefone = "4002-8922";
		
		System.out.println(cl1.nome);
		System.out.println(cl1.idade);
		
		
		cl1.ativo();
		cl1.verificarIdade(cl1.idade);
		
		
	}
}
