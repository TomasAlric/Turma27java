package program;

import entities.Funcionario;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		Funcionario Fun = new Funcionario();
		
		Fun.ativo = true;
		Fun.salario = 6200;
		Fun.cargo = "Desenvolvedor Java Junior";
		Fun.formação = "FIAP - Análise e Desenvolvimento de Sistemas";
		Fun.VR = 900;
		Fun.VA = 650;
		Fun.numeroCracha = 34510;
		
		System.out.println("Salario atual é :" + Fun.salario);
		
		
		Fun.promocao();
		
		
		Fun.aumento();
		System.out.println(Fun.salario);
		
		Fun.VRreajuste();
		System.out.println(Fun.VR);
		
		Fun.VAreajuste();
		System.out.println(Fun.VA);
		
		Fun.demitido();
		
	}
	
}
