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
	public String forma��o;
	public boolean promovido;

	// METODOS

	public void demitido() {
		ativo = false;
		System.out.println("Parab�ns por chegar at� aqui, \nestude mais...esperamos que consiga outro trabalho logo!" + ativo);

	}

	public void promocao() {
		this.promovido = true;
		System.out.println("Parab�ns pela promo��o, continua assim!");
		System.out.println("Agora voc� � pleno");
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
