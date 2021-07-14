package entities;

public class Funcionario {
	// ATRIBUTOS
	public int numeroCracha;
	public int tempodeCasa;
	public boolean ativo;
	public double salario;
	public double VR;
	public double VA;
	public String cargo;
	public String formação;
	public boolean promovido;

	// METODOS

	public void demitido() {
		ativo = false;
		System.out.println("Parabéns por chegar até aqui, \nestude mais...esperamos que consiga outro trabalho logo!" + ativo);

	}

	public void promocao() {
		this.promovido = true;
		System.out.println("Parabéns pela promoção, continua assim!");
		System.out.println("Agora você é pleno");
	}

	public void aumento() {
		if (promovido == true) {
			salario = salario + (salario * 0.20);

		}
	}

	public void VRreajuste() {
		this.VR = VR + (VR * 0.15);
	}

	public void VAreajuste() {
		this.VA = VA + (VA * 0.10);
	}

}
